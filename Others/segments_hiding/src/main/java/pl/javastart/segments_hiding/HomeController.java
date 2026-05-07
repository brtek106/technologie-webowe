package pl.javastart.segments_hiding;

import java.io.*;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("")
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> products = List.of("sukienki", "torebki", "spodnie", "buty");
        req.setAttribute("products", products);
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
}