<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 24/12/2022
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mail</title>
</head>
<body>
<h2>Mail</h2>
<a href="/edit">Edit</a>
<table border="1">
    <tr>
        <td>Language: </td>
        <td>${language}</td>
    </tr>
    <tr>
        <td>Page size: </td>
        <td>${pageSize}</td>
    </tr>
    <tr>
        <td>Spams filter: </td>
        <td>${enableSpam}</td>
    </tr>
    <tr>
        <td>Signature: </td>
        <td>${signature}</td>
    </tr>
</table>
</body>
</html>
