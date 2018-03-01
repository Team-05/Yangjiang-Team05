<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/2/8
  Time: 下午3:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>承接外部项目审批</title>

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

        td {
            border-collapse: collapse;
            padding: 3px;
            height: 20px;
        }


        html body .user_add .mini-buttonedit-icon {
            background: url(/scripts/miniui/res/images/user_add.png) no-repeat 50% 50%;
        }

    </style>
</head>
<body>

<div>
    <div id="div1" class="mini-panel"
         margin-top="0px" title="项目基本信息"
         style="width:100%;height: 200px;background-color:#daeeff "
         showCollapseButton="true"
         allowResize="false" collapseOnTitleClick="true">

        <table>
            <tr>
                <td style="width:120px">项目名称<font color="red">※</font></td>
                <td>
                    <input id="rr" style="width: 40%;padding-left: 130px"/>
                </td>
            </tr>
            <tr>
                <td style="width:120px">项目来源<font color="red">※</font></td>
                <td>
                    <div style="horiz-align: center">
                        <div style="horiz-align: center">
                            <input type="checkbox">政府部门
                            <input type="checkbox">行业协会
                            <input type="checkbox">集团

                            <input type="checkbox" onclick="energyTypeCheck(this);">其他
                            <input style="display:none; height: 120%; float: right" name="energyType"
                                   type="text" id="Checkbox5"/>
                        </div>
                    </div>

                </td>
            </tr>

            <tr>
                <td style="width:120px">申报单位<font color="red">※</font></td>
                <td>
                    <input id="aa" style="width: 40%;padding-left: 130px"/>
                </td>

                <td style="width:120px">联合申报单位<font color="red">※</font></td>
                <td>
                    <input id="bb" style="width: 40%;padding-left: 130px"/>
                </td>
            </tr>
            <tr>
                <td style="width:120px">应用方向 <font color="red">※</font></td>
                <td colspan="3"><input style="width: 100%;overflow-y:auto" class="mini-textarea"/></td>
            </tr>

        </table>

    </div>

    <div id="div2" class="mini-panel"
         margin-top="0px" title="项目成果"
         style="width:100%;height: 310px"
         showCollapseButton="true"
         allowResize="true" collapseOnTitleClick="true">


        <table style="width: 100%">

            <tr>
                <td style="width:120px">成果应用<font color="red">※</font></td>
                <td colspan="3"><input style="width: 100%;overflow-y:auto" class="mini-textarea"/></td>
            </tr>
            <tr>
                <td style="width:80px">项目来源<font color="red">※</font></td>
                <td>
                    <div style="horiz-align: center">
                        <div style="horiz-align: center">
                            <input type="checkbox">专题报告
                            <input type="checkbox">技术方案
                            <input type="checkbox">技术标准
                            <input type="checkbox">硬件产品
                            <input type="checkbox">生产性文件
                            <input type="checkbox">设计文件
                            <input type="checkbox">计算机软件
                            <input type="checkbox" onclick="energyTypeCheck(this);">其他
                            <input style="display:none; height: 120%; float: right" name="energyType"
                                   type="text" id="Checkbox"/>
                        </div>
                    </div>

                </td>
            </tr>

            <tr>
                <%--<td style="width:120px">预计只是产权 <font color="red">※</font></td>--%>
                <%--Kinjer修改 2018.2.8 8:53--%>
                <td style="width:120px">预计知识产权 <font color="red">※</font></td>
                <td colspan="3"><input style="width: 100%;overflow-y:auto" class="mini-textarea"/></td>
            </tr>
            <tr>
                <td style="width:120px">预计经济效益<font color="red">※</font></td>
                <td colspan="3"><input style="width: 100%;overflow-y:auto" class="mini-textarea"/></td>
            </tr>
            <tr>
                <td style="width:120px">形成固定资产<font color="red">※</font></td>
                <td colspan="3"><input style="width: 100%;overflow-y:auto" class="mini-textarea"/></td>
            </tr>


        </table>

    </div>

    <div id="div3" class="mini-panel"
         margin-top="0px" title="预算信息"
         style="width:100%;height: 110px;background-color:#daeeff "
         showCollapseButton="true"
         allowResize="true" collapseOnTitleClick="true">

        <table style="width: 100%">
            <tr>
                <td style="width:120px">总预算<font color="red">※</font></td>
                <td>
                    <input id="sss" style="width: 40%;padding-left: 130px"/>
                </td>

                <td style="width:120px">外部经费<font color="red">※</font></td>
                <td>
                    <input id="ww" style="width: 40%;padding-left: 130px"/>
                </td>
            </tr>
            <tr>
                <td style="width:120px">公司经费<font color="red">※</font></td>
                <td>
                    <input id="ss" style="width: 40%;padding-left: 130px"/>
                </td>
            </tr>


        </table>


    </div>
    <div d="div4" class="mini-panel"
         margin-top="0px" title="预算信息"
         style="width:100%;height: 170px;background-color:#daeeff "
         showCollapseButton="true"
         allowResize="true" collapseOnTitleClick="true">
        <table>
        <tr>
            <td style="width:120px">审批意见</td>

            <td>
                <div id="listbox1" class="mini-listbox" onvaluechanged="remove1()" style="width:350px;height:120px;"
                     multiSelect="false">
                </div>
            </td>

            <td style="width:120px">常用词条</td>

            <td>
                <div id="listbox2" class="mini-listbox" multiSelect="false" onvaluechanged="add()"
                     style="width:350px;height:120px;"
                     textField="text"
                     url="../text/listboxText.txt">

                </div>
            </td>
        </tr>
        </table>
    </div>
    <table>
          <tr>
              <td colspan="4" style="width:100%">
                  <a style="float: right; margin-right: 50px" onclick="agree()" class="mini-button" iconCls="icon-ok">同意</a>
                  <a style="float: right; margin-right: 50px" onclick="disagree()" class="mini-button" iconCls="icon-no">不同意</a>
              </td>
          </tr>
      </table>


</div>

<script>

    mini.parse();
    var listbox1 = mini.get("listbox1");
    var listbox2 = mini.get("listbox2");

    function add() {

        var items = listbox2.getSelecteds();
        console.log(items);
        listbox2.removeItems(items);
        listbox1.addItems(items);
        listbox2.readOnly=true;
    }
    function remove1() {
        var items = listbox1.getSelecteds();
        console.log(items);
        listbox1.removeItems(items);
        listbox2.addItems(items);
        listbox2.readOnly=false;

    }
</script>

</body>
</html>
