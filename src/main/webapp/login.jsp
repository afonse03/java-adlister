<%@ page import="java.net.URLEncoder" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if (request.getParameter("username") != null && request.getParameter("password") != null) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp?username=" + URLEncoder.encode(username, "UTF-8") + "&password=" + URLEncoder.encode(password, "UTF-8"));
        }
        response.sendRedirect(("/login.jsp"));
    }

%>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <h1>Login Form</h1>
    <form action="" method="POST">
        <label for="username">Username:</label>
        <br>
        <input id="username" type="text" placeholder="Enter your username" name="username">
        <br>
        <br>
        <label for="password">Password:</label>
        <br>
        <input id="password" type="text" placeholder="Enter your password" name="username">
        <br>
        <br>
        <button>Submit</button>
    </form>
</body>
</html>
<%----%>