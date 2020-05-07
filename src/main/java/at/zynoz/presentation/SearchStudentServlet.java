package at.zynoz.presentation;

import at.zynoz.entity.Students;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@WebServlet("/students/search")
public class SearchStudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String searchString = req.getParameter("searchString");
        System.out.println("SearchString: " + searchString);
        List<Students> students = Collections.emptyList();
        req.setAttribute("students", students);
        req.getRequestDispatcher("/WEB-INF/jsps/browse-students.jsp").forward(req, resp);
    }
}
