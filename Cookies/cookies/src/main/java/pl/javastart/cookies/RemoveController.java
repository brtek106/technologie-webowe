package pl.javastart.cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/remove")
public class RemoveController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie removeVisitCookie = new Cookie("visits", "");
        removeVisitCookie.setMaxAge(0);
        resp.addCookie(removeVisitCookie);
        req.getRequestDispatcher("/removeConfirm.jsp").forward(req, resp);
    }
}
