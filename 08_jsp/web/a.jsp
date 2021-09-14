<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: sensibility
  Date: 2021/8/19
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--1.声明类的属性--%>
    <%!
        private Integer id;
        private String name;
        private static Map<String,Object> map;
    %>
<%--2.申明static静态代码块--%>
    <%!
        static {
            map = new HashMap<String,Object>();
            map.put("key1","value1");
            map.put("key2","value2");
            map.put("key3","value3");
        }
    %>
<%--3.声明类的方法--%>
    <%!
        public int abc(){
            return 12;
        }
    %>
<%--4.声明内部类--%>
    <%!
        public static class A{
            private Integer id = 12;
            private String abc = "abc";
        }
    %>
<%--  <%= 表达式 %> --%>
    <%=12 %> <br>
    <%=12.12 %> <br>
    <%="我是字符串" %> <br>
    <%=map %> <br>
    <%=request.getParameter("username") %> <br>

<%--代码脚本--%>
    <%--1.if语句--%>
        <%
            int i =12;
            if(i == 12){
                %>
               <h1>国哥好帅</h1>
        <%
            }else{
                %>
               <h1>国哥又骗人了</h1>
        <%
        }
        %>
    <%--2.for循环--%>
    <table border="1" cellspacing="0">
        <%
            for (int j = 0; j < 10; j++) {
        %>
        <tr>
            <td>第<%=j + 1%>行</td>
        </tr>
        <%
        }
            %>
    </table>
    <%--3._jspService方法内的都可以写--%>
        <%
            String username = request.getParameter("username");
            System.out.println(username);
        %>
</body>
</html>
