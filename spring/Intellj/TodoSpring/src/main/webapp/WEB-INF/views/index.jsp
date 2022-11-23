<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-18
  Time: 오전 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        img {
            height: 40px;
        }

        a {
            text-decoration: none;
            color: black;
            padding: 20px;

        }

        a:hover {
            background-color: yellow;
        }
    </style>
</head>
<body>
<h1>index page</h1>
<h1>Todo Project</h1>

<ul>
    <li>프로젝트 이름 :</li>
    <li>프로젝트 기능 :</li>
    <li></li>
</ul>

<table>
    <tr class="log">
        <c:if test="${loginInfo eq null}">
            <td>
                <a href="/login">로그인</a>
            </td>
            <td>
                <a href="/member/register">회원가입</a>
            </td>
        </c:if>
        <c:if test="${loginInfo ne null}">
            <td><a href="todo/list">Todo Lois</a></td>
            <td><img src="/uploadfile/member/${loginInfo.uphoto}"></td>
            <td><a href="/logout">로그아웃</a></td>
        </c:if>
    </tr>
</table>

<br><br><br>
<hr>
${loginInfo}


회원보${loginInfo.uid}( ${loginInfo.uname})
</body>
</html>
