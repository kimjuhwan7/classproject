<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello Wordld!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br>
<a href="my">myServlet</a><br>
<a href="mypage.jsp">mypage.jsp</a>
<br><a href="login.jsp">login.jsp</a>

<hr>
<c:if test="${loginInfo eq null}">
    <a href="/login">로그인</a>
</c:if>
<br>
<c:if test="${loginInfo != null}">
    회원 정보 :${loginInfo}
    <br>
    <a href="/logout">로그아웃</a>
</c:if>

</body>
</html>