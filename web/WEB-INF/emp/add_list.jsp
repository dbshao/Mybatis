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
    <title>增加页面</title>
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
        <form action="add.do" method="post" align="center">
            empno:<input type="text" value="" name="empno"><br/>
            ename:<input type="text" value="" name="ename"><br/>
            job:<input type="text" value="" name="job"><br/>
            mgr:<input type="text" value="" name="mgr"><br/>
            hiredate:<input type="text" value="" name="hiredate"><br/>
            sal:<input type="text" value="" name="sal"><br/>
            comm:<input type="text" value="" name="comm"><br/>
            deptno:<input type="text" value="" name="deptno"><br/>
            <input type="submit" value="保存">
        </form>
    </fieldset>

</body>
</html>
