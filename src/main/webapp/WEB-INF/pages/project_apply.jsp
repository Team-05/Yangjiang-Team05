<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/2/5
  Time: 上午10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../../css/demo.css">

    <script src="../../scripts/boot.js" type="text/javascript"></script>
    <%--<script src="page/swfupload/swfupload.js" type="text/javascript"></script>--%>
    <%--<script src="page/js/ajaxfileupload.js" type="text/javascript"></script>--%>
    <%--<script src="page/js/jquery.cookie.js" type="text/javascript"></script>--%>

    <style type="text/css">
        .table1 {
            width: 100%;
            margin: 1px;
            border: 1px solid gainsboro;
        }

        td {
            border-collapse: collapse;
            padding: 3px;
            height: 25px;
        }

        .trTitle {
            background-color: #daeeff;
            color: #427dc0;
        }

        input {
            height: 20px;
            text-align: center;
            vertical-align: text-bottom;
        }
    </style>
</head>
<body>

<form id="form">
        <%--基本信息TAB--%>
            <div class="trTitle" colspan="4">当前位置: 项目成果与计划调整申请</div>
            <table cellpadding="1" cellspacing="2" class="table1">
                <tr>
                    <td class="trTitle" colspan="4">申请信息</td>
                </tr>
                <tr>
                    <td style="width:120px">项目名称 <font color="red">※</font></td>
                    <td><input style="width: 100%" class="mini-textarea"/></td>
                </tr>
                <tr>
                    <td style="width:120px">承担部门 <font color="red">※</font></td>
                    <td><input id="btnEdit2" style="width: 100%"
                               class="mini-buttonedit user_add"
                               allowInput="false"
                               onbuttonclick="onClazzButtonEdit"
                               name="cid" textName="cname"/>
                    </td>
                    <td style="width:120px">项目负责人 <font color="red">※</font></td>
                    <td><input id="btnEdit3" style="width: 100%"
                               class="mini-buttonedit user_add"
                               allowInput="false"
                               onbuttonclick="onClazzButtonEdit"
                               name="cid" textName="cname"/>
                    </td>
                </tr>
                <tr>
                    <td style="width:120px">调整原因 <font color="red">※</font></td>
                    <td colspan="3"><input style="width: 100%;overflow-y:auto" class="mini-textarea"/></td>
                </tr>
                <tr>
                    <td style="width:120px">调整原因 <font color="red">※</font></td>
                    <td colspan="3"><input style="width: 100%;overflow-y:auto" class="mini-textarea"/></td>
                </tr>
                <tr>
                <td class="trTitle" colspan="4">流程信息</td>
            </tr>
                <tr>
                    <td style="width:120px">承担部门 <font color="red">※</font></td>
                    <td><input id="btnEdit" style="width: 100%"
                               class="mini-buttonedit user_add"
                               allowInput="false"
                               onbuttonclick="onClazzButtonEdit"
                               name="cid" textName="cname"/>
                    </td>
                </tr>
            </table>
        <%--其他信息TAB--%>
    <input type="submit" value="提交" style="float: right">
</form>

<script>
    mini.parse();
    //审批(部门经理)弹出框的点击事件
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

    function energyTypeCheck (chk) {
        var Checkbox5 = document.getElementById('Checkbox5');
        if (chk.checked) {
            Checkbox5.style.display = 'block';
        } else {
            Checkbox5.style.display = 'none';
        }
    }



    //    //先找到tab组件
    //    var tabs = mini.get("tabs1");
    //    //给tab组件加入监听事件,tab切换前保存数据
    //    tabs.on("beforeactivechanged",function (e) {
    //
    //        var tabs = e.sender();
    //        var iframe = tabs.getTabIFrameEl(tabs.getTab(0));
    //        var data = iframe.contentWindow.getForm();
    //
    //        $.cookie("form",data);
    //
    //        //将第一个tab中数据保存到cookie中
    //
    //    });
    function getForm() {
        var form = new mini.Form("#form");
        var data = form.getData();
        var s = mini.encode(data);
        return s;
    }

    function submitForm() {
        /**
         * 1.获得基本信息tab中的数据,cookies取
         * 2.获得当前其他信息tab中的数据,直接获取当前表单
         * 3.将数据传递给后台
         */
        var data = getForm();
        $("#form").val(data);

        $.ajaxFileUpload({
            url:"fileUploac.action",
            fileElementId:"${"upload"}",
            success:function (d) {

            }

        })
    }

</script>
</body>
</html>

