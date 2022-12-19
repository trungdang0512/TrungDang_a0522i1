<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 06/12/2022
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edit Product</title>
</head>
<body>
    <h1>Product Management</h1>
    <h2>
        <a href="product?action=list">List All Users</a>
    </h2>
    </center>
    <div align="center">
        <form method="post">
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        Edit Product
                    </h2>
                </caption>
<%--                <c:if test="${product != null}">--%>
<%--                    <input type="hidden" name="id" value="<c:out value='${product.id}' />"/>--%>
<%--                </c:if>--%>
                <tr>
                    <th>Product ID:</th>
                    <td>
                        <input type="text" name="id" size="45"
                               value="<c:out value='${product.id}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Product Name:</th>
                    <td>
                        <input type="text" name="name" size="45"
                               value="<c:out value='${product.name}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Product Price:</th>
                    <td>
                        <input type="text" name="price" size="45"
                               value="<c:out value='${product.price}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Quantity:</th>
                    <td>
                        <input type="number" name="quantity" size="15"
                               value="<c:out value='${product.quantity}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Product Color:</th>
                    <td>
                        <input type="text" name="color" size="45"
                               value="<c:out value='${product.color}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Product Description:</th>
                    <td>
                        <input type="text" name="description" size="45"
                               value="<c:out value='${product.description}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Category:</th>
                    <td>
                        <select name="category" >
                            <option value="${product.category.id}" selected/>${product.category.name}</option>
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
