<%@page import="java.util.List" %>
<%@ page import="com.first.todo.todolist" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.first.todo.todolist.Todolist" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList<Todolist> todolists = new ArrayList<Todolist>();
    todolists.add(new Todolist("양치하기", "2022-11-09", "yes"));
    todolists.add(new Todolist("약 복용하기", "2022-11-10", "no"));
    todolists.add(new Todolist("학원가기", "2022-11-01", "yes"));

    session.setAttribute("todolist", todolists);
%>
<form action="/todo/list">
    <input type="submit" value="세션추가">
</form>
</body>
</html>
