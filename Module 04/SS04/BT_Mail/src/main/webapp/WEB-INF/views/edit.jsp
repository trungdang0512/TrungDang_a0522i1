<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 24/12/2022
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mail Setting</title>
</head>
<body>
    <h3>Mail Setting</h3>
    <form:form method="post" action="edit" modelAttribute="newMail">
        <table>
            <tr>
                <td><form:label path="language">Language: </form:label> </td>
                <td><form:select path="language">
                    <form:option value="English">English</form:option>
                    <form:option value="Vietnamese">Vietnamese</form:option>
                    <form:option value="Japanese">Japanese</form:option>
                    <form:option value="Chinese">Chinese</form:option>
                </form:select></td>
            </tr>
            <tr>
                <td><form:label path="pageSize">Page Size: </form:label></td>
                <td>Show <form:select path="pageSize">
                    <form:option value="5">5</form:option>
                    <form:option value="10">10</form:option>
                    <form:option value="15">15</form:option>
                    <form:option value="25">25</form:option>
                    <form:option value="5">50</form:option>
                    <form:option value="100">100</form:option>
                </form:select> emails per page </td>
            </tr>
            <tr>
                <td><form:label path="enableSpam">Spams filter: </form:label></td>
                <td>
                    <form:checkbox path="enableSpam" value="Disable"/>Disable spams filter
                    <form:checkbox path="enableSpam" value="Enable"/>Enable spams filter
                </td>
            </tr>
            <tr>
                <td><form:label path="signature">Signature</form:label></td>
                <td><form:textarea path="signature" rows="5" cols="30"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
