<%@ page import="java.util.List" %>
<%@ page import="com.firstcoding.firstapp.member.Member" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-09
  Time: 오후 2:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Member> member = new ArrayList<>();
    members.add(new Member("cool00", "1110", "COOL0"));
    members.add(new Member("cool01", "1111", null));
    members.add(new Member("cool02", "1112", "COOL0"));
    members.add(new Member("cool03", "1113", "COoL0"));
    members.add(new Member("cool04", "1114", null));
    members.add(new Member("cool05", "1115", "COOL0"));
    members.add(new Member("cool06", "1116", "COOL0"));
    members.add(new Member("cool07", "1117", null));
    members.add(new Member("cool08", "1118", "COOL0"));
    members.add(new Member("cool09", "1119", "COOL0"));

    session.setAttribute("members",member);

%>
000
</body>
</html>
