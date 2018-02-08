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
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center center;
            background-image: url(../../img/title.png);
            width: 100%;
            height: 49px;
        }
    </style>
</head>
<body>
<%--<div  class="header" showSplitIcon="true" >--%>
    <%--<span style="float: right"><h3> <shiro:user>当前用户:<shiro:principal/></shiro:user></h3></span>--%>
    <%--<a class="mini-button" href="/logout" style="float:right">退出</a>--%>
    <%--<button style="float: right">个人工作台</button>--%>
<%--</div>--%>
<div id="layout1" class="mini-layout" style="width:100%;height:100%"  borderStyle="border:solid 1px #aaa;">
    <div title="阳江业务管理平台" region="north" showSplitIcon="true"
         style="background-color: #e8ecf6; background:-moz-linear-gradient(top,#b2d1f5,grey); float: left;width: 100%;height: 15px">
    <%--<div region="north" showSplitIcon="true"--%>
         <%--style="background-image: url('../../img/title.png');background-size: auto;width: 100%;"  >--%>
        <span style="float: left"><h3> <shiro:user>当前用户:<shiro:principal/></shiro:user></h3></span>
        <a type="mini-button" href="/logout">退出</a>
        <button style="float: right">个人工作台</button>
    </div>
    <div title="center" region="center"  >
        <div class="mini-splitter" style="width:99%;height:100%">
            <%--左侧menu--%>
            <div size="15%" showCollapseButton="true">
                <div id="leftTree" class="mini-outlookmenu" url="../../text/outlookmenu.txt" onitemselect="onItemSelect"
                     idField="id" parentField="pid" textField="text" borderStyle="border:0">
                </div>
            </div>
            <%--右侧主题--%>
            <div showCollapseButton="true" title="center" region="center" bodyStyle="overflow:scroll;">
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
