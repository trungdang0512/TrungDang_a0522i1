<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 09/12/2022
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hospital Managerment</title>
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
        tr:nth-of-type(even) {
            background-color: #ffdbdb;
        }
        tr:nth-of-type(odd) {
            background-color: #cffad9;
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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>
<center>
    <h1>Hospital Management</h1>
    <caption><h2>Danh Sách Bệnh Án</h2></caption>
<%--    <h2>--%>
<%--        <a href="/product?action=create">Add New Product</a>--%>
<%--    </h2>--%>
    <%--  <form action="/users" method="get">--%>
    <%--    <h2>--%>
    <%--      <input type="text" name="findid" id="findid" size="15" >--%>
    <%--      <input type="hidden" name="action" value="selectbyid">--%>
    <%--      <button type="submit">Find By ID</button>--%>
    <%--    </h2>--%>
    <%--  </form>--%>

<%--    <form action="/bv" method="get">--%>
<%--        <h2>--%>
<%--            <input type="text" name="inputname" id="inputname" size="15" >--%>
<%--            <input type="hidden" name="action" value="findbyname">--%>
<%--            <button type="submit">Find By Name</button>--%>
<%--        </h2>--%>
<%--    </form>--%>

</center>
<div align="center">
    <table border="1" cellpadding="5">

        <tr style="background-color: #f6be91;">
            <th>STT</th>
            <th>Mã Bệnh Án</th>
            <th>Mã Bệnh Nhân</th>
            <th>Tên Bệnh Nhân</th>
            <th>Ngày Nhập Viện</th>
            <th>Ngày Ra Viện</th>
            <th>Lý Do Nhập Viện</th>
            <th>Tác Vụ</th>
        </tr>
        <c:forEach var="benhan" items="${benhan}" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${benhan.id}</td>
                <td>${benhan.benhNhan.id}</td>
                <td>${benhan.benhNhan.name}</td>
                <td>${benhan.ngayNhapVien}</td>
                <td>${benhan.ngayXuatVien}</td>
                <td>${benhan.lydo}</td>
                <td>
                    <button type="button" class="btn btn-outline-primary btn-update">
                        <a href="/bv?action=edit&id=${benhan.id}" class="btn btn-outline-primary btn-update">Edit</a>
                    </button>

                    <button type="button" onclick="infoDelete('${benhan.id}')" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
<%--                        <a href="/bv?action=delete&id=${benhan.id}">--%>
                            Delete
<%--                        </a>--%>
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <%--        sửa ở đây--%>
        <form action="/bv?action=delete" method="get">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input name="action" value="delete" hidden>
                    <input name="deleteId" id="deleteId" hidden>
                    <span class="text-danger">Bạn có muốn xoá Bệnh án: </span>
                    <span style="font-weight: bolder" id="callDeleteId"></span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </div>
        </form>
    </div>
</div>

<script>
    <%--                    sửa ở đây--%>
    function infoDelete(id) {
        document.getElementById("deleteId").value=id;
        document.getElementById("callDeleteId").innerText=id;
    }
</script>
</body>
</html>
