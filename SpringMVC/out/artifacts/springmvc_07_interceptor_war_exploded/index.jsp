<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/5/1
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="${pageContext.request.contextPath}/user/goLogin">登錄</a>
  <a href="${pageContext.request.contextPath}/user/main">登錄</a>
  <form action="${pageContext.request.contextPath}/user/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="upload">
  </form>
  </body>
</html>
