package pl.javastart.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter("/*")
public class SecurityLoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log(servletRequest);
    }

    private void log(ServletRequest servletRequest) {
        String ip = servletRequest.getRemoteAddr();
        String userAgent = ((HttpServletRequest) servletRequest).getHeader("user-agent");
        System.out.println(ip + " >> " + userAgent);
    }
}
