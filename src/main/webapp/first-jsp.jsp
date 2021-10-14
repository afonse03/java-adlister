<%--
  Created by IntelliJ IDEA.
  User: amanda
  Date: 10/14/21
  Time: 9:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name = "Amanda Fonseca";
    String firstname = name.substring(0, 7);
%>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            color: red;
        }
    </style>
</head>
<body>

    <h1>My First JSP</h1>
    <h1>My first name is: <%= firstname %></h1>
    <script>
        alert("Hello!");
    </script>

</body>
</html>
