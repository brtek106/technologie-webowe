package pl.javastart.params;

import java.io.*;
import java.util.Collections;
import java.util.Enumeration;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/browser")
public class BrowserCheckController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        printUserAgent(request);
        System.out.println("-------");
        printAllHeaders(request);
    }

    private void printAllHeaders(HttpServletRequest request) {
        System.out.println("Wszystkie nagłówki:");
        Enumeration<String> headerNames = request.getHeaderNames();
        Collections.list(headerNames).stream()
                .map(name -> name + " " + request.getHeader(name))
                .forEach(System.out::println);
    }

    private static void printUserAgent(HttpServletRequest request) {
        String userAgent = request.getHeader("user-agent");
        System.out.println("Przeglądarka klienta: " + userAgent);
    }

}