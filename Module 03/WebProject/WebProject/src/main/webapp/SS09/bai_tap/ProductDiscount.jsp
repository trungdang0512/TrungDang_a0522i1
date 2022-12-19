<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 18/11/2022
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Product Discount </title>
</head>
<body>
<h1>Product Discount </h1>
  <form action="/discount" method="post">
    <table border="1">
      <tr>
        <td>Product Description</td>
        <td><input type="text" name="productDes"></td>
      </tr>
      <tr>
        <td>List Price</td>
        <td><input type="number" name="price"></td>
      </tr>
      <tr>
        <td>Discount Percent</td>
        <td><input type="number" name="discount"></td>
      </tr>
      <tr>
        <td><input type="submit" value="Calculate Discount">
        <input type="reset" value="Reset"></td>
      </tr>
    </table>
  </form>
</body>
</html>
