<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>index</title>
</head>
<body>
<h2>Hello World!</h2>
<form action="<%=path%>/user/login.do">
    姓名：
    <input type="text" name="name">
    <br>
    密码：
    <input type="text" name="pwd">
    <br>
    <input type="submit" value="submit">
</form>
</body>
</html>
