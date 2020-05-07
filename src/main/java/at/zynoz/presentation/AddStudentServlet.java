package at.zynoz.presentation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/students/add")
public class AddStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get");

        req.getRequestDispatcher("/WEB-INF/jsps/add-student.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String contactEmail = req.getParameter("contactEmail");
        String contactPhone = req.getParameter("contactPhone");
        String birthDate = req.getParameter("birthDate");

        String parentFirstName = req.getParameter("parentFirstName");
        String parentLastName = req.getParameter("parentLastName");
        String parentContactEmail = req.getParameter("parentContactEmail");
        String parentContactPhone = req.getParameter("parentContactPhone");

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(contactEmail);
        System.out.println(contactPhone);
        System.out.println(birthDate);
        System.out.println(parentFirstName);
        System.out.println(parentLastName);
        System.out.println(parentContactEmail);
        System.out.println(parentContactPhone);

        resp.sendRedirect("/students");
    }
}
