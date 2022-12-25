<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 19/12/2022
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Create a new employee</title>
</head>
<body>
  <h3>Welcome, Enter The Employee Details</h3>
  <form:form method="POST" action="addemployee" modelAttribute="employee">
    <table>
      <tr>
        <td><form:label path="id">Employee ID: </form:label></td>
        <td><form:input path="id"/></td>
      </tr>
      <tr>
        <td><form:label path="name">Employee's name: </form:label></td>
        <td><form:input path="name"/></td>
      </tr>
      <tr>
        <td><form:label path="contactNumber">Contact's number: </form:label></td>
        <td><form:input path="contactNumber"/></td>
      </tr>
      <tr>


      </tr>
    </table>
  </form:form>
</body>
</html>
