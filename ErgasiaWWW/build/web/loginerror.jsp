<%-- 
    Document   : loginerror
    Created on : 3 Ιαν 2016, 7:23:35 μμ
    Author     : Themis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
         <link href="css/loginerror.css" rel="stylesheet" type="text/css"/> 
        <title>Login Error</title>
    </head>
    <body>
    <center>
        <h1>Authentication failed.Please Try Again!</h1>
         <form name="Return" action="index.jsp" method="POST">
            <input class="myButton" type="submit" value="Return" name="button" />
        </form> 
   
    </center>
    </body>
</html>
