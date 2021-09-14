<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pojo.Student" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sensibility
  Date: 2021/8/23
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table{
            width: 500px;
            border: 1px solid black;
            border-collapse: collapse;
        }
        th,td{
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <table border="1" >
    <c:forEach begin="1" end="10" var="i">
        <tr>
            <td>第${ i }行</td>
        </tr>
    </c:forEach>
    </table>
    <hr/>

    <%
        request.setAttribute("arr",new String[]{"18610541354","18688886666","18699998888"});
    %>
    <c:forEach items="${requestScope.arr}" var="item">
       ${item}
    </c:forEach>
    <hr/>

    <%
        Map<String, Object> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
//        for(Map.Entry<String,Object> entry : map.entrySet()){}
        request.setAttribute("map",map);
    %>
    <c:forEach items="${requestScope.map}" var="entry">
        ${entry.value}
    </c:forEach>
    <hr/>

     <%
         List<Student> studentList = new ArrayList<>();
         for (int i = 1; i <= 10; i++) {
             studentList.add(new Student(i,"username","pass" + i,18 + i,"phone" + i));
         }
         request.setAttribute("stus",studentList);
     %>
    <table>
        <tr>
            <th>编号</th>
            <th>用户名</th>
            <th>密码</th>
            <th>年龄</th>
            <th>电话</th>
            <th>操作</th>
        </tr>
    <c:forEach begin="2" end="7" step="2" varStatus="status" items="${requestScope.stus}" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.username}</td>
            <td>${stu.password}</td>
            <td>${stu.age}</td>
            <td>${stu.phone}</td>
<%--            <td>删除、修改</td>--%>
            <td>${status.step}</td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>
