<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up - Page 2: Additional Details</title>
    <link rel="stylesheet" href="style.css"> <!-- Adjusted path for CSS -->
</head>
<body>
<div class="form-container">
    <h1>Welcome to ATM</h1>
    <img src="https://th.bing.com/th/id/R.e44c1e185cef99ea7869bdc9f3a4bf6a?rik=4lQr1NBbRnB%2beQ&riu=http%3a%2f%2fmedia.bizj.us%2fview%2fimg%2f5803721%2fbank*1200xx684-385-0-64.jpg&ehk=tKwUoJt0mcSTi3Qs5gJ9BpfKAbgp98UXLOb2XBn8Pqo%3d&risl=&pid=ImgRaw&r=0" alt="Bank Logo" class="logo"> <!-- Replace with your logo path -->
    <h2>Application Form</h2>
    <h3>Page 2: Additional Details</h3>
    <form action="sign-up-page3.jsp" method="GET"> <!-- Redirect to Page 3 -->
        <input type="text" name="address" placeholder="Address" required>
        <input type="text" name="phoneNumber" placeholder="Phone Number" required>
        <input type="text" name="dateOfBirth" placeholder="Date of Birth (YYYY-MM-DD)" required>
        <button type="submit">Next</button>
    </form>
</div>
</body>
</html>