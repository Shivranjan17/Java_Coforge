package com.coforge.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.coforge.model.Customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CustomerDetailsServlet")
public class CustomerDetailsServlet extends HttpServlet {

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

            System.out.println("CustomerDetailsServlet DB Connected");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Customer> customerList = new ArrayList<>();

        try {

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "select * from customer");

            while (rs.next()) {

                Customer c = new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));

                customerList.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("customerList", customerList);

        RequestDispatcher rd =
                request.getRequestDispatcher("details.jsp");

        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }
}