<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <style>
        td {
            padding: 5px;
        }

        a {
            text-decoration: navajowhite;

        }
    </style>
</head>
<body>

<h1>${title}</h1>

<table>
    <tr>
        <td>번호</td>
        <td>할일</td>
        <td>기간</td>
        <td>완료여부</td>
    </tr>

    <c:forEach var="todo" items="${todoList}" varStatus="stat">
        <tr>
            <td>${todo.tno} / ${stat.count}</td>
            <td><a href="/todo/read?tno=${todo.tno}">${todo.todo}</a></td>
            <td>${todo.dueDate}</td>
            <td>${todo.finished ? '완료' : '진행중'}</td>
        </tr>
    </c:forEach>


</table>


<a href="/imgregister">Todo 등록하기</a>
<hr>
<h3>이미지 저장소</h3>
<form method="post" enctype="multipart/form-data">
    <input type="file" name="Iimg">
</form>
<table>
    <th></th>
    <tr>
        <td></td>
    </tr>
</table>
</body>
</html>