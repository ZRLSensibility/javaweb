<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: sensibility
  Date: 2021/8/21
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        HashMap<String, Object> map = new HashMap<>();
        map.put("a.a.a","aaaValue");
        map.put("b+b+b","bbbValue");
        map.put("c-c-c","cccValue");

        request.setAttribute("map",map);
    %>
        ${map['a.a.a']}<br/>
        ${map["b+b+b"]}<br/>
        ${map['c-c-c']}<br/>
</body>
</html>
