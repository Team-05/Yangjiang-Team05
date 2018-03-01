<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/1/19
  Time: 上午10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../../css/demo.css">

    <script src="../../scripts/boot.js" type="text/javascript"></script>
    <script src="../../js/swfupload.js" type="text/javascript"></script>
    <script src="../../js/ajaxfileupload.js" type="text/javascript"></script>
    <style>
        .table1 {
            width: 100%;
            margin: 1px;
            border: 1px solid gainsboro;
        }

        /*td {*/
        /*border-collapse: collapse;*/
        /*padding: 3px;*/
        /*height: 20px;*/
        /*}*/

        .trTitle {
            background-color: #daeeff;
            color: #427dc0;
        }


        html body .user_add .mini-buttonedit-icon {
            background: url(/scripts/miniui/res/images/user_add.png) no-repeat 50% 50%;
        }


    </style>
</head>
<body>
<%--页面修改 修改人王文 时间2018.2.8--%>
<%--<table cellpadding="1" cellspacing="2" class="table1">--%>
<%--<tr>--%>
<%--<td class="trTitle" colspan="4">当前位置: 综合管理 >> 机组管理</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td>--%>
<td class="trTitle" colspan="4">当前位置: 综合管理 >> 机组管理</td>
<div id="layout1" class="mini-layout" style="width:100%; height: 100%;"
     borderStyle="border:solid 1px #aaa;">
    <div title="查询条件" style="background-color: #daeeff" region="north" height="80"
         showSplitIcon="true">
        <table>
            <tr style="text-align: center">
                <td style="width:80px">机组名称</td>
                <td>
                    <input id="macName" style="width: 200%"/>
                </td>
                <td style="width: 30%"></td>
                <td style="width:80px">机组管理人</td>
                <td>
                    <input id="macManageStaffName" style="width: 200%"
                           class="mini-buttonedit user_add"
                           onbuttonclick="onManageButtonEdit"
                           name="macManageStaffNo" textName="macManageStaffName"/>
                </td>
            </tr>
        </table>
    </div>
    <div title="center" region="center" style="width: 100%; height: 800px">
        <div style="background-color: #c4c2c9">
            <a class="mini-button" iconCls="icon-add" onclick="addRow()" plain="true" style="float: right">增加</a>
            <a class="mini-button" iconCls="icon-remove" onclick="removeRow()" plain="true" style="float: right">删除</a>
            <a class="mini-button" iconCls="icon-search" onclick="search()" plain="true" style="float: right">查询</a>
        </div>
        <div id="datagrid1" class="mini-datagrid"
             url="/manage/selectMac"
             multiSelect="true"
             style="width: 100%;height: 80%"
             sizeList="[5,10,20,50]"
             pageSize="10">
            <div property="columns">
                <div type="checkcolumn"></div>
                <div header="机组名称" field="macName"></div>
                <div header="机组管理人" field="macManageStaffName"></div>
                <div header="创建时间" field="createDate" dateFormat="yyyy/MM/dd HH:mm:ss"></div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
    mini.parse();

    var datagrid1 = mini.get("datagrid1");
    datagrid1.load();

    function onTabPositionChange(value) {
        var tabs = mini.get("tabs1");
        tabs.setTabPosition(value);
    }

    function onTabAlignChange(value) {
        var tabs = mini.get("tabs1");
        tabs.setTabAlign(value);
    }

    function onManageButtonEdit(e) {
        //加载mini组件 后面的get方法才好用
        var btnEdit = this;
        mini.open({
            url: "/manage/MacApplicantWindow",
            title: "选择机组管理员",
            width: 650,
            height: 380,
            ondestroy: function (action) {

                if (action == "ok") {
                    var iframe = this.getIFrameEl();
                    var data = iframe.contentWindow.GetData();
                    data = mini.clone(data);    //必须
                    if (data) {
                        btnEdit.setValue(data.macManageStaffName);
                        btnEdit.setText(data.macManageStaffName);
                    }
                }

            }
        })
    }

    function search() {
//        var name = mini.get("name").getValue();
        var macName = $("#macName").val();
        var macManageStaffName = mini.get("macManageStaffName").getValue();
        datagrid1.setUrl("/manage/selectMac");

        datagrid1.load({
            macName:macName,
            macManageStaffName:macManageStaffName

        });

    }

</script>
</body>
</html>
