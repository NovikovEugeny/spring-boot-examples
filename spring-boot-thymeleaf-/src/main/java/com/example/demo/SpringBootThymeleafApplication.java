package com.example.demo;

import com.example.demo.listener.SessionListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.io.IOException;

@SpringBootApplication
public class SpringBootThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootThymeleafApplication.class, args);
    }

/* one of the way of creating filters and listeners
    @Bean
    public Filter myFilter() {
        return new Filter() {

            @Override
            public void init(FilterConfig filterConfig) throws ServletException {
            }

            @Override
            public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                System.out.println("new filter");
                chain.doFilter(request, response);
            }

            @Override
            public void destroy() {
            }

        };
    }

    @Bean
    public ServletContextListener myListener() {
        return new ServletContextListener() {

            @Override
            public void contextInitialized(ServletContextEvent sce) {
                System.out.println("start app");
            }

            @Override
            public void contextDestroyed(ServletContextEvent sce) {
            }

        };
    }

    @Bean
    public HttpSessionListener myListener2() {

        return new HttpSessionListener() {


            @Override
            public void sessionCreated(HttpSessionEvent httpSessionEvent) {
                System.out.println("session created");
            }

            @Override
            public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

            }
        };
    }
    */
}
