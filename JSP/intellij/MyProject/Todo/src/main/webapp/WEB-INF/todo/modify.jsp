<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-10
  Time: 오후 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>수정(입력)</title>
</head>
<body>
<form method="post" action="/list">
    할일 <input type="text" name="todo" id="todo" value="저장되어 있는 제목" placeholder="할일 제목을 입력하세요!"> <br>
    마감 <input type="date" name="date" id="date" value="2022-11-10"> <br>
    <input type="reset"> <input type="submit" value="수정">
</form>
</body>
</html>
