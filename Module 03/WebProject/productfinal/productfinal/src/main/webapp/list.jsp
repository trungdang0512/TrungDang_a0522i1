<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 05/12/2022
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Products Managerment</title>
</head>
<body>
<center>
  <h1>Products Management</h1>
  <h2>
    <a href="/product?action=create">Add New Product</a>
  </h2>
<%--  <form action="/users" method="get">--%>
<%--    <h2>--%>
<%--      <input type="text" name="findid" id="findid" size="15" >--%>
<%--      <input type="hidden" name="action" value="selectbyid">--%>
<%--      <button type="submit">Find By ID</button>--%>
<%--    </h2>--%>
<%--  </form>--%>
  <form action="/product" method="get">
    <h2>
      <input type="text" name="inputname" id="inputname" size="15" >
      <input type="hidden" name="action" value="findbyname">
      <button type="submit">Find By Name</button>
    </h2>
  </form>

</center>
<div align="center">
  <table border="1" cellpadding="5">
    <caption><h2>List of Product</h2></caption>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Price</th>
      <th>Quatinty</th>
      <th>Color</th>
      <th>Description</th>
      <th>Category</th>
      <th>Funtion</th>
    </tr>
    <c:forEach var="product" items="${products}">
      <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.price}</td>
        <td>${product.quantity}</td>
        <td>${product.color}</td>
        <td>${product.description}</td>
        <td>${product.category.name}</td>
        <td>
          <a href="/product?action=edit&id=${product.id}">Edit</a>
          <a href="/product?action=delete&id=${product.id}">Delete</a>
        </td>
      </tr>
    </c:forEach>
  </table>
</div>
<%--<center>--%>
<%--  <form action="/users" method="get">--%>
<%--    <h2>--%>
<%--      <input type="hidden" name="action" value="orderByName">--%>
<%--      <button type="submit">Re-Arrange List By Name</button>--%>
<%--    </h2>--%>
<%--  </form>--%>
<%--</center>--%>

</body>
</html>
