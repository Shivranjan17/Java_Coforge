package com.coforge;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public CalculatorServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        String operation = request.getParameter("operation");

        System.out.println("num1 = " + n1);
        System.out.println("num2 = " + n2);
        System.out.println("operation = " + operation);

        if (n1 == null || n2 == null) {
            response.sendRedirect("calculator.jsp");
            return;
        }

        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);

        double result = 0;

        switch (operation) {

        case "add":
            result = num1 + num2;
            break;

        case "sub":
            result = num1 - num2;
            break;

        case "mul":
            result = num1 * num2;
            break;

        case "div":
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                request.setAttribute("message",
                        "Division by zero is not allowed");
                RequestDispatcher rd =
                        request.getRequestDispatcher("result.jsp");
                rd.forward(request, response);
                return;
            }
            break;

        default:
            request.setAttribute("message",
                    "Invalid Operation");
            RequestDispatcher rd =
                    request.getRequestDispatcher("result.jsp");
            rd.forward(request, response);
            return;
        }

        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("result", result);
        request.setAttribute("operation", operation);

        RequestDispatcher rd =
                request.getRequestDispatcher("result.jsp");

        rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd =
                request.getRequestDispatcher("calculator.jsp");

        rd.forward(request, response);
    }
}