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
     
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UTH Login Page</title>
    </head>
  <body>
        
    <center>     <form  action="Game.do" method="POST" >
  UTH Username:<br>
  <input type="text" name="user">
  <br>
 Password:<br>
 <input type="password" name="pass" /> <br>
     <input type="submit" value="submit" name="submit" />
</form>
    </center>
   
         
    </body>
</html>
