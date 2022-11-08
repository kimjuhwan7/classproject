<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-08
  Time: 오후 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>signup</title>
</head>
<body>
<h1>회원가입</h1>
<hr>
<form action="SignupServlet" method="post">
    ID <input type="text" name="userid1" id="userid1"><br>
    PW <input type="text" name="userpw1" id="userpw1"><br>
    NAME <input type="text" name="username" id="username"><br>
    
    소개글 <textarea name="memo"  cols="30" rows="5">간단한 메모를 입력하세요
</textarea><br>
    성별 : 남자<input type="radio" name="gender"  value="남자">
    성별 : 여자<input type="radio" name="gender"  value="여자"><Br>
    언어 선택 :
    JAVA <input type="checkbox" name="lang" value="java">
    HTML <input type="checkbox" name="lang" value="HTML">
    JSP <input type="checkbox" name="lang" value="JSP"><br>
    <select name="year">
        <option value="2023">2023</option>
        <option value="2022">2022</option>
    </select>
    <input type="submit" value="로그인">

</form>

</body>
</html>
