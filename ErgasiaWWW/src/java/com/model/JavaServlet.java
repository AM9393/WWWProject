/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.uthldap.Uthldap;
<<<<<<< HEAD
import java.io.*;
import javax.servlet.http.Cookie;
=======
<<<<<<< HEAD
import java.io.*;
=======
import java.io.IOException;
import java.io.PrintWriter;
>>>>>>> parent of 5c799fb... 
>>>>>>> origin/master
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
<<<<<<< HEAD
import javax.servlet.http.HttpSession;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
=======
<<<<<<< HEAD
import javax.servlet.http.HttpSession;
=======
>>>>>>> parent of 5c799fb... 
>>>>>>> origin/master


/**
 *
 * @author Themis
 */
public class JavaServlet extends HttpServlet {

<<<<<<< HEAD
    //Database credentials.Place real ones.
    private static final String DB ="jdbc:mysql://localhost:3306/dbhere";
    private static final String USER = "root";
    private static final String PASS = "passhere";
    //Admin credentials.Place real ones.
    private final String adminID = "admin";   
    private final String password = "passhere";
    
=======
    
<<<<<<< HEAD
=======
    
    
    
    
>>>>>>> parent of 5c799fb... 
>>>>>>> origin/master
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        
        try (PrintWriter out = response.getWriter()) {
            
        
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JavaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet JavaServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
<<<<<<< HEAD
    
           Connection connection = null;
           Statement stmt = null;
           ResultSet resultSet = null;
           PreparedStatement SelectUsers= null;
           PreparedStatement InsertUsers=null;
           
           PrintWriter writer = response.getWriter();
           
  
        
            //Get login details
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            String name=" ";
            
            
            //Login as admin to check questions/Leaderboards
             if(adminID.equals(user) && password.equals(pass)){
                 //Start new session
                HttpSession session;  
                session = request.getSession();
                session.setAttribute("user", user);
                
            Cookie loginCookie = new Cookie("user",user);
            //setting cookie to expiry in 30 mins
            loginCookie.setMaxAge(30*60);
            response.addCookie(loginCookie);
            request.setAttribute("name",user);
            session.setAttribute("user",user);
            
        
             RequestDispatcher view = request.getRequestDispatcher("GameStarting.jsp");
                view.forward(request, response);
           
             }
             
                      
             //Connection to database
 try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB, USER, PASS);
          
           
        } catch (ClassNotFoundException ex) {
          
          writer.println("Class not Found");
        } catch (SQLException ex) {
           ex.printStackTrace();
            writer.println("SQL Issue");
        }
 
 
 
 
            //Create new Uthldap Object. 
            Uthldap ldap = new Uthldap(user,pass);
         
             try {
                 stmt = connection.createStatement();
              
                //db query for current user 
            resultSet = stmt.executeQuery("SELECT * FROM users WHERE usernames='" + user + "'");
               
            HttpSession session;
            //Code for uth authentication.
           if(ldap.auth()){
                request.setAttribute("name", ldap.getName()); //pass the name to jsp.
                
             
                //if the user is already on database.Go to leaderboards.
                if (resultSet.next()) {        
                  
              
                    resultSet.beforeFirst();
                    
                     
                    writer.println("Welcome back " + user + "");
                    writer.println("Authenticated Your name is: " + ldap.getName() +"");
                
                // start session
                session = request.getSession();
                session.setAttribute("user", user);
                
                //setting session to expiry in 30 mins
                session.setMaxInactiveInterval(60 * 30);
                Cookie userName = new Cookie("user", user);
                userName.setMaxAge(60 * 30);
                response.addCookie(userName);
                
           
                   
                
                //You have already score!.Go to leaderboards!
                RequestDispatcher view = request.getRequestDispatcher("leaderboards.jsp");
                    view.forward(request, response);
                }
                
                else {
                    //1h eisodos tou xristi
                 writer.println("O xristis mpike 1i fora"); 
              //If there are no data insert this user into the database...
              
                    //Insert query.
                InsertUsers=connection.prepareStatement("INSERT INTO users (usernames,score,Date) " + " VALUES (?,?,?)");
                    
                   
                    InsertUsers.setString(1, user); //O user mpainei stin 1i sthlh tou database
                    InsertUsers.setInt(2,0);  //Arxikopoihsh tou score se 0.
                
                // Create an instance of SimpleDateFormat used for formatting 
                // the string representation of date (day/month/year)
           DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

            // Get the date today using Calendar object.
          Date today = Calendar.getInstance().getTime();        
                // Using DateFormat format method we can create a string 
                    // representation of a date with the defined format.
            String reportDate = df.format(today);
                //Insert String Date to database.
             InsertUsers.setString(3, reportDate);
                
               //Execute query.
                boolean result = InsertUsers.execute();
                

                if (!result) {
                   writer.println("ERROR: Wrong Query");
                } else {
                    writer.println("User " + user + " was added successfully");
                }
                  
                  
                 
               //Start new session.

                session = request.getSession();
                session.setAttribute("user", user);
         
      

                //setting session to expiry in 30 mins
                session.setMaxInactiveInterval(60 * 30);
                //add cookie
                Cookie userName = new Cookie("user", user);
                userName.setMaxAge(60 * 30);
                response.addCookie(userName);

           
                    //Ligo peritto if isws xreiastei g melontiki xrisi.
                if (resultSet.next()) {
                   
                    String username = resultSet.getString("usernames");
                    int score = resultSet.getInt("score");
                  
                    InsertUsers.setString(1,user);
                    boolean result2 = InsertUsers.execute();
                    if (!result2) {
                        writer.println("ERROR: Wrong Query");
                    }

                   
                }

            }
                RequestDispatcher view = request.getRequestDispatcher("GameStarting.jsp");
                    view.forward(request, response);
                
           }   
                else {
                    writer.println("<html><body>Authentication failed <br> Please Try Again! </body></html>");
                    writer.println("<html><body><a href=\"index.jsp\">Return</a></body></html>");
                    //Using method of HttpServletResponse ->sendRedirect
                          response.sendRedirect("loginerror.jsp");
                }    
                    
              
             
             } catch (SQLException ex) {
            Logger.getLogger(JavaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }  catch (NullPointerException ex) {
         
            writer.println("Null Pointer at stmt   ");
        } catch (Exception e) {
            e.printStackTrace();
            writer.println("Just Exception");
        }

      
       }  
