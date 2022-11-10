<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-08
  Time: 오전 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>계산기</title>
</head>
<body>
<h1>${title}</h1>
<form method="post" action="/calc/makeResult">
    <input type="number" name="num1" id="num1">
    <input type="number" name="num2" id="num2">
    <button>전송</button>

</form>
</body>
</html>
