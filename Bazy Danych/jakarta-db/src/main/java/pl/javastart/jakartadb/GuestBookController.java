package pl.javastart.jakartadb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("")
public class GuestBookController extends HttpServlet {

    private BookEntryDao bookEntryDao = new BookEntryDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<BookEntry> entries = bookEntryDao.findAll();
        req.setAttribute("entries", entries);
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BookEntry bookEntry = getBookEntry(req);
        bookEntryDao.save(bookEntry);
        resp.sendRedirect(req.getContextPath() + "/");
    }

    private BookEntry getBookEntry(HttpServletRequest req) {
        String author = req.getParameter("author");
        String message = req.getParameter("message");
        return new BookEntry(author, message);
    }
}
