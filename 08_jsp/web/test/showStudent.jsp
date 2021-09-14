<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pojo.Student" %><%--
  Created by IntelliJ IDEA.
  User: sensibility
  Date: 2021/8/21
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border: 1px black solid;
            width: 600px;
            border-collapse: collapse;
        }
        td,th{
            border: 1px black solid;
        }
    </style>
</head>
<body>
    <%
        List<Student> stuList = (List<Student>) request.getAttribute("stuList");
    %>
    <table>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>电话</td>
            <td>操作</td>
        </tr>
    <% for(Student student : stuList){ %>
        <tr>
            <td><%=student.getId()%></td>
            <td><%=student.getName()%></td>
            <td><%=student.getAge()%></td>
            <td><%=student.getPhone()%></td>
            <td>删除、修改</td>
        </tr>
    <%   } %>
    </table>
</body>
</html>
