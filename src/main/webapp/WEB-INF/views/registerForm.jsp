<%--
  Created by IntelliJ IDEA.
  User: s_xun
  Date: 2018/8/31
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h1>Register</h1>
    <form method="post">
        <label>
            First Name:
            <input type="text" name="firstName"/>
        </label><br/>
        <label>
            Last Name:
            <input type="text" name="lastName"/>
        </label><br/>
        <label>
            userName:
            <input type="text" name="userName"/>
        </label><br/>
        <label>
            password:
            <input type="password" name="password"/>
        </label>
        <input type="submit" value="Register">
    </form>
</body>
</html>
