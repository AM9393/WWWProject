<%-- 
    Document   : newjsp
    Created on : 28 Δεκ 2015, 7:09:30 μμ
    Author     : Themis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Question 3/5</h1>
        <%= "Your score is " + " "  +  request.getAttribute("Score_String")     %>
        
        <a href="index.jsp">Return</a>
    </body>
</html>
