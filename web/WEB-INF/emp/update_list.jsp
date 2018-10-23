<%--
  Created by IntelliJ IDEA.
  User: itachi
  Date: 2017/2/11
  Time: 下午9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
    <style type="text/css">
        fieldset{
            width: 40%;
            align-self:center;

        }
        input{
            height: 30px;
            font-size: 16px;
        }
    </style>


</head>
<body>
    <fieldset>
        <form action="update.do" method="post" align="center">
            empno:<input type="text" value="${emp.empno}" name="empno"><br/>
            ename:<input type="text" value="${emp.ename}" name="ename"><br/>
            job:<input type="text" value="${emp.job}" name="job"><br/>
            mgr:<input type="text" value="${emp.mgr}" name="mgr"><br/>
            hiredate:<input type="text" value="${emp.hiredate}" name="hiredate"><br/>
            sal:<input type="text" value="${emp.sal}" name="sal"><br/>
            comm:<input type="text" value="${emp.comm}" name="comm"><br/>
            deptno:<input type="text" value="${emp.deptno}" name="deptno"><br/>
            <input type="submit" value="保存">
        </form>
    </fieldset>

</body>
</html>
