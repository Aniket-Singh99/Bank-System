<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mini Statement - ATM</title>
    <link rel="stylesheet" href="style.css"> <!-- Ensure this path is correct -->
    <script src="script.js"></script> <!-- Include the JavaScript file -->
</head>
<body>
<div class="form-container">
    <h1>Mini Statement</h1>
    <p>Your last 5 transactions are displayed below:</p>
    <ul>
        <li>Transaction 1: $100 Deposit</li>
        <li>Transaction 2: $50 Withdrawal</li>
        <li>Transaction 3: $200 Deposit</li>
        <li>Transaction 4: $20 Withdrawal</li>
        <li>Transaction 5: $500 Deposit</li>
    </ul>
    <button onclick="location.href='main.jsp'">Back to Main Menu</button> <!-- Change to main.jsp if needed -->
</div>
</body>
</html>