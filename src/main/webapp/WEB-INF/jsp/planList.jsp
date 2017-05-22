
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/12
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Style/skin.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath }/jquery/jquery-1.4.2.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn1").click(function(){
                $("input[name='checkbox']").attr("checked","true");
            })
        })
        $(function () {
            $("#btn2").click(function(){
                $("input[name='checkbox']").removeAttr("checked");
            })
        })
        function shanchu(){
            document.form1.action="deletePlanM"
        }
    </script>
</head>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <!-- 头部开始 -->
    <tr>
        <td width="17" valign="top" background="${pageContext.request.contextPath}/Images/mail_left_bg.gif">
            <img src="${pageContext.request.contextPath}/Images/left_top_right.gif" width="17" height="29" />
        </td>
        <td valign="top" background="${pageContext.request.contextPath}/Images/content_bg.gif">
            <table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" background="${pageContext.request.contextPath}/Images/content_bg.gif">
                <tr><td height="31"><div class="title">添加栏目</div></td></tr>
            </table>
        </td>
        <td width="16" valign="top" background="${pageContext.request.contextPath}/Images/mail_right_bg.gif"><img src="${pageContext.request.contextPath}/Images/nav_right_bg.gif" width="16" height="29" /></td>
    </tr>
    <!-- 中间部分开始 -->
    <form method="post" action="/list" name="form1">
    <tr>
        <!--第一行左边框-->
        <td valign="middle" background="${pageContext.request.contextPath}/Images/mail_left_bg.gif">&nbsp;</td>
        <!--第一行中间内容-->
        <td valign="top" bgcolor="#F7F8F9">
            <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
                <!-- 空白行-->
                <tr><td colspan="2" valign="top">&nbsp;</td><td>&nbsp;</td><td valign="top">&nbsp;</td></tr>
                <tr>
                    <td colspan="4">
                        <table>
                            <tr>
                                <td width="100" align="center"><img src="${pageContext.request.contextPath}/Images/mime.gif" /></td>
                                <td valign="bottom"><h3 style="letter-spacing:1px;">生产计划列表！</h3></td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <!-- 一条线 -->
                <tr>

                    <td colspan="2">销售订单号：<select name="seordercode">
                        <option value="">--请选择筛选条件--</option>
                        <c:forEach items="${orders}" var="orders">
                            <c:if test="${orders.seordercode==order.seordercode}">
                                <option value="${orders.seordercode}" selected>${orders.seordercode}</option>
                            </c:if>
                            <c:if test="${orders.seordercode!=order.seordercode}">
                                <option value="${orders.seordercode}" >${orders.seordercode}</option>
                            </c:if>
                        </c:forEach>
                    </select>&nbsp;&nbsp;&nbsp;<input type="submit" value="筛选"></td>
                    <td></td>
                </tr>
                <tr>
                    <td height="40" colspan="4">
                        <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                            <tr><td></td></tr>
                        </table>
                    </td>
                </tr>
                <!-- 产品列表开始 -->
                <tr>
                    <td width="2%">&nbsp;</td>
                    <td width="96%">
                        <table width="100%">
                            <tr>
                                <td colspan="2">
                                    <form action="" method="">
                                        <table width="40%" align="center">
                                            <tr>
                                                <input type="button" value="全选" id="btn1" name="btn1">&nbsp;&nbsp;&nbsp;
                                                <input type="button" value="反选" id="btn2" name="btn2" onclick="">&nbsp;&nbsp;&nbsp;
                                                <input type="submit" value="批量删除" id="btn3" name="btn3" onclick="if (confirm('确认删除吗？')){shanchu();}" > <span><font style="color: red">${msg}</font> </span>
                                            </tr>
                                        </table>
                                        <table width="100%"  class="cont tr_color">
                                            <tr>
                                                 <th>选择</th>
                                                <th>单据编号</th>
                                                <th>单据日期</th>
                                                <th>操作员编号</th>
                                                <th>销售订单号</th>
                                                <th>产品编号</th>
                                                <th>计划数量</th>
                                                <th>完成日期</th>
                                                <th>审核标记</th>
                                                <th>操作</th>
                                            </tr>
                                            <c:forEach items="${plans}" var="plans">
                                            <tr align="center" class="d">
                                                <td><input type="checkbox" name="checkbox" id="checkbox" value="${plans.prplancode}"></td>
                                                 <td>${plans.prplancode}</td>
                                                 <td><fmt:formatDate
                                                        type="date"
                                                        value="${plans.prplandate}"
                                                        pattern="yyyy-MM-dd"/></td>
                                                <td>${plans.syassignright.operatorname}</td>
                                                <td>${plans.seordercode}</td>
                                                <td>${plans.bsinven.invenname}</td>
                                                <td>${plans.quantity}</td>
                                                    <td><fmt:formatDate
                                                            type="date"
                                                            value="${plans.finishdate}"
                                                            pattern="yyyy-MM-dd"/></td>
                                                <c:if test="${plans.isflag==1}"><td>已审核</td></c:if>
                                                <c:if test="${plans.isflag==0}"><td>未审核</td></c:if>
                                                <td><a href="${pageContext.request.contextPath}/preUpdate?prplancode=${plans.prplancode}">修改</a>  <a href="${pageContext.request.contextPath}/deletePlan?prplancode=${plans.prplancode}" onclick="return confirm('确认删除该生产计划吗？')">删除</a></td>
                                            </tr>
                                            </c:forEach>
                                        </table>
                                    </form>
                                </td>
                            </tr>
                        </table>
                    </td>
                    <td width="2%">&nbsp;</td>
                </tr>
                <!-- 产品列表结束 -->
                <tr>
                    <td height="40" colspan="4">
                        <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                            <tr><td></td></tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td width="2%">&nbsp;</td>
                    <td width="51%" class="left_txt">
                        <img src="${pageContext.request.contextPath}/Images/icon_mail.gif" width="16" height="11"> 客户服务邮箱：rainman@foxmail.com<br />
                        <img src="${pageContext.request.contextPath}/Images/icon_phone.gif" width="17" height="14"> 官方网站：<a href="http://www.mycodes.net/" target="_blank">源码之家</a>
                    </td>
                    <td>&nbsp;</td><td>&nbsp;</td>
                </tr>
            </table>
        </td>
        <td background="${pageContext.request.contextPath}/Images/mail_right_bg.gif">&nbsp;</td>
    </tr>
    <!-- 底部部分 -->
    <tr>
        <td valign="bottom" background="${pageContext.request.contextPath}/Images/mail_left_bg.gif">
            <img src="${pageContext.request.contextPath}/Images/buttom_left.gif" width="17" height="17" />
        </td>
        <td background="${pageContext.request.contextPath}/Images/buttom_bgs.gif">
            <img src="${pageContext.request.contextPath}/Images/buttom_bgs.gif" width="17" height="17">
        </td>
        <td valign="bottom" background="${pageContext.request.contextPath}/Images/mail_right_bg.gif">
            <img src="${pageContext.request.contextPath}/Images/buttom_right.gif" width="16" height="17" />
        </td>
    </tr>
    </form>
</table>
</body>
</html>
