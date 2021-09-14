<%@ page import="com.pojo.Person" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: sensibility
  Date: 2021/8/21
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Person person = new Person();
        person.setName("zrl");
        person.setPhones(new String[]{"18610541354","18688886666","18699998888"});

        List<String> cities = new ArrayList<>();
        cities.add("北京");
        cities.add("上海");
        cities.add("深圳");
        person.setCities(cities);

        HashMap<String, Object> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        person.setMap(map);

        pageContext.setAttribute("p",person);

    %>
        输出person:${ p }<br/>
        输出person的name属性:${p.name}<br/>
        输出person的phones属性:${p.phones[0]}<br/>
        输出person的cities集合中的元素值:${p.cities}<br/>
        输出person的List集合中个别元素值:${p.cities[2]}<br/>
        输出person的Map集合:${p.map}<br/>
        输出person的Map集合中某个key的值:${p.map.key1}<br/>
        输出person的age属性:${p.age}
</body>
</html>
