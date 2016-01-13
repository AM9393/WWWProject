<%-- 
    Document   : index
    Created on : 11 Δεκ 2015, 9:54:16 μμ
    Author     : Themis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" import="java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Using Bootstrap for style -->
        <link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>  
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>      
        <link href="css/index.css" rel="stylesheet" type="text/css"/> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UTH Login Page</title>
    </head>
  <body>
        
  
  <form class="form-signin" action="Game.do" method="POST" >
  <center>   <h2 class="form-signin-heading">Uth Login </h2>     </center> 
  <label for="inputUsername" class="sr-only">Username</label>
  <input type="username" id="inputUsername" class="form-control" name="user" placeholder="UTH Username" required autofocus>
  
  <label for="inputPassword" class="sr-only">Password</label>
  <input type="password" name="pass" id="inputPassword" class="form-control" placeholder="Password" required autofocus> 
  <input class="btn btn-lg btn-primary btn-block" type="reset" value="Clear" name="Clear" />
  <input class="btn btn-lg btn-primary btn-block" type="submit" value="Sign in" name="submit" />
        
</form>
  
   
         
    </body>
</html>
