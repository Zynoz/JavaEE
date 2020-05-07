package at.zynoz.presentation;

import at.zynoz.entity.Students;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@WebServlet("/students")
public class BrowseStudentsServlet extends HttpServlet {

    private DataSource ds;

    @Override
    public void init() throws ServletException {
        try {
            Context initCtx = new InitialContext();
            Context envCon = (Context) initCtx.lookup("java:comp/env");
            ds = (DataSource) envCon.lookup("jdbc/studentapp");
            System.out.println("datasource is valid");
        } catch (NamingException e) {
            e.printStackTrace();
            System.out.println("Something went wrong with the datasource");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (Connection con = ds.getConnection()) {
            System.out.println("connected to db");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        List<Students> students = Collections.emptyList();
        Students students1 = new Students();
        Students students2 = new Students();
        Students students3 = new Students();
        Students students4 = new Students();

        req.setAttribute("students", students);

        req.getRequestDispatcher("/WEB-INF/jsps/browse-students.jsp").forward(req, resp);
    }
}
