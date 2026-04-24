package pl.javastart.htmleditor;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("")
public class EditorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        Object text = context.getAttribute("text");
        forwardRequestWithTextAttribute(request, response, text);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String text = request.getParameter("text");
        ServletContext context = getServletContext();
        context.setAttribute("text", text);
        forwardRequestWithTextAttribute(request, response, text);
    }

    private void forwardRequestWithTextAttribute(HttpServletRequest request, HttpServletResponse response, Object text) throws ServletException, IOException {
        request.setAttribute("text", text != null ? text : "");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}