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
        <title>JSP Page</title>
    </head>
    <body onload="noBack();" onpageshow="if (event.persisted) noBack();">
        <h1>Which method of HttpServletResponse is used to redirect an HTTP request to another URL? </h1>
        <p>Question 2/5 </p>
        
           <form name="choose" action="FormServlet.do" method="POST">
            <input type="radio" name="Question2" value="Choice1"   >  Ans1   <br>
            <input type="radio" name="Question2" value="Choice2" />   Ans2  <br>      
            <input type="radio" name="Question2" value="Choice3" />   Ans3  <br>
           <input type="submit" value="submit" name="submit" />
        </form>
        
        


      <%= "Your score is " + " "  +  request.getAttribute("Score_String")     %>
        
       <%-- <%=session.getAttribute("test") %> --%>
        
       <% String score="";
        request.setAttribute("score",request.getAttribute("Score_String"));
      %>
      

    </body>
</html>
