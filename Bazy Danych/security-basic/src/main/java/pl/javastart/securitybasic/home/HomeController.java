package pl.javastart.securitybasic.home;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HttpConstraint;
import jakarta.servlet.annotation.ServletSecurity;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.security.Principal;

@WebServlet("")
@ServletSecurity(
        @HttpConstraint(rolesAllowed = {"user_role", "admin_role"})
)
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Principal userPrincipal = req.getUserPrincipal();
        System.out.println(userPrincipal.getName());
        System.out.println(req.isUserInRole("user_role"));
        System.out.println(req.isUserInRole("admin_role"));
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
}
