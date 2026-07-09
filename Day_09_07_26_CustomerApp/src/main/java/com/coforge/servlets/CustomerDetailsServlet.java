package com.coforge.servlets;

import java.io.IOException;
import java.util.ArrayList;

import com.coforge.model.Customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerDetailsServlet
 */
@WebServlet("/CustomerDetailsServlet")
public class CustomerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CustomerDetailsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

			ArrayList<Customer> customerList = new ArrayList<>();
			
			customerList.add(new Customer(101, "Amit Sharma", "Mumbai"));
			customerList.add(new Customer(102, "Priya Singh", "Delhi"));
			customerList.add(new Customer(103, "Rahul Verma", "Pune"));
			customerList.add(new Customer(104, "Neha Gupta", "Bangalore"));
			customerList.add(new Customer(105, "Vikram Patel", "Ahmedabad"));
			customerList.add(new Customer(106, "Sneha Joshi", "Hyderabad"));
			customerList.add(new Customer(107, "Rohit Kumar", "Chennai"));
			customerList.add(new Customer(108, "Anjali Mishra", "Kolkata"));
			customerList.add(new Customer(109, "Karan Mehta", "Jaipur"));
			customerList.add(new Customer(110, "Pooja Jain", "Lucknow"));
			request.setAttribute("customerList", customerList);
			RequestDispatcher rd = request.getRequestDispatcher("details.jsp");
			
			rd.forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
