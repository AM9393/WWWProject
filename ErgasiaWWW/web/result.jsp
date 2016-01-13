<%-- 
    Document   : result
    Created on : 11 Δεκ 2015, 10:08:24 μμ
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
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
         <link href="css/gamestarting.css" rel="stylesheet" type="text/css"/> 
        <title>JSP Game</title>
    </head>
    <body onload="noBack();" onpageshow="if (event.persisted) noBack();">
        
         <% 
            session.setAttribute("jspquestion","2");
         %>
        
    <center>
        <h2>Question 2/5 </h2>
        <h1>Which method of HttpServletResponse is <br>
           used to redirect an HTTP request to another URL? </h1>
    </center>
        
   
           <form name="choose" action="FormServlet.do" method="POST">
               
               <label class="lab" for="r1">
               <input id="r1"  type="radio" name="Question2" value="Choice1" /> sendURL()
               </label>
               <br>
               <label class="lab" for="r2">
               <input id="r2" type="radio" name="Question2" value="Choice2" /> redirectURL()
               </label>
               <br>    
               <label class="lab" for="r3">
             <input for="r3" type="radio" name="Question2" value="Choice3" /> sendRedirect()
               </label>
               <br>
               
               <br>
               <center>  
    
               <input class="myButton"  type="submit" value="submit" name="submit" /> 
               </center>
        </form>
            
        


   
   <center>
       
        
        
       <% 
           PrintWriter writer=response.getWriter();
           //Ama o xristis einai o admin deikse to score.
          if (session.getAttribute("user").equals("admin")) {
              writer.println("Score : " + session.getAttribute("test"));
          }
       String score="";
        request.setAttribute("score",request.getAttribute("Score_String"));
      %>
      </center>

    </body>
</html>
