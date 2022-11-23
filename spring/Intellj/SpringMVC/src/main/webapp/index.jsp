<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<style>
    table{
        margin: 0px;
    }
a{
    text-decoration: none;
    padding: 10px;
    background-color: beige;
}
a:hover{
    background-color: yellow;
}
</style>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<table>
    <tr>
        <td style="margin: 10px"><a href="hello-servlet">Hello Servlet</a></td>
        <td style="margin: 10px"><a href="/login">[로그인]</a></td>
    </tr>
</table>


</body>
</html>