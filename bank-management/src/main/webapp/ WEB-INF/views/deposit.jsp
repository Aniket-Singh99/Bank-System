<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="com.technoGeeks.bank_management.module.User" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Deposit - ATM</title>
    <link rel="stylesheet" href="style.css"> <!-- Ensure this path is correct -->
    <script src="script.js"></script> <!-- Include the JavaScript file -->
</head>
<body>
<div class="form-container">
    <h1>Deposit Money</h1>
    <form action="submit-deposit" method="POST"> <!-- Adjust action as needed -->
        <label for="depositAmount">Amount to Deposit:</label>
        <input type="number" id="depositAmount" name="depositAmount" placeholder="Enter amount" required>
        <button type="submit">Deposit</button>
    </form>
</div>
</body>
</html>