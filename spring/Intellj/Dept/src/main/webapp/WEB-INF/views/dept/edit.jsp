<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-24
  Time: 오후 2:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>부서 등록</h1>
<form method="post">
    부서번호 부서이름 부서위치 버튼
    <table>
        <tr>
            <td>부서번호</td>
            <td><input type="number" name="deptno" value="${dept.deptno}" readonly></td>
        </tr>
        <tr>
            <td>부서이름</td>
            <td><input type="text" name="dname" value="${dept.dname}"></td>
        </tr>
        <tr>
            <td>부서위치</td>
            <td><input type="text" name="loc" value="${dept.loc}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="수정"></td>
        </tr>
    </table>
</form>
</body>
</html>
