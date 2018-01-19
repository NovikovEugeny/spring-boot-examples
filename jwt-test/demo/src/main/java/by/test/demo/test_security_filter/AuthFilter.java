package by.test.demo.test_security_filter;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;

public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter");
        Cookie[] cookies = ((HttpServletRequest) servletRequest).getCookies();

        boolean b = false;

        if (cookies != null) {
            b = Arrays.stream(cookies).anyMatch(
                    item -> item.getValue().equals("test-token")
            );
        }

        if (b) {
            System.out.println("authenicate");
        } else {
            System.out.println("anonim");
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
