<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-15
  Time: 오전 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>쿠키 값 삭제</h1>

userid : ${cookie.userid.value}<br>
uuid : ${cookie.uuid.value}
<br>

<a href="view">쿠키 확인</a>
</body>
</html>
