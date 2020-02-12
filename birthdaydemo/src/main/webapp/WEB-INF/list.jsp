<%--
  Created by IntelliJ IDEA.
  User: 25701
  Date: 2020/2/11
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>查看好友</title>
    <link rel="stylesheet" href="../static/css/list.css">
</head>
<body>

<div id="a">
    <%--公告--%>
    <div id="a-text">查看好友</div>
    <div id="a-content">
        <c:forEach items="${li}" var="u">
            <div class="b">
                <input type="hidden" value="${u.id}">
                <div>姓名：${u.userName}</div>
                <div>生日：${u.birthDay}</div>
                <div>兴趣：${u.interest}</div>
                <div>电话：${u.phoneNumber}</div>
                <div>QQ：${u.qq}</div>
            </div>
        </c:forEach>
    </div>
</div>

</body>
</html>
