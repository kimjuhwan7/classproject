
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

<table border="1">
    <tr>
        <th>index</th>
        <th>타이틀</th>
        <th>날짜</th>
        <th>아이디</th>
        <th>이름</th>
        <th>비밀번호</th>
    </tr>
    <c:forEach var="todolist" items="${todolist}" varStatus="stat">
        <tr>
            <td><a href="">${stat.index}</a></td>
            <td>${todolist.title}</td>
            <td>${todolist.date}</td>
            <td>${todolist.check}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
