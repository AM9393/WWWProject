
<%-- 
    Document   : newresult
    Created on : 11 Δεκ 2015, 10:42:37 μμ
    Author     : Themis
--%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page import="java.sql.*"%>
<%@ page import="java.util.*" import="java.io.*"%>

<%Class.forName("com.mysql.jdbc.Driver"); %>

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
         <link href="css/gamestarting.css" rel="stylesheet" type="text/css"/> 
        <title>Mistakes or Not</title>
    </head>
  <body onload="noBack();"  onpageshow="if (event.persisted) noBack();">
      
       <center>
      
           
           
           
        <% PrintWriter writer=response.getWriter();   
        %>
           
      
        
        <%!
        public class User {
             //Database credentials.Place real ones.
            private static final String DB ="jdbc:mysql://localhost:3306/dbhere";
            private static final String USER = "root";
            private static final String PASS = "passhere";
    
           Connection connection = null;
           Statement stmt = null;
           ResultSet resultSet = null;
           PreparedStatement SelectUsers= null;
           PreparedStatement InsertUsers=null;
          // String score=(String) session.getAttribute("test");
            
           
           public User() {
            try {
                //session.getAttribute("user");
                 connection = DriverManager.getConnection(DB, USER, PASS);
                 //Update score to the database to the current user. 
                InsertUsers = connection.prepareStatement("UPDATE users SET score=? WHERE usernames=? ");
            } catch (SQLException ex) {
           ex.printStackTrace();
           
          }
         }
           
           
           public void setUser (String user,int score) {
               // int result=0;
                try {
                    InsertUsers.setString(2,user);
                    InsertUsers.setInt(1,score); //Vale sto database to score.
                    
                     boolean result = InsertUsers.execute();
                    if (!result) {
                        System.out.println("ERROR: Wrong Query");
                    }
                    
                    
                } catch (SQLException ex) {
           ex.printStackTrace();
           
          }
        }
       }
          
        %>
        
        
      
        
        
       
        <%
         //Create new Object User
         User user=new User();
         
         //typecast objects to strings
         String final_score=(String) session.getAttribute("test"); 
         String fin_user=(String) session.getAttribute("user");
         
         //typecast score to integer so we can pass it to database.
         int final_s=Integer.parseInt(final_score);
         user.setUser(fin_user,final_s); 
         
   
        %>
       
        
        <!-- An alternative method is to call the User.java class with Java Beans -->
        <%--
          <jsp:useBean id="userinfo" scope="page" class="com.model.User" type="com.model.User" />
        <jsp:setProperty name="userinfo"    property="user" value="fin_user" />
        <jsp:setProperty name="userinfo" property="score" value="final_s"/> --%>
         
       
        
     <%--   <%String mistake=(String) session.getAttribute("mistake") ;   %> --%>
        
        
        
     
        <% 
         //Print mistake messages.
          writer.println("<center>" + session.getAttribute("printatmistakes")+ "</center>");
          writer.println("<center>" +  "Score: " + session.getAttribute("test") +"</center>" );
          
        if (session.getAttribute("mistake1")!=null) {
            writer.println("<center><p>" + session.getAttribute("mistake1") + "</p></center>");
            
            
        }
        if(session.getAttribute("mistake2")!=null) {
            writer.println("<center><p>" + session.getAttribute("mistake2") + "</p></center>");
        }
        if(session.getAttribute("mistake3")!=null) {
            writer.println("<center><p>" + session.getAttribute("mistake3") + "</p></center>");
        }
        if(session.getAttribute("mistake4")!=null) {
            writer.println("<center><p>" + session.getAttribute("mistake4") + "</p></center>");
        }
        if(session.getAttribute("mistake5")!=null) {
            writer.println("<center><p>" + session.getAttribute("mistake5") + "</p></center>");
        }
        
        session.setAttribute("mistake1",null);
        session.setAttribute("mistake2",null);
        session.setAttribute("mistake3",null);
        session.setAttribute("mistake4",null);
        session.setAttribute("mistake5",null);
        %>
        
        <br>
        <form name="Leaderboards" action="leaderboards.jsp" method="POST">
            <input class="myButton" type="submit" value="Go to Leaderboards" name="button" />
        </form> 
  </center>
    </body>
</html>
