<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-08
  Time: 오후 3:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Enumeration<String> list = request.getHeaderNames();

    while (list.hasMoreElements()) {// 값이 있으면 실행
        String name = list.nextElement();
        String value = request.getHeader(name);

        out.print("<h3>");
        out.print(name + " = " + value);
        out.print("</h3>");

    }
%>
</body>
</html>
