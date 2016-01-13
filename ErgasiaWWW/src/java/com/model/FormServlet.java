/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

<<<<<<< HEAD

=======
<<<<<<< HEAD
import com.uthldap.Uthldap;
=======

>>>>>>> parent of 5c799fb... 
>>>>>>> origin/master
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
<<<<<<< HEAD
import javax.servlet.http.HttpSession;
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
public class FormServlet extends HttpServlet {
<<<<<<< HEAD
    private int score=0;
    private int help_score=0;
    private int question=0;
    private boolean flag=false;
   // private String Score_String;
=======
<<<<<<< HEAD
    private int score=0;
   // private String Score_String;
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
        
       String Score_String = "";
       String test="";
       String choice= request.getParameter("Question1"); //H epilogi pou ekane o xristis gia tin 1h erwtisi
       String choice2=request.getParameter("Question2");
       String choice3=request.getParameter("Question3");
       String choice4=request.getParameter("Question4");
       String choice5=request.getParameter("Question5");
<<<<<<< HEAD
       
       
       
        
        
    
              
       PrintWriter writer = response.getWriter();
       HttpSession session=request.getSession(); //Start New Session
       
     
       //Num of Question depends on jsp.
       //Typecast.
      String q=(String) session.getAttribute("jspquestion");
        question=Integer.parseInt(q);
       
        //Initialize score for every user.
        if(question==1) {
            score=0;
        }
        
        
       //An i epilogi einai i swsti  afksise to score.Swstes apantiseis-> (1,3,2,2,3)
      if (("Choice1".equals(choice)) || ("Choice3".equals(choice2))  ||("Choice2".equals(choice3)) || ("Choice2".equals(choice4)) || ("Choice3".equals(choice5))) {    
          
           score++;    
           
      }
      
      else {    
          flag=true; //flag oti exoume kanei lathos toulaxiston 1 fora lathos wste na ektipwsoume katallilo minima sto mistakes.jsp
          //An o xristis ekane lathos stin 1i erwtisi perna to mistake1 ws parametro sto mistakes.jsp
          if (question==1) {
              session.setAttribute("mistake1","<a href=\"https://en.wikipedia.org/wiki/JavaServer_Pages\" target=\"_blank\">Q1 wrong:JSP stands for.. </a>");
                 
          
          }
          //Lathos stin 2i erwtisi ktlp.
          else if (question==2) {
              session.setAttribute("mistake2","<a href=\"http://dl.upforfree.com/ebooks/Head%20First%20Servlets%20and%20JSP,%202nd%20Edition%20-ebooksfeed.com.pdf\" target=\"_blank\">Q2 wrong:Check at Chapter 4,pages 134-136</a>");
          }
          else if (question==3){
            session.setAttribute("mistake3","<a href=\"http://dl.upforfree.com/ebooks/Head%20First%20Servlets%20and%20JSP,%202nd%20Edition%20-ebooksfeed.com.pdf\" target=\"_blank\">Q3 wrong:Check at Chapter 5,page 159 </a>");
          }
          else if(question==4) {
               session.setAttribute("mistake4","<a href=\"http://dl.upforfree.com/ebooks/Head%20First%20Servlets%20and%20JSP,%202nd%20Edition%20-ebooksfeed.com.pdf\" target=\"_blank\">Q4 wrong:Check at Chapter 8,pages 403-407</a>");
          }
          else if(question==5) {
               session.setAttribute("mistake5","<a href=\"http://www.tutorialspoint.com/jsp/jsp_expression_language.htm\" target=\"_blank\">Q5 wrong:Check here for EL details </a>.");
          }
       
         
       writer.println("Wrong Choice");
       writer.println("Your score is  "  + score);
      }
        
        
        request.setAttribute("Score_String", Integer.toString(score));
        session.setAttribute("test",Integer.toString(score));
        
        
        //Anakatefthinsi analoga me tin erwtisi pou vriskomaste.
        if (question==1) {
        //Go to result.jsp
          RequestDispatcher view = request.getRequestDispatcher("result.jsp");
           view.forward(request, response);      
        }
        else if(question==2) {
              //Go to result2.jsp
            RequestDispatcher view = request.getRequestDispatcher("result2.jsp");
           view.forward(request, response);      
            
        }
        else if(question==3) {
             //Go to result3.jsp
           RequestDispatcher view = request.getRequestDispatcher("result3.jsp");
           view.forward(request, response);      
            
        }
         else if(question==4) {
              //Go to result4.jsp
            RequestDispatcher view = request.getRequestDispatcher("result4.jsp");
           view.forward(request, response);      
            
        }
         else if(question==5) {
             help_score=score;
             score=0; //Arxikopoihsh score gia epomeno xristi.
            question=0; //Arxikopoihsh question gia epomeno xristi.
            
            if(flag==true) {
                  //Print you did some mistakes at mistakes.jsp
                session.setAttribute("printatmistakes","<h1>Oops! You did some mistakes :)</h1> ");
            }
            else {                       //An ola einai swsta.
               //Print everything was correct at mistakes.jsp!
                session.setAttribute("printatmistakes","<h1>Congratulations!You have answered all the questions correct!</h1> ");
            }
            flag=false; //arxikopoihsh g epomeno xristi.
            //Go to mistakes.jsp
           RequestDispatcher view = request.getRequestDispatcher("mistakes.jsp");
           view.forward(request, response);
         }
         else  {
             //Kyriws gia debug.An ginei kapio lathos kai ypervoume to plithos twn erwtisewn.
              writer.println("Lathos arithmos question ooops!");   
              writer.println("Score" + score);
         }
=======
               
               
               
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
        
      

=======
     //   processRequest(request, response);
        
     
       String choice= request.getParameter("submit");
       PrintWriter writer = response.getWriter();
         
      //writer.println("Your choice is");
       
        
    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response);   
        
        
>>>>>>> parent of 5c799fb... 
     
        
>>>>>>> origin/master
        
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
