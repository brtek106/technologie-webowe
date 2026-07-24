package pl.javastart.readstack.client.discovery;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HttpMethodConstraint;
import jakarta.servlet.annotation.ServletSecurity;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pl.javastart.readstack.domain.api.CategoryName;
import pl.javastart.readstack.domain.api.CategoryService;
import pl.javastart.readstack.domain.api.DiscoverySaveRequest;
import pl.javastart.readstack.domain.api.DiscoveryService;

import java.io.IOException;
import java.util.List;

@WebServlet("/discovery/add")
@ServletSecurity(
        httpMethodConstraints = {
                @HttpMethodConstraint(value = "GET", rolesAllowed = "USER"),
                @HttpMethodConstraint(value = "POST", rolesAllowed = "USER")
        }
)
public class AddDiscoveryController extends HttpServlet {
    private CategoryService categoryService = new CategoryService();
    private DiscoveryService discoveryService = new DiscoveryService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<CategoryName> categories = categoryService.findAllCategoryNames();
        req.setAttribute("categories", categories);
        req.getRequestDispatcher("/WEB-INF/views/add-discovery.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DiscoverySaveRequest saveRequest = createSaveRequest(req);
        discoveryService.add(saveRequest);
        resp.sendRedirect(req.getContextPath() + "/");
    }

    private DiscoverySaveRequest createSaveRequest(HttpServletRequest request) {
        String loggedInUsername = request.getUserPrincipal().getName();
        return new DiscoverySaveRequest(
                request.getParameter("title"),
                request.getParameter("url"),
                request.getParameter("description"),
                Integer.valueOf(request.getParameter("categoryId")),
                loggedInUsername
        );
    }
}
