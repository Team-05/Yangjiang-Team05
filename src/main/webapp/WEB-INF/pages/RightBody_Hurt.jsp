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


    </style>
</head>
<body>
<%--修改layout 修改人王文 时间2018.2.8--%>
<%--<table cellpadding="1" cellspacing="2" class="table1">--%>
<%--<tr>--%>
<%--<td class="trTitle" colspan="4">当前位置: 综合管理 >> 机组管理</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td>--%>
<div class="trTitle" colspan="4">当前位置: 综合管理 >>射线探伤人员管理</div>
<div id="layout1" class="mini-layout" style="width:100%; height: 100%;"
     borderStyle="border:solid 0px #aaa;">
    <div title="查询条件" style="background-color: #daeeff" region="north" height="110px"
         showSplitIcon="true">
        <table>
            <tr>
                <td style="width:80px">姓名</td>
                <td>
                    <input id="name" style="width: 200%"/>
                </td>
                <td style="width: 30%"></td>
                <td style="width:80px">通行卡号</td>
                <td>
                    <input id="cardNumber" style="width: 200%"/>
                </td>
            </tr>
            <tr>
                <td style="width:80px">单位</td>
                <td>
                    <input id="workAddress" style="width: 200%"/>
                </td>
                <td style="width: 30%"></td>
                <td style="width:80px">员工号</td>
                <td>
                    <input id="staffNumber" style="width: 200%"/>
            </tr>
            <tr>
                <td style="width:80px">关键字</td>
                <td>
                    <input id="keyWord" style="width: 200%"/>
                </td>
            </tr>
        </table>
    </div>

            <div title="center" region="center" style="width: 100%; height: 800px">
                <div style="background-color: #E9EBF0">
                    <a class="mini-button" iconCls="icon-add" onclick="addRow()" plain="true" style="float: right">增加</a>
                    <a class="mini-button" iconCls="icon-remove" onclick="removeRow()" plain="true" style="float: right">删除</a>
                    <a class="mini-button" iconCls="icon-search" onclick="search()" plain="true" style="float: right">查询</a>
                </div>
                <div id="datagrid1" class="mini-datagrid"
                     url="/person_center/showPCDetail"
                     multiSelect="true"
                     style="width: 100%;height: 80%"
                     sizeList="[5,10,20,50]"
                     pageSize="10">
                    <div property="columns">
                        <div type="checkcolumn"></div>
                        <div header="姓名" field="name"></div>
                        <div header="通行卡号" field="cardNumber"></div>
                        <div header="单位" field="workAddress"></div>
                        <div header="RT级别" field="rtLevel"></div>
                        <div header="RT编号" field="rtNumber"></div>
                        <div header="开始日期" field="startTime"></div>
                        <div header="结束日期" field="endTime"></div>
                    </div>
                </div>
            </div>
        </div>


<%--<tr>--%>
<%--<td>--%>
<%--<a class="mini-button" iconCls="icon-add" onclick="addRow()" plain="true" style="float: right">增加</a>--%>
<%--<a class="mini-button" iconCls="icon-remove" onclick="removeRow()" plain="true" style="float: right">删除</a>--%>
<%--<a class="mini-button" iconCls="icon-search" onclick="search()" plain="true" style="float: right">查询</a>--%>
<%--<div id="listbox2" class="mini-listbox" style="width:100%;"--%>
<%--value="cn" onvaluechanged="onListBoxValueChanged"--%>
<%--url="../text/unit.txt" showCheckBox="true" multiSelect="true">--%>
<%--<div property="columns">--%>
<%--<div header="姓名" field="name"></div>--%>
<%--<div header="通行卡号" field="cardNumber"></div>--%>
<%--<div header="单位" field="workAddress"></div>--%>
<%--<div header="RT级别" field="rtLevel"></div>--%>
<%--<div header="RT编号" field="rtNumber"></div>--%>
<%--<div header="开始日期" field="startTime"></div>--%>
<%--<div header="结束日期" field="endTime"></div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td>--%>
<%--<div class="mini-pager" style="width:100%;background:#f0f3f7;border:solid 1px #ccc;    "--%>
<%--totalCount="${session.pageBean.totalPage}" onpagechanged="onPageChanged"--%>
<%--sizeList="[5,10,20,100]"--%>
<%--showPageSize="true" showPageIndex="true" showPageInfo="true"--%>
<%--buttons="#buttons">--%>
<%--</div>--%>
<%--</td>--%>
<%--</tr>--%>
<%--</table>--%>


<script type="text/javascript">
    mini.parse();

    function onTabPositionChange(value) {
        var tabs = mini.get("tabs1");
        tabs.setTabPosition(value);
    }

    function onTabAlignChange(value) {
        var tabs = mini.get("tabs1");
        tabs.setTabAlign(value);
    }

    function onClazzButtonEdit(e) {
        //加载mini组件 后面的get方法才好用
        var btnEdit = this;
        mini.open({
            url: "page/SelectGridWindow.html",
            title: "选择班级",
            width: 650,
            height: 380,
            ondestroy: function (action) {
                //if (action == "close") return false;
                if (action == "ok") {
                    var iframe = this.getIFrameEl();
                    var data = iframe.contentWindow.GetData();
                    data = mini.clone(data);    //必须
                    if (data) {
                        btnEdit.setValue(data.cid);
                        btnEdit.setText(data.cname);
                    }
                }

            }
        })
    }
    function onStudentButtonEdit(e) {
        //加载mini组件 后面的get方法才好用
        var btnEdit = this;
        mini.open({
            url: "page/SelectStudent.html",
            title: "选择学生",
            width: 650,
            height: 380,
            ondestroy: function (action) {
                //if (action == "close") return false;
                if (action == "ok") {
                    var iframe = this.getIFrameEl();
                    var data = iframe.contentWindow.GetData();
                    data = mini.clone(data);    //必须
                    if (data) {
                        btnEdit.setValue(data.sid);
                        btnEdit.setText(data.sname);
                    }
                }

            }
        })
    }


</script>
</body>
</html>
