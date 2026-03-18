package pl.javastart.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloController extends HttpServlet {
    public HelloController() {
        System.out.println("Konstruktor");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Metoda init");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Metoda doGet");
    }

    @Override
    public void destroy() {
        System.out.println("Metoda destroy");
    }
}