<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: sensibility
  Date: 2021/8/21
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("emptyNull",new Object());
        request.setAttribute("emptyStr","");
        request.setAttribute("emptyArr",new Object[]{});
        List<String> list = new ArrayList<>();
        list.add("abc");
        request.setAttribute("emptyList",list);
        HashMap<String, Object> map = new HashMap<>();
        request.setAttribute("emptyMap",map);
    %>

    ${empty emptyNull}<br/>
    ${empty emptyStr}<br/>
    ${empty emptyArr}<br/>
    ${empty emptyList}<br/>
    ${empty emptyMap}<br/>

    <hr/>
    ${12 == 12 ? "对的" : "错的"}

</body>
</html>
