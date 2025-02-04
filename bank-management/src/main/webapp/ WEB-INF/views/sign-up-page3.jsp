<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up - Page 3: Account Type and Services</title>
    <link rel="stylesheet" href="style.css"> <!-- Ensure this path is correct -->
</head>
<body>
<div class="form-container">
    <h1>Welcome to ATM</h1>
    <img src="https://th.bing.com/th/id/R.e44c1e185cef99ea7869bdc9f3a4bf6a?rik=4lQr1NBbRnB%2beQ&riu=http%3a%2f%2fmedia.bizj.us%2fview%2fimg%2f5803721%2fbank*1200xx684-385-0-64.jpg&ehk=tKwUoJt0mcSTi3Qs5gJ9BpfKAbgp98UXLOb2XBn8Pqo%3d&risl=&pid=ImgRaw&r=0" alt="Bank Logo" class="logo"> <!-- Replace with your logo path -->
    <h2>Application Form</h2>
    <h3>Page 3: Account Type and Services</h3>
    <form action="/submit-sign-up" method="POST"> <!-- Submit the form -->
        <h4>Account Type:</h4>
        <label>
            <input type="radio" name="accountType" value="saving" required> Saving Account
        </label><br>
        <label>
            <input type="radio" name="accountType" value="fixedDeposit"> Fixed Deposit
        </label><br>
        <label>
            <input type="radio" name="accountType" value="current"> Current Account
        </label><br>
        <label>
            <input type="radio" name="accountType" value="recurringDeposit"> Recurring Deposit Account
        </label><br>

        <h4>Services Required:</h4>
        <label>
            <input type="checkbox" name="services" value="atmCard"> ATM Card
        </label><br>
        <label>
            <input type="checkbox" name="services" value="internetBanking"> Internet Banking
        </label><br>
        <label>
            <input type="checkbox" name="services" value="mobileBanking"> Mobile Banking
        </label><br>
        <label>
            <input type="checkbox" name="services" value="chequeBook"> Cheque Book
        </label><br>

        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>