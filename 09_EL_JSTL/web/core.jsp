<%--
  Created by IntelliJ IDEA.
  User: sensibility
  Date: 2021/8/23
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--保存数据--%>
    保存之前：${requestScope.abc}<br/>
    <c:set scope="request" var="abc" value="abcValue"/>
    保存之后：${requestScope.abc}<br/>
    <hr/>

    <%-- if做if判断  test属性表示判断的条件（EL表达式输出）--%>
    <c:if test="${12 == 12}">
    <h1>12等于12</h1>
    </c:if>
    <hr/>

    <%--
    多路判断 要使用jsp注释
     --%>
    <%
        request.setAttribute("height",168);
    %>
    <c:choose >
        <c:when test="${requestScope.height > 190}">
            <h2>小巨人</h2>
        </c:when>
        <c:when test="${requestScope.height > 180}">
            <h2>很高</h2>
        </c:when>
        <c:when test="${requestScope.height > 170}">
            <h2>还可以</h2>
        </c:when>
        <c:otherwise>
            <h2>剩下小于170的情况</h2>
        </c:otherwise>
    </c:choose>




</body>
</html>
