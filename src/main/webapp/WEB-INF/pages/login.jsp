<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Lambent Login Form a Flat Responsive Widget Template :: w3layouts</title>
    <link rel="stylesheet" href="../../css/style.css">

    <!--	<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300italic,300,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>-->

    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <meta http-equiv="Content-Type" content="text/javascript; charset=utf-8"/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);
    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
</head>
<body>
<h1>阳江业务管理平台</h1>
<div class="main-agileinfo">
    <form action="loginsubmit" method="post">
        <input type="text" name="username" class="name" placeholder="username">
        <input type="password" name="password" class="password" placeholder="password">

        <div class="clear"></div>
        <input type="submit" value="登录">
        <p>${error}</p>
    </form>
</div>

</body>
</html>