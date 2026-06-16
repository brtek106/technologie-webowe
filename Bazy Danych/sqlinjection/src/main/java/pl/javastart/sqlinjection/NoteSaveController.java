package pl.javastart.sqlinjection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/save")
public class NoteSaveController extends HttpServlet {

    private final NoteDao noteDao = new NoteDao();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Note note = getNoteFromParameters(req);
        noteDao.save(note);
        req.setAttribute("note", note);
        req.getRequestDispatcher("/WEB-INF/confirm.jsp").forward(req, resp);
    }

    private Note getNoteFromParameters(HttpServletRequest req) {
        String title = req.getParameter("title");
        String password = req.getParameter("password");
        String content = req.getParameter("content");
        return new Note(title, password, content);
    }
}
