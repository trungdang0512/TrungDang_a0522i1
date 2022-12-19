<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 19/12/2022
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Choose Sandwich</title>
</head>
<body>
<h2>Please choose Sandwich Condiments</h2>
<form action="/choose" method="get">
  <input type="checkbox" id="lettuce" name="condiment" value="Lettuce">
  <label for="lettuce">Lecttuce</label><br>
  <input type="checkbox" id="tomato" name="condiment" value="Tomato">
  <label for="tomato">Tomato</label><br>
  <input type="checkbox" id="mustard" name="condiment" value="Mustard">
  <label for="mustard">Mustard</label><br>
  <input type="checkbox" id="sprouts" name="condiment" value="Sprouts">
  <label for="sprouts">Sprouts</label><br>
  <input type="submit" value="Submit">
  <input type="reset" value="Reset">
</form>
<h2>Your choice: ${condiment[0]} ${condiment[1]} ${condiment[2]} ${condiment[3]}</h2>


</body>
</html>
