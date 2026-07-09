<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
<style>
    body{
        font-family: Arial;
    }
 
    .container{
        width:300px;
        margin:auto;
        border:2px solid black;
        padding:20px;
        text-align:center;
    }
 
    input{
        width:180px;
        height:30px;
        margin:10px;
    }
 
    button{
        width:50px;
        height:40px;
        font-size:20px;
        margin:5px;
    }
</style>
</head>
<body>
 
<div class="container">
 
<h2>Calculator</h2>
 
<form action="CalculatorServlet" method="post">
 
First Number<br>
<input type="number" name="num1" required><br>
 
Second Number<br>
<input type="number" name="num2" required><br><br>
 
<button type="submit" name="operation" value="add">+</button>
 
<button type="submit" name="operation" value="sub">-</button>
 
<button type="submit" name="operation" value="mul">*</button>
 
<button type="submit" name="operation" value="div">/</button>
 
</form>
 
</div>
 
</body>
</html>