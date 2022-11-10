<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-10
  Time: 오후 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>등록(입력)</title>
</head>
<body>
<h1>${title}</h1>
<form action="/register" method="post">
    <input type="text" name="in_title"><br>
    <input type="date" name="in_date"><br>
    <input type="reset" value="RESET">
    <input type="submit" value="REGISTER">
</form>
</body>
</html>
