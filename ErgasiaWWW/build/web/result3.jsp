<%-- 
    Document   : result3
    Created on : 1 Ιαν 2016, 6:44:12 μμ
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
           
           
            <%  session.setAttribute("jspquestion","4");  %>
       <center>
            <h2>Question 4/5</h2>
            <h1>    Which about EL access operators is true?      </h1>
            
       </center>
            
        <form name="choose" action="FormServlet.do" method="POST">
             <label class="lab" for="c1">
    <input type="radio" name="Question4" value="Choice1"  id="c1" />Anywhere the [ ] operator is used, the . (dot) could be used instead. 
             </label>
            <br>
             <label class="lab" for="c2">
    <input type="radio" name="Question4" value="Choice2" id="c2"/>Anywhere the . (dot) operator is used, the [ ] could be used instead. 
             </label>
            <br>     
             <label class="lab" for="c3">
            <input type="radio" name="Question4" value="Choice3" id="c3"/> There are some situations where the. (dot)operator must be
            <br> used  and other situations where the [ ] operator must be used.
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
