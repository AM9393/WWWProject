<%-- 
    Document   : GameStarting
    Created on : 28 Δεκ 2015, 4:44:17 μμ
    Author     : Themis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" import="java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        
           <script type="text/javascript">
    window.history.forward();

    function noBack() {
      window.history.forward();
    }
  </script>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Game</title>
    </head>
    <body onload="noBack();" onpageshow="if (event.persisted) noBack();">
        <h3>
             <!-- Using Expression Language for Printing the Name of the User -->
        <%= "Welcome" + " " + request.getAttribute("name")  %>
        </h3>
        
        
        <h1>What does JSP stand for?</h1>
        <p>Question: 1/5 </p>
        <form name="choose" action="FormServlet.do" method="POST">
            <input type="radio" name="Question1" value="Choice1"   >  Java Server Page   <br>
            <input type="radio" name="Question1" value="Choice2" />     Java Servlet Page  <br>      
            <input type="radio" name="Question1" value="Choice3" />    Java Service Pool  <br>
           <input type="submit" value="submit" name="submit" />
        </form>
    </body>
</html>
