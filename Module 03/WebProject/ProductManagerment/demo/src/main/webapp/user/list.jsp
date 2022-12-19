<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 23/11/2022
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/users?action=create">Add New User</a>
    </h2>
    <form action="/users" method="get">
    <h2>
        <input type="text" name="findid" id="findid" size="15" >
        <input type="hidden" name="action" value="selectbyid">
        <button type="submit">Find By ID</button>
    </h2>
    </form>
<%--cách 1:--%>
<%--        <h2>--%>
<%--            <input type="text" name="inputcountry" id="inputcountry" size="15" >--%>
<%--            <a onclick="test()" id="a" href="#">Find By Country</a>--%>
<%--        </h2>--%>
<%--cách 2:    --%>
        <form action="/users" method="get">
    <h2>
        <input type="text" name="inputcountry" id="inputcountry" size="15" >
        <input type="hidden" name="action" value="findbycountry">
        <button type="submit">Find By Country</button>
    </h2>
        </form>

</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.country}</td>
                <td>
                    <a href="/users?action=edit&id=${user.id}">Edit</a>
                    <a href="/users?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<center>
    <form action="/users" method="get">
        <h2>
            <input type="hidden" name="action" value="orderByName">
            <button type="submit">Re-Arrange List By Name</button>
        </h2>
    </form>
</center>
<%--cách 1:--%>
<%--<script>--%>
<%--    function test(){--%>
<%--        const c=  document.getElementById("inputcountry").value;--%>
<%--        alert("/users?action=findbycountry&country="+c);--%>
<%--        document.getElementById("a").href = "/users?action=findbycountry&country="+c;--%>
<%--    }--%>
<%--</script>--%>
</body>
</html>
