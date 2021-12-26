<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body bgcolor="aqua">
<form action="${pageContext.request.contextPath}/user/Register" method="get">
    <table width="100%" height="100%">
        <tr>
            <td>
                <h1 align="center">请输入相关信息，最后按注册键进行注册</h1>
                <table border="1" align="center">
                    <tr>
                        <th>用户注册</th>
                    </tr>
                    <tr>
                        <td>
                            用户名:<input type="text" name="username" placeholder="请输入用户名">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            密 码 : <input type="password" name="password" placeholder="请输入密码">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            再次输入密码: <input type="password" name="passwordAgain" placeholder="请再次输入相同的密码">
                        </td>
                    </tr>
                    <td align="center">
                        <input type="submit" value="注册">
                    </td>
                </table>
                <h2 align="center"><a href="${pageContext.request.contextPath}/user/login">返回</a></h2>
                <div align="center">${pattern_error}</div>
                <div align="center">${exist_error}</div>
            </td>
        </tr>
    </table>
</form>
</body>
</html>