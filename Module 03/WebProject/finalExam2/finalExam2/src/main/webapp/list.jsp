<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/11/2022
  Time: 6:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
          crossorigin="anonymous"></script>
  <style>
    .add {
      color: blue;
      text-decoration: none;
      padding: 20px;
      border: 1px solid cornflowerblue;
      border-radius: 10px;
      margin-left: 5px;
    }

    .add:hover {
      color: white;
      background-color: cornflowerblue;
    }

    table {
      margin-top: 40px;
    }

    td {
      text-align: center;

    }

    th {
      text-align: center;
    }
    .btn-update>a{
      text-decoration: none;
      color: blue;
    }
    .btn-update>a:hover{
      color: white;
    }
    .search{
      margin-left: 700px;
    }
    .search > input {
      border-radius: 5px;
      border: 1px solid blue ;
      outline: none;
    }
    .search > select{
      border-radius: 5px;
      border: 1px solid blue ;
      outline: none;
    }
    .search > button{
      border-radius: 5px;
      border: 1px solid blue ;
      outline: none;
    }
  </style>
</head>
<body>
<h2 style="text-align: center">Danh sách các phòng</h2>
<a class="add" href="/room?action=create">+ Add New Product</a>

<form class="search" action="/room?action=search" method="get">
  <input hidden type="text" name="action" value="search">
  <input type="text" name="searchName" placeholder="nhập tên">
<%--  <input type="text" name="searchNumberPhone" placeholder="nhập số điện thoại">--%>
<%--  <input type="text" name="idPayment_rom" placeholder="nhập mã phòng trọ">--%>
<%--  <select name="idPayment_rom">--%>
<%--    <option value="">--Chọn hình thức-- </option>--%>
<%--    <c:forEach var="pl" items="${paymentList}">--%>
<%--      <option value="${pl.getIdPayment()}">${pl.getNamePayment()}</option>--%>
<%--    </c:forEach>--%>
<%--  </select>--%>
  <button type="submit">Search</button>
</form>
<form class="search" action="/room?action=searchPhone" method="get">
  <input hidden type="text" name="action" value="search">
  <input type="text" name="searchNumberPhone" placeholder="nhập số điện thoại">
  <button type="submit">Search</button>
</form>
<form class="search" action="/room?action=searchId" method="get">
  <input hidden type="text" name="action" value="search">
  <input type="text" name="idPayment_rom" placeholder="nhập mã phòng trọ">
  <button type="submit">Search</button>
</form>

<table class="table table-striped">
  <tr>
    <th>STT</th>
    <th>Mã Phòng Trọ</th>
    <th>Tên Người Thuê</th>
    <th>Sđt</th>
    <th>Ngày Bắt Đầu Thuê</th>
    <th>Hình Thức thanh toán</th>
    <th>Ghi Chu</th>
    <th>Action</th>
  </tr>
  <c:forEach var="rom" items="${roomList}" varStatus="status">
    <tr>
      <td>${status.count}</td>
      <td>PT-00${rom.getId()}</td>
      <td>${rom.getName()}</td>
      <td>0${rom.getPhone()}</td>
      <td>${rom.getDate()}</td>
      <c:forEach var="payment" items="${paymentlist}">
        <c:if test="${payment.getIdPayment() == rom.getIdPayment_room()}">
          <td>${payment.getNamePayment()}</td>
        </c:if>
      </c:forEach>
      <td>${rom.getNote()}</td>
      <td>
        <button type="button" class="btn btn-outline-primary btn-update">
          <a href="/room?action=edit&id=${rom.getId()}">Edit</a>
        </button>
        <!-- Button trigger modal update-->
        <button type="button" onclick="infoDelete('${rom.getId()}','${rom.getName() }')" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
          Delete
        </button>
      </td>
    </tr>
  </c:forEach>
</table>




<!-- Modal delete -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <%--        sửa ở đây--%>
    <form action="/room?action=delete" method="get">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <input name="action" value="delete" hidden>
          <input name="deleteId" id="deleteId" hidden>
          <span class="text-danger">Bạn có muốn xoá khách hàng </span><span id="deleteName"></span>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
          <button type="submit" class="btn btn-primary">Delete</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body>
<script>
  <%--                    sửa ở đây--%>
  function infoDelete(id, name) {
    document.getElementById("deleteId").value=id;
    document.getElementById("deleteName").innerText=name;
  }
</script>
</html>
