<%--
  Created by IntelliJ IDEA.
  User: sensibility
  Date: 2021/8/21
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        pageContext.setAttribute("req",request);
        pageContext.setAttribute("ses",session);
    %>

    <%=session.getId()%><br/>
    1.协议：${req.scheme}<br/>
    2.服务器ip：${req.serverName}<br/>
    3.服务器端口：${req.serverPort}<br/>
    4.获取工程路径：${req.contextPath}<br/>
    5.获取请求方法：${req.method}<br/>
    6.获取客户端ip地址：${req.remoteHost}<br/>
    7.获取会话的id地址：${ses.id}<br/>
</body>
</html>
