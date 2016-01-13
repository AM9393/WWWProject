/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Code for connection to database and inserting user and score to database.
//Can be called with JavaBeans.
package com.model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Themis
 */
 public class User {
      //Database credentials.Place real ones.
            private static final String DB ="jdbc:mysql://localhost:3306/dbhere";
            private static final String USER = "root";
            private static final String PASS = "passhere";
            private String user=null;
            private int score=0;
    
           Connection connection = null;
           Statement stmt = null;
           ResultSet resultSet = null;
           PreparedStatement SelectUsers= null;
           PreparedStatement InsertUsers=null;
          // String score=(String) session.getAttribute("test");
            
           
           public User() {
            try {
                //session.getAttribute("user");
                 Class.forName("com.mysql.jdbc.Driver");
                 connection = DriverManager.getConnection(DB, USER, PASS);
              //   InsertUsers=connection.prepareStatement("INSERT INTO users (usernames,score,Date) " + " VALUES (?,?,?)");
                InsertUsers = connection.prepareStatement("UPDATE users SET score=? WHERE usernames=? ");
            } catch (SQLException ex) {
           ex.printStackTrace();
           
          }     catch (ClassNotFoundException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
         }
       public String getUser(){
      return user;
   }
   public int getScore(){
      return score;
   }
   public void setScore(int score) {
       this.score=score;
   }
           
           public void setUser (String user,int score) {
               
               this.user=user;
              
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
