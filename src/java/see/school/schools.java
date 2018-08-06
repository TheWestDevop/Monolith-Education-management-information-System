/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package see.school;

import Account.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class schools {
     public String getName() throws SQLException{
       
        Connection con = null;
        con = DBConnection.getConnection();
        Statement stat = null;
        ResultSet res = null; 
       
        
        stat = con.createStatement();
        String data = "select * from Schools";
        res = stat.executeQuery(data);
       String name="";
        while(res.next()){
             name += " <option value=\""+ res.getString("school_name") +"\">" +res.getString("school_name");
             
        }
        name += "</option>";
        return name;
    }
    
}
