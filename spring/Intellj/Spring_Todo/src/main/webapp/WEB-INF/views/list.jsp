<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-17
  Time: 오후 5:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>list리스트</h1>

<table>
    <tr>
        <td>번호</td>
        <td>할일</td>
        <td>기간</td>
        <td>완료여부</td>
    </tr>
    <%--    <c:forEach>--%>
    <tr>
        <td><a href="read?tno=1">123</a></td>
        <td></td>
        <td></td>
        <td>완료여부</td>
    </tr>
    <%--    </c:forEach>--%>
</table>
<form>
    <input type="submit" value="수정">
</form>

<form method="post">
    <input type="submit" value="삭제">
</form>

</body>
</html>
