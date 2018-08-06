/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package see.school;

import Account.AccountDAO;
import Account.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class updateschool extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 

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
        

         
        try{
         
    ResultSet  resultset;

                         String schlist = "SELECT * FROM Schools";
                         
                        
                    Connection    conn = DBConnection.getConnection();
                     Statement   ps =  conn.createStatement();
                    resultset = ps.executeQuery(schlist);
                
                    while(resultset.next())
                    {
          
                     
                      request.setAttribute("value",resultset.getString("school_name"));
                      request.setAttribute("option",resultset.getString("school_name"));
                               
                    }            
                      
                      
                      }
                         catch(Exception ex)
                     {
                             ex.printStackTrace();
                             System.out.println("Error " + ex.getMessage());
                     }
                    
        
    
  }
}
    

