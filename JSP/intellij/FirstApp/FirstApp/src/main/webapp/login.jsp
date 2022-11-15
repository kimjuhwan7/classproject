<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-07
  Time: 오후 3:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<htm>
    <head>
        <title>로그인 페이지</title>
    </head>
    <body>
    <h1>로그인 페이지</h1>
    <%
        String userid = request.getParameter("userid");
        String pw = request.getParameter("pw");

        if (userid.equals(pw)) {
            session.setAttribute("loginId", userid);//세션에 로그인아이디 저장
            response.sendRedirect("mypage.jsp");
        } else {
            response.sendRedirect("login.html");
        }

        LocalDate now = LocalDate.now();
    %>
    <%=now%>

    </body>
</htm>
x