<%--
  Created by IntelliJ IDEA.
  User: sensibility
  Date: 2021/8/20
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1 align="center">九九乘法表</h1>
    <table align="center">
    <%
        for (int i = 1; i <= 9; i++) { %>
            <tr>
                <% for (int j = 1; j <= i  ; j++) { %>
                    <td><%=j + "x" + i + "=" + (i*j)%></td>
    <% } %>
            </tr>
        <br/>
    <%  } %>
    </table>
</body>
</html>
