<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改学生信息</title>
</head>
<body bgcolor="#87cefa">
<form action="${pageContext.request.contextPath}/student/updateStudent" method="post">
    <table width="100%" height="100%">
        <tr>
            <td>
                <h1 align="center">请修改您需要修改的地方，最后按修改键进行修改</h1>
                <table border="1" align="center">
                    <tr>
                        <th>学 号 :<input type="text" name="id" placeholder="请输入学号" value="${student.getId()}"></th>
                    </tr>
                    <tr>
                        <th>姓 名 :<input type="text" name="name" placeholder="请输入名字" value="${student.getName()}"></th>
                    </tr>
                    <tr>

                        <th>性 别 :
                            <c:if test="${student.getSex() == '男'}">
                                <input type="radio" name="sex" value="男" checked/> 男
                                <input type="radio" name="sex" value="女"/> 女
                            </c:if>
                            <c:if test="${student.getSex() == '女'}">
                                <input type="radio" name="sex" value="男"/> 男
                                <input type="radio" name="sex" value="女" checked/> 女
                            </c:if>

                        </th>
                    </tr>
                    <tr>
                        <th>年 级 :
                            <c:if test="${student.getGrade() == '大一'}">
                                <input type="checkbox" name="grade" value="大一" checked/> 大一
                                <input type="checkbox" name="grade" value="大二"/> 大二
                                <input type="checkbox" name="grade" value="大三"/> 大三
                                <input type="checkbox" name="grade" value="大四"/> 大四
                            </c:if>
                            <c:if test="${student.getGrade() == '大二'}">
                                <input type="checkbox" name="grade" value="大一"/> 大一
                                <input type="checkbox" name="grade" value="大二" checked/> 大二
                                <input type="checkbox" name="grade" value="大三"/> 大三
                                <input type="checkbox" name="grade" value="大四"/> 大四
                            </c:if>
                            <c:if test="${student.getGrade() == '大三'}">
                                <input type="checkbox" name="grade" value="大一"/> 大一
                                <input type="checkbox" name="grade" value="大二"/> 大二
                                <input type="checkbox" name="grade" value="大三" checked/> 大三
                                <input type="checkbox" name="grade" value="大四"/> 大四
                            </c:if>
                            <c:if test="${student.getGrade() == '大四'}">
                                <input type="checkbox" name="grade" value="大一"/> 大一
                                <input type="checkbox" name="grade" value="大二"/> 大二
                                <input type="checkbox" name="grade" value="大三"/> 大三
                                <input type="checkbox" name="grade" value="大四" checked/> 大四
                            </c:if>
                        </th>
                    </tr>
                    <tr>
                        <th>专 业 :<input type="text" name="major" value="${student.getMajor()}"></th>
                    </tr>
                    <tr>
                        <td align="center">
                            <input type="submit" value="修改">
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