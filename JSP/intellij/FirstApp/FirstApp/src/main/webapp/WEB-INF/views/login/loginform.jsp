<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-15
  Time: 오전 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>로그인</h1>
<hr>
<form method="post">
    <table>
        <tr>
            <td>아이디</td>
            <td><input type="text" name="userid" id="userid" value="${cookie.reId.value}"></td>
        </tr>
        <tr>
            <td>비밀번호</td>
            <td><input type="password" name="pw" id="pw"></td>
        </tr>
        <tr>
            <td></td>
            <td>아이디 저장하기 <input type="checkbox" name="idremember" ${cookie.reId.value ne null? 'checked' : ''}></td>
        </tr>
        <tr>
            <td></td>
            <td>remember-me <input type="checkbox" name="rememberme"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="로그인"></td>
        </tr>
    </table>
</form>
<c:if test="${param.error eq 'e'}">
    <script>
        alert('오류 발생')
    </script>
</c:if>

<c:if test="${param.error eq 'nf'}">
    <script>
        alert('아이디 또는 비밀번호가 틀립니다.')
    </script>
</c:if>


</body>
</html>
