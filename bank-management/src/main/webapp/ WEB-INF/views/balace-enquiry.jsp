<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration and Login</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>User Registration</h2>
    <form action="user" method="post">
        <input type="hidden" name="action" value="register">
        <div class="form-group">
            <label for="formno">Form No:</label>
            <input type="text" class="form-control" id="formno" name="formno" required>
        </div>
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" id="name" name="name" required>
        </div>
        <div class="form-group">
            <label for="father_name">Father's Name:</label>
            <input type="text" class="form-control" id="father_name" name="father_name" required>
        </div>
        <div class="form-group">
            <label for="dob">Date of Birth:</label>
            <input type="date" class="form-control" id="dob" name="dob" required>
        </div>
        <div class="form-group">
            <label for="gender">Gender:</label>
            <select class="form-control" id="gender" name="gender" required>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="address">Address:</label>
            <input type="text" class="form-control" id="address" name="address" required>
        </div>
        <div class="form-group">
            <label for="city">City:</label>
            <input type="text" class="form-control" id="city" name="city" required>
        </div>
        <div class="form-group">
            <label for="state">State:</label>
            <input type="text" class="form-control" id="state" name="state" required>
        </div>
        <div class="form-group">
            <label for="pin_code">Pin Code:</label>
            <input type="text" class="form-control" id="pin_code" name="pin_code" required>
        </div>
        <button type="submit" class="btn btn-primary">Register</button>
    </form>

    <h2 class="mt-5">User  Login</h2>
    <form action="user" method="post">
        <input type="hidden" name="action" value="login">
        <div class="form-group">
            <label for="cardnumber">Card Number:</label>
            <input type="text" class="form-control" id="cardnumber" name="cardnumber" required>
        </div>
        <div class="form-group">
            <label for="pin">PIN:</label>
            <input type="password" class="form-control" id="pin" name="pin" required>
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>