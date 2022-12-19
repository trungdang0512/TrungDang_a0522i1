<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 09/12/2022
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Edit</title>
</head>
<body>
<%--<h2>--%>
<%--  <a href="product?action=list">List All Users</a>--%>
<%--</h2>--%>
</center>
<h1>Hospital Management</h1>
<div align="center">
  <form method="post">
    <table border="1" cellpadding="5">
      <caption>
        <h2>
          Edit Bệnh Án
        </h2>
      </caption>
      <%--                <c:if test="${product != null}">--%>
      <%--                    <input type="hidden" name="id" value="<c:out value='${product.id}' />"/>--%>
      <%--                </c:if>--%>
      <tr>
        <th>Mã Bệnh Án: </th>
        <td>
          <input type="text" name="id" size="45"
                 value="<c:out value='${benhan.id}' />" readonly
          />
        </td>
      </tr>
      <tr>
        <th>Mã Bệnh Nhân:</th>
        <td>
          <input type="text" name="idBN" size="45"
                 value="<c:out value='${benhan.benhNhan.id}' />" readonly
          />
        </td>
      </tr>
      <tr>
        <th>Tên Bệnh Nhân:</th>
        <td>
          <input type="text" name="nameBN" size="45"
                 value="<c:out value='${benhan.benhNhan.name}' />"
          />
        </td>
      </tr>
      <tr>
        <th>Ngày Nhập Viện:</th>
        <td>
          <input type="date" name="ngaynhapvien" size="15"
                 value="<c:out value='${benhan.ngayNhapVien}' />"
          />
        </td>
      </tr>
      <tr>
        <th>Ngày Ra Viện:</th>
        <td>
          <input type="date" name="ngayravien" size="45"
                 value="<c:out value='${benhan.ngayXuatVien}' />"
          />
        </td>
      </tr>
      <tr>
        <th>Lý Do:</th>
        <td>
          <input type="text" name="lydo" size="45"
                 value="<c:out value='${benhan.lydo}' />"
          />
        </td>
      </tr>
<%--      <tr>--%>
<%--        <th>Category:</th>--%>
<%--        <td>--%>
<%--          <select name="category" >--%>
<%--            <option value="${product.category.id}" selected/>${product.category.name}</option>--%>
<%--            <c:forEach items="${categories}" var="category">--%>
<%--              <option value="${category.id}">${category.name}</option>--%>
<%--            </c:forEach>--%>
<%--          </select>--%>
<%--        </td>--%>
<%--      </tr>--%>
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