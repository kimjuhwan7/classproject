<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-09
  Time: 오후 3:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${10== 0}">
  참일 때 보여집니다!
</c:if>
<hr>
이름 :
<c:if test="${member[1].name eq null}">
    입력된 정보가 없습니다.
</c:if>

<c:if test="${members[0].name == 'COOL0'}" var="result" scope="request"/>
members[0].name=='COOL0'=> ${result}
</body>
</html>
