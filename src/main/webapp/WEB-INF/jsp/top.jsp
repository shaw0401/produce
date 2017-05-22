<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/12
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Style/skin.css" />
    <script type="text/javascript">
        function logout() {
            if(window.confirm('您确定要退出吗？')) {
                top.location = 'login.html';
            }
        }
    </script>
</head>
<body>
<table cellpadding="0" width="100%" height="64" background="${pageContext.request.contextPath}/Images/top_top_bg.gif">
    <tr valign="top">
        <td width="50%"><a href="javascript:void(0)"><img style="border:none" src="${pageContext.request.contextPath}/Images/logo.png" /></a></td>
        <td width="30%" style="padding-top:13px;font:15px Arial,SimSun,sans-serif;color:#FFF">管理员：<b>RainMan</b> 您好，感谢登陆使用！</td>
        <td style="padding-top:10px;" align="center"><a href="javascript:void(0)"><img style="border:none" src="${pageContext.request.contextPath}/Images/index.gif" /></a></td>
        <td style="padding-top:10px;" align="center"><a href="javascript:void(0)"><img style="border:none" src="${pageContext.request.contextPath}/Images/out.gif" onclick="logout();" /></a></td>
    </tr>
</table>
</body>
</html>
