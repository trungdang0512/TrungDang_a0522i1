<%@ page import="model.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 21/11/2022
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product List</title>
    <jsp:include page="/product/Layout/header.jsp" />
</head>
<body>
<jsp:include page="/product/Layout/page-loader.jsp" />
<jsp:include page="/product/Layout/navbar.jsp" />
<jsp:include page="/product/Layout/sidebar.jsp" />

<section class="content">
  <div class="container-fluid">
    <!-- Vertical Layout -->
    <div class="row clearfix">
      <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="card">
          <div class="header">
            <h2>Product list</h2>
          </div>
          <div class="body table-responsive">
            <a href="/product?action=create" class="btn btn-primary btn-custom">
              <i class="fa fa-plus-circle" aria-hidden="true"></i> Add new product
            </a>
            <table class="table table-striped" id="dataTable-listStudent">
              <thead>
              <tr>
                <td>Id</td>
                <td>Product Name</td>
                <td>Price</td>
                <td>Description</td>
                <td>Producer</td>
                <td></td>
                <td></td>
              </tr>
              </thead>
              <tbody>
                <c:forEach items='${requestScope["products"]}' var="product">
                  <tr>
                    <td>${product.getId()}</td>
                    <td>${product.getName()}</td>
                    <td>${product.getPrice()}</td>
                    <td>${product.getDes()}</td>
                    <td>${product.getProducer()}</td>
                    <td><a href=""><input type="button" value="Edit" style="width: 60px"></a></td>
                    <td><a href=""><input type="button" value="Delete" style="width: 60px"></a></td>
                  </tr>
                </c:forEach>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<jsp:include page="/product/Layout/script.jsp" />
<jsp:include page="/product/Layout/footer.jsp" />

</body>
</html>
