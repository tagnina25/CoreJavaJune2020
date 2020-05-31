<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="style.css" type="text/css" rel="stylesheet">
<title>LogIn Form</title>

</head>
<body>
<h1><center>AMC Theaters</center></h1>

<header>
<nav>
<ul>
<li><a href="MovieServlet">Movies</a></li>
<li><a href="addAccountForm">Create an Account</a></li> 
<li><a href="LogInForm">Log In </a></li> 
<li><a href="cart.jsp" id="cartLogo"><img src="images/cart2.png" alt="" id="cartLogo"/></a></li>
</ul>
</nav>

</header>
<br>
<h2><center>Log into AMC</center></h2>

<form name=addForm action=readLogIn method=post>

<br>
<label>UserName(Email Address):</label>
<input type ="text" name="emailAddress" placeholder="email address" required> 
<br><br> 

<label>Password:</label>
<input type = "password" name="password" placeholder="password" required>
<br><br>
<input type="submit" name="submit" value="Log In"/>
<br>
${errorMessage}
</form>


</body>
</html>