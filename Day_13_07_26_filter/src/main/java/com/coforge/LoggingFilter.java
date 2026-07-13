package com.coforge;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
 
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
 
@WebFilter("/*")     // Applies to all requests
public class LoggingFilter extends HttpFilter implements Filter {
 
    private static final long serialVersionUID = 1L;
 
    public LoggingFilter() {
        super();
    }
 
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Logging Filter Initialized...");
    }
 
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
 
        HttpServletRequest req = (HttpServletRequest) request;
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
 
        System.out.println("-----------Logs---------------");
        System.out.println("<h2>Request Logs</h2>");
        System.out.println("Start Time:" + LocalDateTime.now());
        System.out.println("URL" + req.getRequestURL());
        System.out.println("Method:" + req.getMethod());
        System.out.println("Remote Address:" + req.getRemoteAddr());
       // System.out.println("<hr>");
 
        // Pass request to the next filter/servlet
        chain.doFilter(request, response);
 
       // out.println("<hr>");
        System.out.println("End Time:" + LocalDateTime.now());
        //out.println("<hr>");
    }
 
    @Override
    public void destroy() {
        System.out.println("Logging Filter Destroyed...");
    }
}