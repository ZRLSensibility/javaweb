<%--
  Created by IntelliJ IDEA.
  User: sensibility
  Date: 2021/9/6
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Object user = session.getAttribute("user");
        if(user == null){
            request.getRequestDispatcher("/login.jsp").forward(request,response);
            return;
        }
    %>
    我是a.jsp文件
</body>
</html>
