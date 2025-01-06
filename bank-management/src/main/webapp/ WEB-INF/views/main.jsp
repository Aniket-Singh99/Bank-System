<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Main Menu - ATM Operations</title>
    <link rel="stylesheet" href="style.css"> <!-- Ensure this path is correct -->
</head>
<body>
<div class="form-container">
    <h1>Welcome to ATM</h1>
    <img src="https://th.bing.com/th/id/R.e44c1e185cef99ea7869bdc9f3a4bf6a?rik=4lQr1NBbRnB%2beQ&riu=http%3a%2f%2fmedia.bizj.us%2fview%2fimg%2f5803721%2fbank*1200xx684-385-0-64.jpg&ehk=tKwUoJt0mcSTi3Qs5gJ9BpfKAbgp98UXLOb2XBn8Pqo%3d&risl=&pid=ImgRaw&r=0" alt="Bank Logo" class="logo"> <!-- Replace with your logo path -->
    <h2>Main Menu</h2>

    <div class="button-container">
        <button onclick="location.href='deposit.jsp'">Deposit</button>
        <button onclick="location.href='withdrawal.jsp'">Cash Withdrawal</button>
        <button onclick="location.href='fast-cash.jsp'">Fast Cash</button>
        <button onclick="location.href='mini-statement.jsp'">Mini Statement</button>
        <button onclick="location.href='pin-change.jsp'">PIN Change</button>
        <button onclick="location.href='balance-enquiry.jsp'">Balance Enquiry</button>
        <button onclick="location.href='exit.jsp'">Exit</button>
    </div>
</div>
</body>
</html>