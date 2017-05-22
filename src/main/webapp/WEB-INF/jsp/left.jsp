<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/12
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script src="${pageContext.request.contextPath}/Js/prototype.lite.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/Js/moo.fx.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/Js/moo.fx.pack.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Style/skin.css" />
    <script type="text/javascript">
        window.onload = function () {
            var contents = document.getElementsByClassName('content');
            var toggles = document.getElementsByClassName('type');

            var myAccordion = new fx.Accordion(
                toggles, contents, {opacity: true, duration: 400}
            );
            myAccordion.showThisHideOpen(contents[0]);
            for(var i=0; i<document .getElementsByTagName("a").length; i++){
                var dl_a = document.getElementsByTagName("a")[i];
                dl_a.onfocus=function(){
                    this.blur();
                }
            }
        }
    </script>
</head>

<body>
<table width="100%" height="280" border="0" cellpadding="0" cellspacing="0" bgcolor="#EEF2FB">
    <tr>
        <td width="182" valign="top">
            <div id="container">
                <h1 class="type"><a href="javascript:void(0)">生产计划</a></h1>
                <div class="content">
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td><img src="${pageContext.request.contextPath}/Images/menu_top_line.gif" width="182" height="5" /></td>
                        </tr>
                    </table>
                    <ul class="RM">
                        <li><a href="${pageContext.request.contextPath}/toAddPlan" target="main">添加生产计划</a></li>
                        <li><a href="${pageContext.request.contextPath}/list" target="main">生产计划列表</a></li>
                    </ul>
                </div>
                <h1 class="type"><a href="javascript:void(0)">生产主信息</a></h1>
                <div class="content">
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td><img src="${pageContext.request.contextPath}/Images/menu-top-line.gif" width="182" height="5" /></td>
                        </tr>
                    </table>
                    <ul class="RM">
                        <li><a href="${pageContext.request.contextPath}/toAddProduce" target="main">添加主信息表</a></li>
                        <li><a href="${pageContext.request.contextPath}/produceList" target="main">生产主信息列表</a></li>
                    </ul>
                </div>
                <h1 class="type"><a href="javascript:void(0)">生产物料管理</a></h1>
                <div class="content">
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td><img src="${pageContext.request.contextPath}/Images/menu-top-line.gif" width="182" height="5" /></td>
                        </tr>
                    </table>
                    <ul class="RM">
                        <li><a href="${pageContext.request.contextPath}/produceItemList" target="main">生产物流需求列表</a></li>
                        <li><a href="${pageContext.request.contextPath}/toProduceItemAdd" target="main">添加生产物料需求</a></li>
                    </ul>
                </div>
                <!-- *********** -->
                <h1 class="type"><a href="javascript:void(0)">入库管理</a></h1>
                <div class="content">
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td><img src="${pageContext.request.contextPath}/Images/menu_top_line.gif" width="182" height="5" /></td>
                        </tr>
                    </table>
                    <ul class="RM">
                        <li><a href="${pageContext.request.contextPath}/storesList" target="main">库存列表</a></li>
                        <li><a href="${pageContext.request.contextPath}/toStoreAdd" target="main">入库</a></li>

                    </ul>
                </div>

                <!-- *********** -->
            </div>
        </td>
    </tr>
</table>
</body>
</html>
