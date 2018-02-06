<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/2/6
  Time: 下午2:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../../css/demo.css">

    <script src="../../scripts/boot.js" type="text/javascript"></script>

    <style>

        .trTitle {
            background-color: #daeeff;
            color: #427dc0;
            margin: 1px;
            font-size: medium;
        }

        html body .user_add .mini-buttonedit-icon {
            background: url(/scripts/miniui/res/images/user_add.png) no-repeat 50% 50%;
        }

    </style>
</head>
<body>

<div title="综合查询" style="width: 100%">

    <div class="trTitle" colspan="4">当前位置: 综合管理 >> 卫星库管理人管理</div>

    <div id="layout1" class="mini-layout" style="width:100%; height: 97%;"
         borderStyle="border:solid 1px #aaa;">
        <div title="查询条件" style="background-color: #daeeff;" region="north" height="120"
             showSplitIcon="true">
            <table>

                <tr>
                    <td style="width:80px">申请人</td>
                    <td>
                        <input type="text" id="text1"/>
                    </td>
                    <td style="width: 30%"></td>
                    <td style="width:80px">管理人员</td>
                    <td>
                        <input id="btnEdit2" style="width: 200%"
                               class="mini-buttonedit user_add"
                               allowInput="false"
                               onbuttonclick="onDepartmentButtonEdit"
                               name="cid" textName="cname"/>
                    </td>

                </tr>


            </table>

            <button style="float: right;" onclick="search1()">查询</button>

        </div>
        <div title="center" region="center" style="width: 100%; height: 800px">
            <div id="datagrid1" class="mini-datagrid"
                 url=""
                 multiSelect="true"
                 style="width: 100%;height: 80%"
                 sizeList="[5,10,20,50]"
                 pageSize="10">
                <div property="columns">
                    <div type="checkcolumn"></div>
                    <div field="appId" width="120" headerAlign="center">卫星库</div>
                    <div field="appType" width="120" headerAlign="center">管理人员</div>
                    <div field="applyDate" dateFormat="yyyy/MM/dd HH:mm:ss" width="120" headerAlign="center">创建日期</div>
                    <div field="ctrl" width="120" headerAlign="center">是否有效</div>
                </div>
            </div>
        </div>
    </div>
</div>


<script type="text/javascript">

    mini.parse();
    var datagrid1 = mini.get("datagrid1");
    datagrid1.load();

    function search1() {
        var key = mini.get("key1").getValue();
        datagrid1.load({sname: key});
    }

    var datagrid2 = mini.get("datagrid2");
    datagrid2.load();

    function search2() {
        var key = mini.get("key2").getValue();
        datagrid1.load({sname: key});
    }


    function onDepartmentButtonEdit(e) {
        //加载mini组件 后面的get方法才好用
        var btnEdit = this;
        mini.open({
            url: "",
            title: "选择所属部门",
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
    function onApplicantButtonEdit(e) {
        //加载mini组件 后面的get方法才好用
        var btnEdit = this;
        mini.open({
            url: "",
            title: "选择申请人",
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
