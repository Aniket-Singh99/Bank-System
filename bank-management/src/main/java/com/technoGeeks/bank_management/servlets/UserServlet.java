package com.technoGeeks.bank_management.servlets;




import com.fasterxml.jackson.databind.ObjectMapper;
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

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    @Autowired
    private CombinedDAO combinedDAO;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("register".equals(action)) {
            // Handle user registration (signup)
            String formNo = request.getParameter("formno");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String pinCode = request.getParameter("pin_code");
            String state = request.getParameter("state");
            String name = request.getParameter("name");
            String fatherName = request.getParameter("father_name");
            String dob = request.getParameter("dob");
            String gender = request.getParameter("gender");
            String email = request.getParameter("email");
            String maritalStatus = request.getParameter("marital_status");

            // Create a new Signup object
            Signup signup = new Signup();
            signup.setFormno(formNo);
            signup.setAddress(address);
            signup.setCity(city);
            signup.setPin_code(pinCode);
            signup.setState(state);
            signup.setName(name);
            signup.setFather_name(fatherName);
            signup.setDob(dob);
            signup.setGender(gender);
            signup.setEmail(email);
            signup.setMarital_status(maritalStatus);

            // Add the signup to the database
            combinedDAO.addSignup(signup);
            response.getWriter().write("User  registered successfully!");
        } else if ("login".equals(action)) {
            // Handle user login validation
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
        // Handle GET requests, e.g., retrieving all users (signups)
        List<Signup> signups = combinedDAO.getAllSignups();
        response.setContentType("application/json");

        // Convert the list of signups to JSON format
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonResponse = objectMapper.writeValueAsString(signups);
        response.getWriter().write(jsonResponse);
    }
}