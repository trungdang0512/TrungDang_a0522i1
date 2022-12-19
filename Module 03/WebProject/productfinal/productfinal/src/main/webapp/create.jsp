<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 05/12/2022
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Add Products</title>
</head>
<body>
    <h1>Product Management</h1>
    <h2>
        <a href="product?action=list">List All Products</a>
    </h2>
    </center>
    <div align="center">
        <form method="post">
            <table border="1" cellpadding="5">
                <caption>
                    <h2>Add New Product</h2>
                </caption>
                <tr>
                    <th>Product ID:</th>
                    <td>
                        <input type="text" name="id" id="id" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>Product Name:</th>
                    <td>
                        <input type="text" name="name" id="name" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>Product Price:</th>
                    <td>
                        <input type="text" name="price" id="price" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>Product Quantity:</th>
                    <td>
                        <input type="number" name="quantity" id="quantity" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>Product Color:</th>
                    <td>
                        <input type="text" name="color" id="color" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>Product Description:</th>
                    <td>
                        <input type="text" name="des" id="des" size="45"/>
                    </td>
                </tr>
                <tr>
                    <th>Product Category:</th>
                    <td>
                        <select name="category">
                            <c:forEach items="${categories}" var="category">
                                <option value="${category.id}">${category.name}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>