<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-25
  Time: 오후 5:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>등록</title>
</head>
<body>
<h1>등록</h1>
<form method="post">

  <table>
    <tr>
      <td>todo</td>
      <td><input type="text" name="todo"></td>
    </tr>
    <tr>
      <td>dueDate</td>
      <td><input type="date" name="dueDate"></td>
    </tr>
    <tr>
      <td>finished</td>
      <td><input type="checkbox" name="finished"></td>
    </tr>
    <tr>
      <td><input type="submit" value="전송"></td>
      <td></td>
    </tr>

  </table>

</form>

</body>
</html>
