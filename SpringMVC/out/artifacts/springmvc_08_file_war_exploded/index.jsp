<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/5/2
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/file/upload2" method="post" enctype="multipart/form-data">
      <input type="file" name="file">
    <input type="submit" value="upload">
  </form>
  <a href="/file/download">下载</a>
  </body>
</html>
