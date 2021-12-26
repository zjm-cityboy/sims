<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息管理系统</title>
</head>

<body bgcolor="#00ffff">

<form action="${pageContext.request.contextPath}/user/login" method="post">
    <table border="0" width="100%" height="100%">
        <tr>
            <td>
                <h1 align="center">学生信息管理系统</h1>
                <table border="1" align="center">
                    <tr>
                        <th>用户登录</th>
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
                    <tr align="center">
                        <td>
                            <input type="submit" value="登录">
                        </td>
                    </tr>
                    </td>
                    </tr>
                </table>
                <h4 align="center"><a href="${pageContext.request.contextPath}/user/toRegister">注册</a></h4>
                <div align="center">${login_error}</div>
    </table>
</form>
</body>
</html>