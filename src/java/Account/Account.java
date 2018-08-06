/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author user
 */
public class Account extends HttpServlet {

    private static final long serialVersionUID = 1L;



   
    

    @Override
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String school_name = request.getParameter("school");
            HttpSession session;
           System.out.println(username);
          System.out.println(password);
           System.out.println(school_name);
         
  
           AccountBean accountbean = new AccountBean();
            accountbean.setUsername(username);
            accountbean.setPassword(password);
            accountbean.setSchool(school_name);
            
            AccountDAO accountdao = new AccountDAO();
                       
            
            try{
                String UserValidate = accountdao.Authenticate(accountbean);
                switch (UserValidate) {
                    case "ADMIN_ROLE":
                        System.out.println("ADMIN HOME");
                        session = request.getSession();
                        session.setAttribute("Admin", username);
                        request.setAttribute("username", username.toUpperCase());
                        request.setAttribute("school", school_name.toUpperCase());
           
                
                  request.getRequestDispatcher("PrimarySystem/AdminPortal.jsp").forward(request, response);
                  
                        break;
                    case "STAFF_ROLE":
                        System.out.println("STAFF HOME");
                        session = request.getSession();
                        session.setAttribute("Staff", username);
                        request.setAttribute("UserName", username);
                        request.setAttribute("school", school_name.toUpperCase());
                        
                        request.getRequestDispatcher("#").forward(request, response);
                       
                        break;
                    case "STUDENT_ROLE":
                        System.out.println("STUDENT HOME");
                        session = request.getSession();
                        session.setAttribute("Student", username);
                        request.setAttribute("UserName", username);
                        request.setAttribute("school", school_name.toUpperCase());
                        
                        request.getRequestDispatcher("#").forward(request, response);
                        
                        break;
                    default:
                        System.out.println("Error Message = " + UserValidate);
                        request.setAttribute("errmsg", UserValidate);
                        request.getRequestDispatcher("edu.jsp").forward(request, response);
                        break;
                }
                      
            
          
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }
     
    }
}
