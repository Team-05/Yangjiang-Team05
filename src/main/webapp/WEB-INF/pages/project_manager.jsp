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
        table {
            width: 100%;
            margin: 1px;
            border: 1px solid #b6e5ff;
            border-collapse: collapse;
        }

        /*td {*/
        /*border-collapse: collapse;*/
        /*padding: 3px;*/
        /*height: 20px;*/
        /*}*/


        html body .user_add .mini-buttonedit-icon {
            background: url(/scripts/miniui/res/images/user_add.png) no-repeat 50% 50%;
        }

    </style>
</head>
<body>

<div >
    <div id="div1" class="mini-panel"
         margin-top="0px" title="申请信息"
         style="width:100%;height: 200px;background-color:#daeeff "
         showCollapseButton="true"
         allowResize="false" collapseOnTitleClick="true">

        <table style="width: 100%;height: 100%">
            <tr>
                <td style="width:120px">项目名称<font color="red">※</font></td>
                <td>
                    <input id="rr" style="width: 40%;"/>
                </td>
            </tr>
            <tr>
                <td style="width:80px">承担部门</td>
                <td>
                    <input id="btnEdit1" style="width: 40%"
                           class="mini-buttonedit user_add"
                           allowInput="false"
                           onbuttonclick="onDepartmentButtonEdit"
                           name="depId" textName="depName"/>
                </td>
                <td style="width:80px">项目负责人</td>
                <td>
                    <input id="btnEdit2" style="width: 40%"
                           class="mini-buttonedit user_add"
                           allowInput="false"
                           onbuttonclick="onApplicantButtonEdit"
                           name="staffId" textName="staffName"/>
                </td>
            </tr>

            <tr>
            <tr>
                <td style="width:120px">调整原因<font color="red">※</font></td>
                <td colspan="3"><input style="width: 100%;overflow-y:auto" class="mini-textarea"/></td>
            </tr>
            </tr>
            <tr>
            <tr>
                <td style="width:120px">调整内容<font color="red">※</font></td>
                <td colspan="3"><input style="width: 100%;overflow-y:auto" class="mini-textarea"/></td>
            </tr>
            </tr>
        </table>
    </div>
    <input type="button" value="提交" style="float: right">
</div>
<script>
    mini.parse();

    function onDepartmentButtonEdit(e) {
        //加载mini组件 后面的get方法才好用
        var btnEdit = this;
        mini.open({
            url: "/person_center/deptGridWindow",
            title: "选择部门",
            width: 650,
            height: 380,
            ondestroy: function (action) {
                //if (action == "close") return false;
                if (action == "ok") {
                    var iframe = this.getIFrameEl();
                    var data = iframe.contentWindow.GetData();
                    data = mini.clone(data);    //必须
                    if (data) {
                        btnEdit.setValue(data.depName);
                        btnEdit.setText(data.depName);
                    }
                }

            }
        })
    }

    function onApplicantButtonEdit(e) {
        //加载mini组件 后面的get方法才好用
        var btnEdit = this;

        mini.open({
            url: "/person_center/applicantGridWindow",
            title: "选择负责人",
            width: 650,
            height: 380,
            ondestroy: function (action) {
                //if (action == "close") return false;
                if (action == "ok") {
                    var iframe = this.getIFrameEl();
                    var data = iframe.contentWindow.GetData();
                    data = mini.clone(data);    //必须
                    if (data) {
                        btnEdit.setValue(data.staffName);
                        btnEdit.setText(data.staffName);
                    }
                }

            }
        })
    }

</script>
</body>
</html>

