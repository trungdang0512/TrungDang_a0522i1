<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 5/31/2022
  Time: 09:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/student/create" method="post">
    <label>Code student</label>
    <input type="text" name="codeStudent"/><br>
    <label>Name student</label>
    <input type="text" name="nameStudent"/><br>
    <label>Point</label>
    <input type="text" name="point"/><br>
    <label>Gender</label>
    <input name="gender" type="text">
    <button type="submit">Create</button>
</form>
</body>
</html>
