<%--
  Created by IntelliJ IDEA.
  User: sensibility
  Date: 2021/9/6
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    这是登录页面。login.jsp页面<br>
    <form action="http://localhost:8080/11_filter/loginServlet" method="get">
        用户名：<input type="text" name="username"/><br/>
        密  码：<input type="password" name="password"/><br/>
        <input type="submit"/>

</form>
</body>
</html>
