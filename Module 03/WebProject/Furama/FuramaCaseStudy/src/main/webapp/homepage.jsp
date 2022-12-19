<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 30/11/2022
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>HomePage</title>
    <style>
        .marginHeader{
            margin: auto;
            padding: 20px;
        }
        div{
            border: black 1px;
            background-color: darkseagreen;
        }

    </style>
</head>
<body>
<div style="height: 100px">
    <header style="align: center">
        <img class="marginHeader" src="https://furamavietnam.com/wp-content/uploads/2018/10/logo.png" width="50px" style="float: left">
        <p class="marginHeader" style="float: right; font-size: 20px">Guest</p>
    </header>
</div>
<div>
    <form>
        <center>
        <a class="marginHeader" href="">Home</a>
        <a class="marginHeader" href="">Employee</a>
        <a class="marginHeader" href="">Customer</a>
        <a class="marginHeader" href="">Service</a>
        <a class="marginHeader" href="">Contact</a>
        <input type="text" name="search" size="20px">
        <button type="submit" >Search</button>
        </center>
    </form>
</div>

<nav></nav>
<div>
    <aside id="left">

    </aside>
</div>

<div style="float: left">


</div>


</body>
</html>
