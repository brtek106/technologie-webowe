package pl.bartek.password;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@WebServlet("/verify")
public class PasswordVerification extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Password password = createPasswordFromRequest(request);
        sendResponse(password, response, request);
    }

    private Password createPasswordFromRequest(HttpServletRequest request) {
        Password password = new Password();
        password.setPassword(request.getParameter("password"));
        return password;
    }

    private void sendResponse(Password password, HttpServletResponse response, HttpServletRequest request) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.printf("<h1>Twoje hasło to: %s</h1>", password.getPassword());
        getPassword(request, response);
        writer.println("</body>");
        writer.println("</html>");
    }

    private void getPassword(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        if (!containsLowerCase(password)) {
            writer.println("Hasło powinno zawierać conajmniej jedną małą literę.<br>");
        }
        if (!containsUpperCase(password)) {
            writer.println("Hasło powinno zawierać conajmniej jedną wielką literę.<br>");
        }
        if (!containsDigit(password)) {
            writer.println("Hasło powinno zawierać conajmniej jedną cyfrę.<br>");
        }
        if (password.length() < 5) {
            writer.println("Hasło powinno mieć conajmniej 5 znaków.");
        }
    }

    public boolean containsLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean containsUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
