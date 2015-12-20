<%-- 
    Document   : index
    Created on : 11 Δεκ 2015, 9:54:16 μμ
    Author     : Themis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.uthldap.Uthldap" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Game</title>
    </head>
    <body>
        
        <form  action="JavaServlet.do" method="POST" >
  Username:<br>
  <input type="text" name="user">
  <br>
 Password:<br>
 <input type="password" name="pass"  />
     <input type="submit" value="submit" name="submit" />
</form>
       
  
        
        
         
        <h1>What does JSP stand for?</h1>
        <p>Question: 1/5 </p>
        <form name="choose" action="FormServlet.do" method="POST">
            <input type="radio" name="Question1" value="Correct"   >  Java Server Page   <br>
            <input type="radio" name="Question1" value="Wrong" />     Java Servlet Page  <br>      
            <input type="radio" name="Question1" value="Wrong2" />    Java Service Pool  <br>
           <input type="submit" value="submit" name="submit" />
        </form>
        
         
    </body>
</html>
