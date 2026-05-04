package pl.bartek.textchat;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("")
public class MessageController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Message message = createMessage(req);
        saveMessageInHistory(message, req);
        resp.sendRedirect(req.getContextPath());
    }

    private Message createMessage(HttpServletRequest request) {
        String author = request.getParameter("author");
        String messageText = request.getParameter("message");
        return new Message(author, messageText);
    }

    private void saveMessageInHistory(Message message, HttpServletRequest req) {
        ServletContext context = getServletContext();
        List<Message> messageHistory = (List<Message>) context.getAttribute("messageHistory");
        if (messageHistory == null) {
            messageHistory = new ArrayList<>();
        }
        messageHistory.add(message);
        context.setAttribute("messageHistory", messageHistory);
    }


}
