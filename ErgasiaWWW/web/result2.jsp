<%-- 
    Document   : newjsp
    Created on : 28 Δεκ 2015, 7:09:30 μμ
    Author     : Themis
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
         <link href="css/gamebigquestions.css" rel="stylesheet" type="text/css"/> 
        <title>JSP Page</title>
    </head>
   <body onload="noBack();" onpageshow="if (event.persisted) noBack();">
       
        <% 
            session.setAttribute("jspquestion","3");
         %>
    <center>
        <h2>Question 3/5</h2>
        <h1> Which of the following about Servlets is true? </h1>
    </center>
        
        <form name="choose" action="FormServlet.do" method="POST">
            <label class="lab" for="c1">
            <input type="radio" name="Question3" value="Choice1" id="c1" /> ServletConfig is one per web app. 
            </label>
             <br>
             <label class="lab" for="c2">
            <input type="radio" name="Question3" value="Choice2" id="c2"/>  ServletConfig is one per servlet. 
        </label>
        <br> 
        <label class="lab" for="c3">
            <input type="radio" name="Question3" value="Choice3" id="c3"/>  ServletContext is one per servlet. 
        </label>
           <br>
            <br>
            <center>
           <input class="myButton" type="submit" value="submit" name="submit" />
            </center>
        </form>
   <center>
      <%
        PrintWriter writer=response.getWriter();
          if (session.getAttribute("user").equals("admin")) {
              writer.println("Score : " + session.getAttribute("test"));
          }
       %>
        
        </center>
        
    </body>
</html>
