/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.sql.*;

/**
 *
 * @author user 
 */
public class AccountDAO {
    public String Authenticate(AccountBean accountBean){
          String UserName = accountBean.getUsername();
          String Password = accountBean.getPassword();
          String school = accountBean.getSchool();
          Connection con = null;
          Statement statement = null;
          ResultSet resultset = null;
          
          String usernameDB = "";
          String passwordDB ="";
          String roleDB = "";
          String schoolDB = "";
          
          try{
              con = DBConnection.createConnection();
              statement = con.createStatement();
              resultset = statement.executeQuery("SELECT username,password,Role,school_name FROM school_a.school ");
          
              System.out.println("checking the query.....");
              while(resultset.next()){
                  usernameDB = resultset.getString("username");
                  passwordDB = resultset.getString("password");
                  roleDB = resultset.getString("Role");
                  schoolDB = resultset.getString("school_name");
                  System.out.println("passing the query......");
                  if(UserName.equals(usernameDB)&&Password.equals(passwordDB)&&roleDB.equals("ADMIN")
                          &&school.equals(schoolDB)){
                      return "ADMIN_ROLE";
                  }else if (UserName.equals(usernameDB)&&Password.equals(passwordDB)&&roleDB.equals("STAFF")
                          &&school.equals(schoolDB)){
                      return "STAFF_ROLE";
                  }else if (UserName.equals(usernameDB)&&Password.equals(passwordDB)&&roleDB.equals("STUDENT")
                          &&school.equals(schoolDB)){
                      return "STUDENT_ROLE";
                  }
              }
          }catch(SQLException e){
              e.printStackTrace();
          }
          
          
       return "Invalid  user Details";      
          
    }
 
}
