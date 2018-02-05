<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/2/5
  Time: 下午5:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="loginsubmit" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    <p class="bg-warning">${error}</p>
    <input type="submit" value="登录"/>
</form>

</body>
</html>
