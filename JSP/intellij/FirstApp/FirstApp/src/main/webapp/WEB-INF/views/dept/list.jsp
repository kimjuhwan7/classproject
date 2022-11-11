<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-11
  Time: 오후 5:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>부서리스트</title>
</head>
<body>
<h1>부서 리스트</h1>

<table border="1">
    <tr>
        <th>부서번호</th>
        <th>부서이름</th>
        <th>위치</th>
    </tr>

    <c:forEach var="dept" items="${list}">
        <tr>
            <td>${dept.deptno}</td>
            <td>${dept.dname}</td>
            <td>${dept.loc}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
