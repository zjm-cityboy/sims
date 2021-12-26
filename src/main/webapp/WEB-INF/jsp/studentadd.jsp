<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生信息</title>
</head>
<body bgcolor="#9acd32">
<form action="${pageContext.request.contextPath}/student/addStudent" method="post">
    <table width="100%" height="100%">
        <tr>
            <td>
                <h1 align="center">请输入相关信息，最后按添加键添加</h1>
                <table border="1" align="center">
                    <tr>
                        <th>学 号 :<input type="text" name="id" placeholder="请输入学号"></th>
                    </tr>
                    <tr>
                        <th>姓 名 :<input type="text" name="name" placeholder="请输入名字"></th>
                    </tr>
                    <tr>
                        <th>性 别 :<input type="radio" name="sex" value="男"/> 男
                            <input type="radio" name="sex" value="女"/> 女
                        </th>
                    </tr>
                    <tr>
                        <th>年 级 :<input type="checkbox" name="grade" value="大一"/> 大一
                            <input type="checkbox" name="grade" value="大二"/> 大二
                            <input type="checkbox" name="grade" value="大三"/> 大三
                            <input type="checkbox" name="grade" value="大四"/> 大四
                        </th>
                    </tr>
                    <tr>
                        <th>专 业 :<input type="text" name="major"></th>
                    </tr>
                    <tr>
                        <td align="center">
                            <input type="submit" value="添加">
                            <input type="reset" value="重置">
                        </td>
                    </tr>
                </table>
                <h2 align="center"><a href="${pageContext.request.contextPath}/student/studentInfo">返回</a></h2>
            </td>
        </tr>
    </table>
</form>
</body>
</html>