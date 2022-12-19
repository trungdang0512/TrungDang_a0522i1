<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 18/12/2022
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/convert">
    <h1>Currency Conversion</h1>
    <label>
        Rate:
        <input type="text" name="rate" value="${rate}">
    </label>
    <label>
        Usd:
        <input type="text" name="usd" value="${usd}">
    </label>
    <button type="submit">Change</button>
</form>
Result: ${result}

</body>
</html>
