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
            //Script gia na min mporei o xristis na patisei back.
    window.history.forward();

    function noBack() {
      window.history.forward();
    }
        </script>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/gamestarting.css" rel="stylesheet" type="text/css"/> 
        <title>JSP Game</title>
    </head>
    <body onload="noBack();" onpageshow="if (event.persisted) noBack();">
        <p id="topwelcome">
          <!-- Using  Expression Language (EL) for Printing the Name of the User -->
          Welcome  ${requestScope.name}
          
         </p>
         <!-- First question -->
         <%          session.setAttribute("jspquestion","1");      %>
    <center>
        
      
        
         <h2>Question: 1/5 </h2>
        <h1>What does JSP stand for?</h1>
    </center>
        
        <form name="choose" action="FormServlet.do" method="POST">
            <label class="lab" for="c1">
            <input type="radio" name="Question1" value="Choice1" id="c1"/> Java Server Page  
            </label>
            <br>
            <label class="lab" for="c2">
            <input type="radio" name="Question1" value="Choice2" id="c2"/> Java Servlet Page 
            </label>
            <br>
            <label class="lab" for="c2">
            <input type="radio" name="Question1" value="Choice3" id="c3"/> Java Service Pool 
            </label>
            <br>
            <br>
            <center>
           <input class="myButton" type="submit" value="submit" name="submit" />
            </center>
        </form>
        
    
    </body>
</html>
