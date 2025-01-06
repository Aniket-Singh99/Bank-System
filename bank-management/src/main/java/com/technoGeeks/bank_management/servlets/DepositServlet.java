package com.technoGeeks.bank_management.servlets;




import com.technoGeeks.bank_management.dao.CombinedDAO;
import com.technoGeeks.bank_management.module.Login;
import com.technoGeeks.bank_management.module.Signup;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

@WebServlet("/bank")
public class DepositServlet extends HttpServlet {

    @Autowired
    private CombinedDAO combinedDAO;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("addSignup".equals(action)) {
            // Handle adding a new signup
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            // Create a new Signup object (assuming you have a constructor)
            Signup signup = new Signup();
            signup.setName(name);
            signup.setEmail(email);
            combinedDAO.addSignup(signup);
            response.getWriter().write("Signup added successfully!");
        } else if ("validateLogin".equals(action)) {
            // Handle login validation
            String cardNumber = request.getParameter("cardnumber");
            String pin = request.getParameter("pin");
            Login login = combinedDAO.validateLogin(cardNumber, pin);
            if (login != null) {
                response.getWriter().write("Login successful!");
            } else {
                response.getWriter().write("Invalid card number or PIN.");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle GET requests, e.g., retrieving all signups
        List<Signup> signups = combinedDAO.getAllSignups();
        response.setContentType("application/json");
        response.getWriter().write(signups.toString()); // Convert to JSON as needed
    }
}