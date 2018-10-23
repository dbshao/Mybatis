<%--
  Created by IntelliJ IDEA.
  User: itachi
  Date: 2017/2/10
  Time: 上午10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@page pageEncoding="utf-8" %>
<html>
<head>
    <title>员工列表</title>
    <style type="text/css">
        table{
            text-align: center;
        }
    </style>
</head>
<body>
    <table width="60%" border="1px" cellspacing="0px" align="center">
        <tr>
            <th>EMPNO</th>
            <th>ENAME</th>
            <th>JOB</th>
            <th>MGR</th>
            <th>HIREDATE</th>
            <th>SAL</th>
            <th>COMM</th>
            <th>DEPTNO</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${emps}" var="emp">
        <tr>
            <td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td>${emp.job}</td>
            <td>${emp.mgr}</td>
            <td>${emp.hiredate}</td>
            <%--<td><fmt:formatDate value="${emp.hiredate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>--%>
            <td>${emp.sal}</td>
            <td>${emp.comm}</td>
            <td>${emp.deptno}</td>
            <td><a href="toDelete.do?empno=${emp.empno}">删除</a>&nbsp&nbsp<a href="toUpdate.do?empno=${emp.empno}">修改</a></td>
        </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="toAdd.do">新增员工</a>

</body>
</html>
