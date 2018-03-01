<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/2/26
  Time: 下午9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title><meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <link href="../../css/demo.css" rel="stylesheet" type="text/css"/>


    <script src="../../scripts/boot.js" type="text/javascript"></script>


    <style type="text/css">
        body {
            margin: 0;
            padding: 0;
            border: 0;
            width: 100%;
            height: 100%;
            overflow: hidden;
        }
    </style>
</head>
<body>
<div class="mini-fit">

    <div id="grid1" class="mini-datagrid"
         style="width:100%;height:100%;"
         idField="id" allowResize="true"
         sizeList="[5,10,20,50]" pageSize="10"
         borderStyle="border-left:0;border-right:0;"
         onrowdblclick="onRowDblClick">

        <div property="columns">
            <div type="checkcolumn"></div>
            <div field="plantId" width="120"
                 headerAlign="center" allowSort="true">厂房编号</div>
            <div field="macNo" width="100" headerAlign="center" allowSort="true">机组</div>
        </div>
    </div>

</div>
<div class="mini-toolbar" style="text-align:center;padding-top:8px;padding-bottom:8px;" borderStyle="border:0;">
    <a class="mini-button" style="width:60px;" onclick="onOk()">确定</a>
    <span style="display:inline-block;width:25px;"></span>
    <a class="mini-button" style="width:60px;" onclick="onCancel()">取消</a>
</div>

</body>
</html>
<script type="text/javascript">
    mini.parse();

    var grid = mini.get("grid1");

    //动态设置URL
    grid.setUrl("/manage/selectPlant");

    grid.load();

    function GetData() {
        var row = grid.getSelected();
        return row;
    }
    function search() {
        var key = mini.get("key").getValue();
        grid.load({staffName: key});
    }
    function onKeyEnter(e) {
        search();
    }
    function onRowDblClick(e) {
        onOk();
    }
    //////////////////////////////////
    function CloseWindow(action) {
        if (window.CloseOwnerWindow) return window.CloseOwnerWindow(action);
        else window.close();
    }

    function onOk() {
        CloseWindow("ok");
    }
    function onCancel() {
        CloseWindow("cancel");
    }


</script>
