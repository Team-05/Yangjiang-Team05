<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/2/3
  Time: 下午4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>Title</title>
    <link rel="stylesheet" href="../../css/demo.css">

    <script src="../../scripts/boot.js" type="text/javascript"></script>
    <%--<script src="page/swfupload/swfupload.js" type="text/javascript"></script>--%>
    <%--<script src="page/js/ajaxfileupload.js" type="text/javascript"></script>--%>

    <style type="text/css">
        table,td{
            border: 1px solid #d5e9fa;
            border-collapse: collapse;
            padding: 1px;
            width: 99%;
        }

        input{
            height: 20px;
        }
        .header{
            width:100%;
            background-image:url(../../img/title.png);
            background-repeat: no-repeat;
            background-size: cover;

        }
    </style>
</head>
<body style="background-color: #0b549a">
<%--<div  class="header" showSplitIcon="true" >--%>
    <%--<span style="float: right"><h3> <shiro:user>当前用户:<shiro:principal/></shiro:user></h3></span>--%>
    <%--<a class="mini-button" href="/logout" style="float:right">退出</a>--%>
    <%--<button style="float: right">个人工作台</button>--%>
<%--</div>--%>
<div id="layout1" class="mini-layout" style="width:100%;height:100%"  borderStyle="border:solid 1px #aaa;">
    <div class="header" region="north" showSplitIcon="true" showSplit="false" showHeader="false">
    <%--<div region="north" showSplitIcon="true"--%>
         <%--style="background-image: url('../../img/title.png');background-size: auto;width: 100%;"  >--%>
        <%--<span style="float: right"><h3> <shiro:user>当前用户:<shiro:principal/></shiro:user></h3></span>--%>
        <%--<span postion><a class="mini-button" href="/logout">退出</a></span>--%>
        <span style="position: absolute;z-index: 2;top: 65%;left: 90%;"><button>个人工作台</button></span>

        <img src=../../img/pagerHeard.png style="position: absolute;width: 100%;height: 100%">
        <img src="../../img/man.png" style="width: 25px;height: 25px;position: absolute;z-index: 2; left: 58%;top: 9%">
        <span style="position: absolute;z-index: 2;font-size: 14px;left: 61%;top: 9%;"><shiro:user>当前用户:<shiro:principal/></shiro:user></span>

        <img src="../../img/question.jpg" style="width:25px;height: 25px;position: absolute;z-index:2;left:69%;top:9%">
        <span style="position: absolute;left: 72%;top: 9%;z-index: 2"><a href="#" style="font-size: 14px;text-decoration: none;color: #0b93d9">系统帮助</a></span>

        <img src="../../img/off.png" style="width: 20px;height: 20px;position: absolute;z-index: 2; left: 80%;top: 9%">
        <span style="position: absolute;left: 83%;top: 9%;z-index: 2"><a href="#" style="font-size: 14px;text-decoration: none;color: #0b93d9">退出登录</a></span>

        <img src="../../img/circle.jpg" style="width:25px;height: 25px;position: absolute;z-index: 2;left:91%;top: 9%;">
        <span style="position: absolute;left: 94%;top: 9%;z-index: 2"><a href="#" style="font-size: 14px;text-decoration: none;color: #0b93d9">更换主题</a></span>


    </div>
    <div title="center" region="center"  >
        <div class="mini-splitter" style="width:99%;height:100%">
            <%--左侧menu--%>
            <div size="15%" showCollapseButton="true">
                <div id="leftTree" class="mini-outlookmenu"
                     url="../../text/outlookmenu.txt" onitemselect="onItemSelect"
                     idField="id" parentField="pid"
                     textField="text" borderStyle="border:0"
                     style="background: #78beff">
                </div>
            </div>
            <%--右侧主题--%>
            <div showCollapseButton="true" title="center" region="center" bodyStyle="overflow:scroll;" style="background-color: white">
                <iframe id="mainframe" frameborder="0" name="main" style="width:100%;height:100%;" border="0"></iframe>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">

    mini.parse();
    var iframe = document.getElementById("mainframe");
    iframe.src = "/welcome";

    function onItemSelect(e) {
        var item = e.item;
        iframe.src = item.url;
    }
</script>
</body>
</html>
