<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-25
  Time: 오후 4:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<table border="1">
  <tr>
    <td>todo</td>
    <td>dueDate</td>
    <td>finished</td>
    <td>수정</td>

  </tr>
  <c:forEach items="${todoList}" var="todoList">
    <tr>
      <td>${todoList.todo}</td>
      <td>${todoList.dueDate}</td>
      <td>${todoList.finished}</td>
      <td><input type="button" value="수정">
      </td>
    </tr>
  </c:forEach>
</table>
<h3><a href="todo_in"><button >추가</button></a></h3>
</body>
</html>
