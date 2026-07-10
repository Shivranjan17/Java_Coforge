package com.coforge.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    Connection con = null;

    @Override
    public void init() throws ServletException {

        try {

            ServletContext context = getServletContext();

            Class.forName(context.getInitParameter("driver"));

            con = DriverManager.getConnection(
                    context.getInitParameter("url"),
                    context.getInitParameter("uname"),
                    context.getInitParameter("pwd"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        try {

            PreparedStatement ps =
                    con.prepareStatement(
                    "update customer set cname=?,city=? where cid=?");

            ps.setString(1,
                    request.getParameter("cname"));

            ps.setString(2,
                    request.getParameter("city"));

            ps.setInt(3,
                    Integer.parseInt(
                    request.getParameter("cid")));

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("CustomerDetailsServlet");
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
}