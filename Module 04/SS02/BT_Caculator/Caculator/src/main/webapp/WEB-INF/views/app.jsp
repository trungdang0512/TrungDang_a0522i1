<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 19/12/2022
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator App</title>
</head>
<body>
<h1>Caculator App</h1>
<form action="/caculate" method="get">
    <input type="number" name="firstNumber">
    <input type="number" name="secondNumber"><br>
    <br>
    <input type="submit" name="operator" value="Addition(+)">
    <input type="submit" name="operator" value="Subtraction(-)">
    <input type="submit" name="operator" value="Multiplication(x)">
    <input type="submit" name="operator" value="Division(/)">
</form>
<h1>Result: ${result}</h1>

</body>
</html>
