<%--
  Created by IntelliJ IDEA.
  User: 预见
  Date: 2019-01-16
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
    </tr>
    <c:forEach var="s" items="${list}">
        <tr>
            <td>${s.stuId}</td>
            <td>${s.stuName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
