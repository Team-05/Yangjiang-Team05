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
<div id="tabs1" class="mini-tabs" activeIndex="0" style="width:100%;height:100%;" plain="false">
    <div title="待办任务" style="width: 100%">

        <div class="trTitle" colspan="4">当前位置: 个人工作平台 >> 待办任务</div>

        <div id="layout1" class="mini-layout" style="width:100%; height: 97%;"
             borderStyle="border:solid 1px #aaa;">
            <div title="查询条件" style="background-color: #daeeff;" region="north" height="120"
                 showSplitIcon="true">
                <table>
                    <tr>
                        <td style="width:80px">申请时间</td>
                        <td>
                            <input id="date1" style="width: 200%" class="mini-datepicker"/>
                        </td>
                        <td style="width: 30%"></td>
                        <td style="width:80px">关键词</td>
                        <td>
                            <input id="appId1" type="text" style="width: 200%;height: 25px" class="mini-textarea">
                        </td>
                    </tr>
                    <tr>
                        <td style="width:80px">申请人</td>
                        <td>
                            <input id="applicant1" style="width: 200%"
                                   class="mini-buttonedit user_add"
                                   allowInput="false"
                                   onbuttonclick="onApplicantButtonEdit"
                                   name="staffId" textName="staffName"/>
                        </td>
                        <td style="width: 30%"></td>
                        <td style="width:80px">所属部门</td>
                        <td>
                            <input id="dept1" style="width: 200%"
                                   class="mini-buttonedit user_add"
                                   allowInput="false"
                                   onbuttonclick="onDepartmentButtonEdit"
                                   name="depId" textName="depName"/>
                        </td>

                    </tr>

                </table>

                <button style="float: right;" onclick="search1()">查询</button>

            </div>
            <div title="center" region="center" style="width: 100%; height: 800px">
                <div id="datagrid1" class="mini-datagrid"
                     url="/person_center/showPCDetail"
                     multiSelect="true"
                     style="width: 100%;height: 80%"
                     sizeList="[5,10,20,50]"
                     pageSize="10">
                    <div property="columns">
                        <div type="checkcolumn"></div>
                        <div field="appId" width="120" headerAlign="center">流程编号</div>
                        <div field="appType" width="120" headerAlign="center">流程名称</div>
                        <div field="appDeptName" width="120" headerAlign="center">所属部门</div>
                        <div field="status" width="120" headerAlign="center">当前环节</div>
                        <div field="flowAppStaffName" width="120" headerAlign="center">提报人</div>
                        <div field="applyDate" dateFormat="yyyy/MM/dd HH:mm:ss" width="120" headerAlign="center">提报时间
                        </div>
                        <div name="ctrl" width="120" headerAlign="center">操作</div>
                    </div>
                </div>

            </div>
        </div>


    </div>
    <div title="已办任务">

        <div class="trTitle" colspan="4">当前位置: 个人工作平台 >> 已办任务</div>

        <div id="layout2" class="mini-layout" style="width:100%; height: 97%;"
             borderStyle="border:solid 1px #aaa;">
            <div title="查询条件" style="background-color: #daeeff;" region="north" height="120"
                 showSplitIcon="true">
                <table>
                    <tr>
                        <td style="width:80px">申请时间</td>
                        <td>
                            <input id="date2" style="width: 200%" class="mini-datepicker"/>
                        </td>
                        <td style="width: 30%"></td>
                        <td style="width:80px">关键词</td>
                        <td>
                            <input id="appId2" type="text" style="width: 200%;height: 25px" class="mini-textarea">
                        </td>
                    </tr>
                    <tr>
                        <td style="width:80px">申请人</td>
                        <td>
                            <input id="applicant2" style="width: 200%"
                                   class="mini-buttonedit user_add"
                                   allowInput="false"
                                   onbuttonclick="onApplicantButtonEdit"
                                   name="staffId" textName="staffName"/>
                        </td>
                        <td style="width: 30%"></td>
                        <td style="width:80px">所属部门</td>
                        <td>
                            <input id="dept2" style="width: 200%"
                                   class="mini-buttonedit user_add"
                                   allowInput="false"
                                   onbuttonclick="onDepartmentButtonEdit"
                                   name="depId" textName="depName"/>
                        </td>

                    </tr>

                </table>

                <button style="float: right;" onclick="search2()">查询</button>

            </div>
            <div title="center" region="center" style="width: 100%; height: 800px">
                <div id="datagrid2" class="mini-datagrid"
                     url="/person_center/showPCDetail"
                     multiSelect="true"
                     style="width: 100%;height: 80%"
                     sizeList="[5,10,20,50]"
                     pageSize="10">
                    <div property="columns">
                        <div type="checkcolumn"></div>
                        <div field="appId" width="120" headerAlign="center">流程编号</div>
                        <div field="appType" width="120" headerAlign="center">流程名称</div>
                        <div field="appDeptName" width="120" headerAlign="center">所属部门</div>
                        <div field="status" width="120" headerAlign="center">当前环节</div>
                        <div field="flowAppStaffName" width="120" headerAlign="center">提报人</div>
                        <div field="applyDate" dateFormat="yyyy/MM/dd HH:mm:ss" width="120" headerAlign="center">提报时间
                        </div>
                        <div name="ctrl" width="120" headerAlign="center">操作</div>
                    </div>
                </div>

            </div>

        </div>
    </div>
</div>


<script type="text/javascript">

    mini.parse();
    var datagrid1 = mini.get("datagrid1");
    datagrid1.load({handleFlag:0,status:1});

    function search1() {
        var applyDate = mini.get("date1").getFormValue("yyyy-MM-dd");
        var appId = mini.get("appId1").getValue();
        var flowAppStaffName = mini.get("applicant1").getValue();
        var appDeptName = mini.get("dept1").getValue();

        datagrid1.load({handleFlag:0,applyDate:applyDate,appId:appId,flowAppStaffName:flowAppStaffName,appDeptName:appDeptName,status:1});
    }

    var datagrid2 = mini.get("datagrid2");
    datagrid2.load({handleFlag:1,status:1});

    function search2() {
        var applyDate = mini.get("date2").getFormValue("yyyy-MM-dd");
        var appId = mini.get("appId2").getValue();
        var flowAppStaffName = mini.get("applicant2").getValue();
        var appDeptName = mini.get("dept2").getValue();

        datagrid1.load({handleFlag:1,applyDate:applyDate,appId:appId,flowAppStaffName:flowAppStaffName,appDeptName:appDeptName,status:1});
    }


    function onDepartmentButtonEdit(e) {
        //加载mini组件 后面的get方法才好用
        var btnEdit = this;
        mini.open({
            url: "/person_center/deptGridWindow",
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
                        btnEdit.setValue(data.staffName);
                        btnEdit.setText(data.staffName);
                    }
                }

            }
        })
    }

    datagrid1.on("drawcell", function (e) {
        var record = e.record,
                column = e.column;


        //ctrl列，超连接操作按钮
        if (column.name == "ctrl") {
            e.cellStyle = "text-align:center";
            e.cellHtml = "<input type='button' value='办理' onclick=''/>";

        }

    });

    datagrid2.on("drawcell", function (e) {
        var record = e.record,
                column = e.column;

        //ctrl列，超连接操作按钮
        if (column.name == "ctrl") {
            e.cellStyle = "text-align:center";
            e.cellHtml = "<input type='button' value='办理' onclick=''/>";

        }

    });


</script>
</body>
</html>
