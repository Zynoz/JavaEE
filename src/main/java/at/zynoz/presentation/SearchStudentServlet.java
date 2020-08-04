package at.zynoz.presentation;

//import at.zynoz.entity.Student;
import at.zynoz.entity.Student;
import at.zynoz.persistence.StudentRepository;

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
import java.util.List;
import java.util.Optional;

@WebServlet("/students/search")
public class SearchStudentServlet extends HttpServlet {

    private DataSource ds;
    private StudentRepository studentRepository;

    @Override
    public void init() {
        try {
            Context initCtx = new InitialContext();
            Context envCon = (Context) initCtx.lookup("java:comp/env");
            ds = (DataSource) envCon.lookup("jdbc/studentapp");
            studentRepository = new StudentRepository();
            System.out.println("datasource is valid");
        } catch (NamingException e) {
            e.printStackTrace();
            System.out.println("Something went wrong with the datasource");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try (Connection con = ds.getConnection()) {
            System.out.println("connected to db");
            String search = Optional.ofNullable(req.getParameter("searchString")).map(s -> s + "%").orElse("%");

            List<Student> students = ("%".equals(search)) ? studentRepository.findAll(con) : studentRepository.findAllByNameLike(con, search);

            req.setAttribute("students", students);
            req.getRequestDispatcher("WEB-INF/jsps/browse-students.jsp").forward(req, resp);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
