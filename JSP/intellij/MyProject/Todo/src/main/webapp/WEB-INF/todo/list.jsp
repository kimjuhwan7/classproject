<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-10
  Time: 오후 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>목록</title>
</head>
<body>
<h1>${title}</h1>


<ul>
    <c:forEach var="num" begin="1" end="10">
        <li><a href="/read?tno=${num}">${num}</a> Todo 제목 2022-11-10 done</li>
    </c:forEach>
    <li></li>
</ul>

<a href="/register">ToDo 등록</a>
</body>
</html>
