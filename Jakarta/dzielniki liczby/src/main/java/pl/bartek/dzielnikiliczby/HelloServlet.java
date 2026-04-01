package pl.bartek.dzielnikiliczby;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String number = request.getParameter("number");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");

        writer.println("</body>");
        writer.println("</html>");
    }
}