<%--
  Created by IntelliJ IDEA.
  User: sensibility
  Date: 2021/9/6
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        System.out.println("target.jsp的线程：" + Thread.currentThread().getName());
        System.out.println("target.jsp:" + request.getParameter("username"));
        System.out.println("执行了target页面");
    %>
</body>
</html>
