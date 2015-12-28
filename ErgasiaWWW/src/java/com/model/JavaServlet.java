/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.uthldap.Uthldap;
<<<<<<< HEAD
import java.io.*;
=======
import java.io.IOException;
import java.io.PrintWriter;
>>>>>>> parent of 5c799fb... 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
<<<<<<< HEAD
import javax.servlet.http.HttpSession;
=======
>>>>>>> parent of 5c799fb... 


/**
 *
 * @author Themis
 */
public class JavaServlet extends HttpServlet {

    
<<<<<<< HEAD
=======
    
    
    
    
>>>>>>> parent of 5c799fb... 
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
