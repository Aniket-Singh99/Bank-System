<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fast Cash - ATM</title>
    <link rel="stylesheet" href="style.css"> <!-- Ensure this path is correct -->
    <script src="script.js"></script> <!-- Include the JavaScript file -->
</head>
<body>
<div class="form-container">
    <h1>Fast Cash</h1>
    <form action="submit-fast-cash" method="POST"> <!-- Adjust action as needed -->
        <label for="fastCashAmount">Select Amount:</label>
        <select id="fastCashAmount" name="fastCashAmount" required>
            <option value="20">20</option>
            <option value="50">50</option>
            <option value="100">100</option>
            <option value="200">200</option>
            <option value="500">500</option>
        </select>
        <button type="submit">Withdraw</button>
    </form>
</div>
</body>
</html>