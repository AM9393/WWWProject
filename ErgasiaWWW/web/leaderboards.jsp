 <%-- 
    Document   : leaderboards
    Created on : 31 Δεκ 2015, 4:26:15 πμ
    Author     : Themis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
 
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
        
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
     <link href="css/leaderboards.css" rel="stylesheet" type="text/css"/>  
     <script src="js/jquery.tablesorter.js"> </script>
   
        <title>Leaderboards</title>
    </head>
   <body>
       
       <div id="wrapper">
     <script>
     $(document).ready(function() {
    { 
        $("#keywords").tablesorter(); 
    } 
    }); 
</script>


<!-- Some music -->
<embed src="music/Leaderboards.mp3" width="144" height="60" autostart="true" hidden="true">

<!--
<script>
              $( "#clickme" ).click(function() {
    $("table").tablesorter(); 
});
        </script>-->


        <!-- Using jstl to connect to database    -->
         <!--   Place real db credentials url,user,pass           -->
<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://localhost:3306/dbhere" 
     user="root"  password="passhere"/>
 
<sql:query dataSource="${snapshot}" var="result">
SELECT * from users;
</sql:query>
       

      
        <h1>Congratulations <%=session.getAttribute("user")%> </h1>
          <h1>Here are the leaderboards! </h1>
        
        <% String score= (String) request.getAttribute("Score_String");
%>

 <%
     String fin_score=(String) session.getAttribute("test");
     String user=(String) session.getAttribute("user");
     pageContext.setAttribute("score2", fin_score);
     pageContext.setAttribute("Username",user);
      //Forcing session to end.
     session.invalidate();
  %>
 
  <!--   <table id="keywords" cellspacing="0" cellpadding="0"> -->
  <table id="keywords" cellspacing="0" cellpadding="0" class="tablesorter" > 
            <thead>
                <tr>
                    <th><span>Username</span></th>
                    <th><span>Date</span></th>
                    <th><span>Score</span></th>
                   
                </tr>
            </thead>
            <tbody>
                <c:forEach var="row" items="${result.rows}">

                    <tr>
                    <td id="clickme" class="lalign"><c:out value="${row.usernames}"/></td>
                    <td><c:out value="${row.Date}"/></td>
                    <td  ><c:out value="${row.score}"/></td>  
            </tbody>
            </c:forEach>
        </table>
       </div>   
    </body>
</html>