=======
<<<<<<< HEAD
        
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            String name=" ";
                      
            Uthldap ldap = new Uthldap(user,pass);
            PrintWriter writer = response.getWriter();
=======
              

        
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            String option=request.getParameter("submit");
       
            
          Uthldap ldap = new Uthldap(user,pass);

          PrintWriter writer = response.getWriter();
>>>>>>> parent of 5c799fb... 
         


  
//writer.println("Eimai sto Servlet");
<<<<<<< HEAD
if(ldap.auth()){

    request.setAttribute("name", ldap.getName());
   
    writer.println("<html><body>Welcome <b>" + user + "</b><br></body></html>");
    writer.println("<html><body>Authenticated Your name is: " + ldap.getName() +"<br></body></html>");
            
               RequestDispatcher view = request.getRequestDispatcher("GameStarting.jsp");
               view.forward(request, response);
        }

else {
     writer.println("<html><body>Authentication failed <br> Please Try Again! </body></html>");
     writer.println("<html><body><a href=\"index.jsp\">Return</a></body></html>");
   //  response.sendRedirect("index.jsp"); 
=======
if(ldap.auth()==true){
            writer.println("<html><body>Welcome <b>" + user + "</b><br></body></html>");
            writer.println("<html><body>Authenticated Your name is: " + ldap.getName() +"<br></body></html>");
            
             //  RequestDispatcher view = request.getRequestDispatcher("result.jsp");
             //  view.forward(request, response);
        }

else {
     writer.println("<html><body>Authentication failed</body></html>");
>>>>>>> parent of 5c799fb... 
}
           
      

        
    }
>>>>>>> origin/master

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
