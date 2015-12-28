/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.uthldap.Uthldap;
import java.io.IOException;
import java.io.PrintWriter;
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
public class FormServlet extends HttpServlet {
    private int score=0;
   // private String Score_String;

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
            out.println("<title>Servlet FormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FormServlet at " + request.getContextPath() + "</h1>");
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
        
       String Score_String = "";
       String test="";
       String choice= request.getParameter("Question1"); //H epilogi pou ekane o xristis gia tin 1h erwtisi
       String choice2=request.getParameter("Question2");
       String choice3=request.getParameter("Question3");
       String choice4=request.getParameter("Question4");
       String choice5=request.getParameter("Question5");
               
               
               
       PrintWriter writer = response.getWriter();
       HttpSession session=request.getSession(); //Start New Session
       
      //writer.println("Your choice is \n" + choice);
    //  writer.println(choice);
      if ("Choice1".equals(choice)) {        //An i epilogi einai i 1i apantisi (pou einai kai i swsti) afksise to score
          
           score++;    
        // writer.println("Your score is  " + score);
        request.setAttribute("Score_String", Integer.toString(score));
       // session.setAttribute("test",Integer.toString(score));
          RequestDispatcher view = request.getRequestDispatcher("result.jsp");
           view.forward(request, response);      
        
   
      }
      else if("Choice3".equals(choice2)) { //An i epilogi einai i 1i apantisi (pou einai kai i swsti) afksise to score
          score++;
          request.setAttribute("Score_String", Integer.toString(score));
          RequestDispatcher view = request.getRequestDispatcher("result2.jsp");
          view.forward(request, response);         
      }
      
      else {
         request.setAttribute("Score_String",Integer.toString(score));
           
       writer.println("Wrong Choice");
       writer.println("Your score is  "  + score);
       
          RequestDispatcher view = request.getRequestDispatcher("result.jsp");
           view.forward(request, response);      
        
        
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
