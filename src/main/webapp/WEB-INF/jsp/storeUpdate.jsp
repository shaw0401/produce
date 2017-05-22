<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/12
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Style/skin.css" />
    <!-- 日期插件，使用jquery -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/jquery/jquery-1.4.2.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/jquery/jquery.datepick.css" type="text/css">
    <script type="text/javascript" src="${pageContext.request.contextPath }/jquery/jquery.datepick.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/jquery/jquery.datepick-zh-CN.js"></script>
    <script type="text/javascript">
        $(function() {
            //使用class属性处理  'yy-mm-dd' 设置格式"yyyy/mm/dd"
            $('#prindate').datepick({dateFormat: 'yy-mm-dd'});

        })
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
                <tr><td height="31"><div class="title"></div></td></tr>
            </table>
        </td>
        <td width="16" valign="top" background="${pageContext.request.contextPath}/Images/mail_right_bg.gif"><img src="${pageContext.request.contextPath}/Images/nav_right_bg.gif" width="16" height="29" /></td>
    </tr>
    <!-- 中间部分开始 -->
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
                                <td valign="bottom"><h3 style="letter-spacing:1px;">库存修改！</h3></td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <!-- 一条线 -->
                <tr>
                    <td height="40" colspan="4">
                        <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                            <tr><td></td></tr>
                        </table>
                    </td>
                </tr>
                <!-- 添加产品开始 -->
                <tr>
                    <td width="2%">&nbsp;</td>
                    <td width="96%">
                        <table width="100%">
                            <tr>
                                <td colspan="2">
                                    <form action="/updateStore" method="post">
                                        <table width="100%"class="cont">
                                            <tr>
                                                <td width="2%">&nbsp;</td>
                                                <td width="15%">库存单号：</td>
                                                <td width="25%"><input class="text" type="text" name="princode"  value="${inStore.princode}" readonly/></td>
                                                <td width="2%">&nbsp;</td>
                                            </tr>
                                            <tr>
                                                <td width="2%">&nbsp;</td>
                                                <td width="15%">操作员：</td>
                                                <td width="25%">
                                                    <select name="operatorcode">
                                                        <c:forEach items="${allOperator}" var="operators">
                                                                <option value="${operators.operatorcode}" <c:if test="${operators.operatorcode==inStore.operatorcode}">selected</c:if>>${operators.operatorname}</option>
                                                        </c:forEach>
                                                    </select>
                                                   </td>
                                                <td width="2%">&nbsp;</td>
                                            </tr>
                                           <tr>
                                                <td width="2%">&nbsp;</td>
                                                <td>入库单据日期：</td>
                                                <td width="20%"><input class="text" type="text" name="prinDate" id="prindate" value="<fmt:formatDate
                                                            type="date"
                                                            value="${inStore.prindate}"
                                                            pattern="yyyy-MM-dd"/>"/></td>
                                                <td width="2%">&nbsp;</td>
                                            </tr>
                                             <tr>
                                                 <td width="2%">&nbsp;</td>
                                                 <td>生产单号：</td>
                                                 <td width="20%">
                                                     <select name="prproducecode">
                                                         <c:forEach items="${produces}" var="produces">
                                                             <option value="${produces.prproducecode}" <c:if test="${produces.prproducecode==inStore.prproducecode}">selected</c:if>>${produces.prproducecode}</option>
                                                         </c:forEach>
                                                     </select>
                                                     </td>
                                                 <td width="2%">&nbsp;</td>
                                             </tr>
                                             <tr>
                                                 <td width="2%">&nbsp;</td>
                                                 <td>仓库代码：</td>
                                                 <td width="20%"><input class="text" type="text" name="storecode" value="${inStore.storecode}" /></td>
                                                 <td width="2%">&nbsp;</td>
                                             </tr>
                                            <tr>
                                                <td width="2%">&nbsp;</td>
                                                <td>产成品代码：</td>
                                                <td width="20%">
                                                    <select name="invencode">
                                                        <c:forEach items="${bsinvens}" var="bsinvens">
                                                            <option value="${bsinvens.invencode}" <c:if test="${bsinvens.invencode==inStore.invencode}">selected</c:if>>${bsinvens.invenname}</option>
                                                        </c:forEach>
                                                    </select>
                                                    </td>
                                                <td width="2%">&nbsp;</td>
                                            </tr>
                                             <tr>
                                                 <td width="2%">&nbsp;</td>
                                                 <td>生产数量：</td>
                                                 <td width="20%"><input class="text" type="text" name="prquantity" value="${inStore.prquantity}" /></td>
                                                 <td width="2%">&nbsp;</td>
                                             </tr>
                                            <tr>
                                                <td width="2%">&nbsp;</td>
                                                <td>入库数量：</td>
                                                <td width="20%"><input class="text" type="text" name="inquantity" id="inquantity"  value="${inStore.inquantity}"/></td>
                                                <td width="2%">&nbsp;</td>
                                            </tr>
                                           <tr>
                                                 <td width="2%">&nbsp;</td>
                                                 <td>入库人员：</td>
                                                 <td width="20%"><input class="text" type="text" name="employeecode" id="employeecode" value="${inStore.employeecode}"/></td>
                                                 <td width="2%">&nbsp;</td>
                                             </tr>
                                             <tr>
                                                 <td width="2%">&nbsp;</td>
                                                 <td>是否审核：</td>
                                                 <td width="20%">
                                                     <select name="isflag" class="text">
                                                         <c:if test="${inStore.isflag==0}">
                                                             <option value="0" selected>未审核</option>
                                                             <option value="1" >已审核</option>
                                                         </c:if>
                                                         <c:if test="${inStore.isflag==1}">
                                                             <option value="1" selected>已审核</option>
                                                             <option value="0" >未审核</option>
                                                         </c:if>
                                                     </select>
                                                 <%--<td>已审核</td>
                                                 <td>未审核</td>--%>
                                                 </td>
                                                 <td width="2%">&nbsp;</td>
                                             </tr>

                                            <tr>
                                                <td>&nbsp;</td>
                                                <td colspan="3"><input class="btn" type="submit" value="提交" /></td>
                                                <td>&nbsp;</td>
                                            </tr>
                                        </table>
                                    </form>
                                </td>
                            </tr>
                        </table>
                    </td>
                    <td width="2%">&nbsp;</td>
                </tr>
                <!-- 添加产品结束 -->
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
</table>
</body>
</html>
