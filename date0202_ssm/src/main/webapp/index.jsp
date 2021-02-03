<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/3
  Time: 8:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/account/findAll">查询所有</a>
<hr/>
<form action="/account/add" method="post">
    姓名:<input name="name"><br/>
    金额:<input name="money"><br/>
    <input type="submit" value="提交">
</form>
<hr/>
<form action="/user/login" method="post">
    用户名:<input type="text" name="username"><br/>
    密码:<input type="password" name="password"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
