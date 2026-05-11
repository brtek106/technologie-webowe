package pl.javastart.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter("/secret")
public class AuthenticationFilter implements Filter {
    private static final String PASS = "h@rdPass";

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String pass = servletRequest.getParameter("pass");
        if (pass != null && pass.equals(PASS)) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            ((HttpServletResponse) servletResponse).sendError(403, "Wrong password");
        }
    }
}
