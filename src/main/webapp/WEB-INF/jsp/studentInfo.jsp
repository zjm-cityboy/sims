<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>学生信息展示页面</title>
</head>
<body bgcolor="#ffc0cb">
<h1 align="center">学生信息展示页面</h1>
<h1 align="center"><a href="${pageContext.request.contextPath}/student/studentInfo">查询全部同学的信息</a></h1>
<%--查询功能--%>
<div style="width:100%;text-align:center">
    <form action="${pageContext.request.contextPath}/student/queryStudent" method="post">
        ${errorMsg}
        <input type="text" name="queryStudentName">
        <input type="submit" value="查询">
    </form>
</div>
<%--展示功能--%>
<table border="1" align="center">
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年级</th>
        <th>专业</th>
        <th colspan="2">操作</th>
    </tr>
    <%-- ${requestScope.get('list')} 等价于 request.getAttribute("list")
    一般是从服务器传递结果到页面，在页面中取出服务器端保存的值！--%>
    <c:forEach var="student" items="${requestScope.get('list')}">
        <tr>
            <td>${student.getId()}</td>
            <td>${student.getName()}</td>
            <td>${student.getSex()}</td>
            <td>${student.getGrade()}</td>
            <td>${student.getMajor()}</td>
            <td><a href="${pageContext.request.contextPath}/student/toUpdateStudent?id=${student.getId()}">修改</a>
                <a href="${pageContext.request.contextPath}/student/del/${student.getId()}">删除</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="6" align="center"><a href="${pageContext.request.contextPath}/student/toAddStudent">添加学生信息</a></td>
    </tr>
</table>
<%--注销功能--%>
<div style="text-align:center">
    <a href="${pageContext.request.contextPath}/user/logout">注销</a>
</div>
</body>
</html>

<%--
${pageContext.request.contextPath}是JSP取得绝对路径的方法，
等价于<%=request.getContextPath()%>
也就是取出部署的应用程序名或者是当前的项目名称
比如项目名称是springmvc3，在浏览器中输入为http://localhost:8080/springmvc3/emp。
${pageContext.request.contextPath}或<%=request.getContextPath()%>
取出来的就是/springmvc3，
而"/"代表的含义就是http://localhost:8080。
故有时候项目中这样写${pageContext.request.contextPath}/emp。
emp指的是映射到@RequestMapping中的value的值。
--%>