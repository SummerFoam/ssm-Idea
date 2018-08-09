<%--
  Created by IntelliJ IDEA.
  User: zhangaihua
  Date: 2018/8/9
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/add">
    用户名：<input type="text" name="name">
    密码：<input type="password" name="password">
    <input type="submit" value="提交">
</form>

</body>
</html>
