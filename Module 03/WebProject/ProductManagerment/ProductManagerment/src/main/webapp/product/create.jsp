<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 21/11/2022
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>Create New Product</title>
    <link rel="stylesheet" href="/assets/css/index.css">
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
                        <h2>
                            Add new product
                        </h2>
                        <a href="/product">Return List</a>
                        <c:if test="${error != null}">
                            <h2 style="color: red">${error}</h2>
                        </c:if>
                        <div class="body">
                            <form action="/product" method="post">
<%--                                <label for="id">ID: <span style="color: red;"> *</span></label>--%>
<%--                                <div class="form-group">--%>
<%--                                    <div class="form-line">--%>
<%--                                        <input type="text" name="id" class="form-control" placeholder="Product ID" tabindex="1" autofocus="autofocus" id="id" />--%>
<%--                                    </div>--%>
<%--                                </div>--%>

                                <label for="name">Name: <span style="color: red;"> *</span></label>
                                <div class="form-group">
                                    <div class="form-line">
                                        <input type="text" name="name" class="form-control" placeholder="Product Name" tabindex="2" id="name" />
                                    </div>
                                </div>

                                <label for="price">Price: <span style="color: red;"> *</span></label>
                                <div class="form-group">
                                    <div class="form-line">
                                        <input type="text" name="price" class="form-control" placeholder="Price" tabindex="3" id="price" />
                                    </div>
                                </div>

<%--                                <label for="dateRelease">Date Release: <span style="color: red;"> *</span></label>--%>
<%--                                <div class="form-group">--%>
<%--                                    <div class="form-line">--%>
<%--                                        <input type="date" name="dateRelease" class="form-control" placeholder="Date release" tabindex="4" id="dateRelease" />--%>
<%--                                    </div>--%>
<%--                                </div>--%>

                                <label for="description">Description: <span style="color: red;"> *</span></label>
                                <div class="form-group">
                                    <div class="form-line">
                                        <input type="text" name="quantity" class="form-control" placeholder="Quantity" tabindex="5" id="description" />
                                    </div>
                                </div>

                                <label for="producer">Producer: <span style="color: red;"> *</span></label>
                                <div class="form-group">
                                    <div class="form-line">
                                        <input type="text" name="quantity" class="form-control" placeholder="Quantity" tabindex="5" id="producer" />
                                    </div>
                                </div>

                                <button type="reset" class="btn btn-primary btn-custom" tabindex="6"><i class="fa fa-check" aria-hidden="true"></i> Reset</button>
                                <button type="submit" class="btn btn-primary btn-custom" tabindex="7"><i class="fa fa-check" aria-hidden="true"></i> Add</button>

                            </form>
                        </div>
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
