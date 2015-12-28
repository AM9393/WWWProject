/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.uthldap.Uthldap;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Themis
 */
public class JavaServlet extends HttpServlet {

    
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
        
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            String name=" ";
                      
            Uthldap ldap = new Uthldap(user,pass);
            PrintWriter writer = response.getWriter();
         


  
//writer.println("Eimai sto Servlet");
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
