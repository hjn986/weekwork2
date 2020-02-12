<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>

<body>
<form action="/user/login.do" method="post">
    <input type="text" placeholder="账户" name="username">
    <input type="password" placeholder="密码" name="password">
    <input type="submit" value="登录">
</form>
</body>

</html>
