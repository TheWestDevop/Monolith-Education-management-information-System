/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIS;

import MIS.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class StudentDBManager {

    public StudentDBManager() {
    }
    Connection con = null;
    Statement statement = null;
    ResultSet resultset = null;
    
    //list data access object
    public  List<StudentBean> GetAllStudentInfo() throws SQLException{
        try{
        StudentBean Data;
        List<StudentBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * from creche");
        //sql.setString(1, school);
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new StudentBean();
                 
                 Data.StudentID = resultset.getString("Student_ID");
                 Data.StudentFirstName = resultset.getString("Student_Firstname");
                 Data.StudentLastName = resultset.getString("Student_Lastname");
                 Data.StudentGender = resultset.getString("Student_Gender");
                 Data.StudentAge = resultset.getString("Student_Age");
                 Data.StudentParentGuardian = resultset.getString("Student_Parent_Guardian");
                 Data.StudentAddress = resultset.getString("Student_Address");
                 Data.StudentParentContact = resultset.getString("Student_Contact");
                 Data.StudentCountry = resultset.getString("Student_Country");
                 Data.StudentClass  = resultset.getString("Student_Class");
                 Data.StudentPassword = resultset.getString("schoolname");
                 System.out.print(Data.StudentID +
                         "\n"+ Data.StudentFirstName +
                         "\n"+Data.StudentLastName+
                         "\n"+Data.StudentGender+
                         "\n"+Data.StudentAge+
                         "\n"+Data.StudentParentGuardian+
                          "\n==================================\n");
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  List<StudentBean> GetAllCreche() throws SQLException{
        try{
        StudentBean Data;
        List<StudentBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM creche");
        
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new StudentBean();
                 Data.StudentID = resultset.getString(1);
                 Data.StudentFirstName = resultset.getString(2);
                 Data.StudentLastName = resultset.getString(3);
                 Data.StudentGender = resultset.getString(4);
                 Data.StudentAge = resultset.getString(5);
                 Data.StudentParentGuardian = resultset.getString(6);
                 Data.StudentAddress = resultset.getString(7);
                 Data.StudentParentContact = resultset.getString(8);
                 Data.StudentCountry = resultset.getString(9);
                 Data.StudentClass  = resultset.getString(10);
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  List<StudentBean> GetAllNurseryOne() throws SQLException{
        try{
        StudentBean Data;
        List<StudentBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM nurseryone");
        
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new StudentBean();
                 Data.StudentID = resultset.getString(1);
                 Data.StudentFirstName = resultset.getString(2);
                 Data.StudentLastName = resultset.getString(3);
                 Data.StudentGender = resultset.getString(4);
                 Data.StudentAge = resultset.getString(5);
                 Data.StudentParentGuardian = resultset.getString(6);
                 Data.StudentAddress = resultset.getString(7);
                 Data.StudentParentContact = resultset.getString(8);
                 Data.StudentCountry = resultset.getString(9);
                 Data.StudentClass  = resultset.getString(10);
                 Data.StudentPassword = resultset.getString(11);
                 Data.StudentPassPortname = resultset.getString(12);
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  List<StudentBean> GetAllNurseryTwo() throws SQLException{
        try{
        StudentBean Data;
        List<StudentBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM nurserytwo");
        
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new StudentBean();
                 Data.StudentID = resultset.getString(1);
                 Data.StudentFirstName = resultset.getString(2);
                 Data.StudentLastName = resultset.getString(3);
                 Data.StudentGender = resultset.getString(4);
                 Data.StudentAge = resultset.getString(5);
                 Data.StudentParentGuardian = resultset.getString(6);
                 Data.StudentAddress = resultset.getString(7);
                 Data.StudentParentContact = resultset.getString(8);
                 Data.StudentCountry = resultset.getString(9);
                 Data.StudentClass  = resultset.getString(10);
                 Data.StudentPassword = resultset.getString(11);
                 Data.StudentPassPortname = resultset.getString(12);
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  List<StudentBean> GetAllPrimaryOne() throws SQLException{
        try{
        StudentBean Data;
        List<StudentBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM primaryone");
        
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new StudentBean();
                 Data.StudentID = resultset.getString(1);
                 Data.StudentFirstName = resultset.getString(2);
                 Data.StudentLastName = resultset.getString(3);
                 Data.StudentGender = resultset.getString(4);
                 Data.StudentAge = resultset.getString(5);
                 Data.StudentParentGuardian = resultset.getString(6);
                 Data.StudentAddress = resultset.getString(7);
                 Data.StudentParentContact = resultset.getString(8);
                 Data.StudentCountry = resultset.getString(9);
                 Data.StudentClass  = resultset.getString(10);
                 Data.StudentPassword = resultset.getString(11);
                 Data.StudentPassPortname = resultset.getString(12);
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  List<StudentBean> GetAllPrimaryTwo() throws SQLException{
        try{
        StudentBean Data;
        List<StudentBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM primarytwo");
        
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new StudentBean();
                 Data.StudentID = resultset.getString(1);
                 Data.StudentFirstName = resultset.getString(2);
                 Data.StudentLastName = resultset.getString(3);
                 Data.StudentGender = resultset.getString(4);
                 Data.StudentAge = resultset.getString(5);
                 Data.StudentParentGuardian = resultset.getString(6);
                 Data.StudentAddress = resultset.getString(7);
                 Data.StudentParentContact = resultset.getString(8);
                 Data.StudentCountry = resultset.getString(9);
                 Data.StudentClass  = resultset.getString(10);
                 Data.StudentPassword = resultset.getString(11);
                 Data.StudentPassPortname = resultset.getString(12);
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  List<StudentBean> GetAllPrimaryThree() throws SQLException{
        try{
        StudentBean Data;
        List<StudentBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM primarythree");
        
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new StudentBean();
                 Data.StudentID = resultset.getString(1);
                 Data.StudentFirstName = resultset.getString(2);
                 Data.StudentLastName = resultset.getString(3);
                 Data.StudentGender = resultset.getString(4);
                 Data.StudentAge = resultset.getString(5);
                 Data.StudentParentGuardian = resultset.getString(6);
                 Data.StudentAddress = resultset.getString(7);
                 Data.StudentParentContact = resultset.getString(8);
                 Data.StudentCountry = resultset.getString(9);
                 Data.StudentClass  = resultset.getString(10);
                 Data.StudentPassword = resultset.getString(11);
                 Data.StudentPassPortname = resultset.getString(12);
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  List<StudentBean> GetAllPrimaryFour() throws SQLException{
        try{
        StudentBean Data;
        List<StudentBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM primaryfour");
        
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new StudentBean();
                 Data.StudentID = resultset.getString(1);
                 Data.StudentFirstName = resultset.getString(2);
                 Data.StudentLastName = resultset.getString(3);
                 Data.StudentGender = resultset.getString(4);
                 Data.StudentAge = resultset.getString(5);
                 Data.StudentParentGuardian = resultset.getString(6);
                 Data.StudentAddress = resultset.getString(7);
                 Data.StudentParentContact = resultset.getString(8);
                 Data.StudentCountry = resultset.getString(9);
                 Data.StudentClass  = resultset.getString(10);
                 Data.StudentPassword = resultset.getString(11);
                 Data.StudentPassPortname = resultset.getString(12);
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  List<StudentBean> GetAllPrimaryFive() throws SQLException{
        try{
        StudentBean Data;
        List<StudentBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM primaryfive");
        
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new StudentBean();
                 Data.StudentID = resultset.getString(1);
                 Data.StudentFirstName = resultset.getString(2);
                 Data.StudentLastName = resultset.getString(3);
                 Data.StudentGender = resultset.getString(4);
                 Data.StudentAge = resultset.getString(5);
                 Data.StudentParentGuardian = resultset.getString(6);
                 Data.StudentAddress = resultset.getString(7);
                 Data.StudentParentContact = resultset.getString(8);
                 Data.StudentCountry = resultset.getString(9);
                 Data.StudentClass  = resultset.getString(10);
                 Data.StudentPassword = resultset.getString(11);
                 Data.StudentPassPortname = resultset.getString(12);
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  List<StudentBean> GetAllPrimarySix() throws SQLException{
        try{
        StudentBean Data;
        List<StudentBean>  students = new ArrayList<>();
        con = DBConnection.getConnection();
        
        PreparedStatement sql = con.prepareStatement("SELECT * FROM primarySix");
        
        resultset = sql.executeQuery();
        System.out.println("checking the query.....");
              while(resultset.next()){
                 Data = new StudentBean();
                 Data.StudentID = resultset.getString(1);
                 Data.StudentFirstName = resultset.getString(2);
                 Data.StudentLastName = resultset.getString(3);
                 Data.StudentGender = resultset.getString(4);
                 Data.StudentAge = resultset.getString(5);
                 Data.StudentParentGuardian = resultset.getString(6);
                 Data.StudentAddress = resultset.getString(7);
                 Data.StudentParentContact = resultset.getString(8);
                 Data.StudentCountry = resultset.getString(9);
                 Data.StudentClass  = resultset.getString(10);
                 Data.StudentPassword = resultset.getString(11);
                 Data.StudentPassPortname = resultset.getString(12);
                 students.add(Data);
              }
        
    return students;
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    
    //update data access object
    public String UpdateStudentCreche(StudentBean bean) {
        try {
            
             con  = DBConnection.createConnection();
        
             
             
            PreparedStatement sql = con.prepareStatement("UPDATE creche SET Student_Firstname=?,Student_Lastname=?,"
                    + "Student_Gender=?,Student_Age=?, Student_Parent_Guardian=?, Student_Address=?,"
                    + "Student_Contact=?,Student_Country=?,Student_Class=? WHERE Student_ID=?");
            
             
            sql.setString(1,bean.getStudentFirstName());
            sql.setString(2, bean.getStudentLastName());
            sql.setString(3, bean.getStudentGender());
            sql.setString(4, bean.getStudentAge());
            sql.setString(5, bean.getStudentParentGuardian());
            sql.setString(6, bean.getStudentAddress());
            sql.setString(7, bean.getStudentParentContact());
            sql.setString(8, bean.getStudentCountry());
            sql.setString(9, "Primary Six");
            sql.setString(10, bean.getStudentID());
            
            int i =  sql.executeUpdate();
            
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" + ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return "Error" + ex;
            
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String UpdateStudentNurseryOne(StudentBean bean) {
        try {
            
             con  = DBConnection.createConnection();
        
             
             
            PreparedStatement sql = con.prepareStatement("UPDATE Nurseryone SET Student_Firstname=?,Student_Lastname=?,"
                    + "Student_Gender=?,Student_Age=?, Student_Parent_Guardian=?, Student_Address=?,"
                    + "Student_Contact=?,Student_Country=?,Student_Class=?, Student_Password=?,Student_PassPort=?,"
                    + "Student_ImagePath=? WHERE Student_ID=?");
            
             
            sql.setString(1,bean.getStudentFirstName());
            sql.setString(2, bean.getStudentLastName());
            sql.setString(3, bean.getStudentGender());
            sql.setString(4, bean.getStudentAge());
            sql.setString(5, bean.getStudentParentGuardian());
            sql.setString(6, bean.getStudentAddress());
            sql.setString(7, bean.getStudentParentContact());
            sql.setString(8, bean.getStudentCountry());
            sql.setString(9, "Primary Six");
            sql.setString(10, bean.getStudentPassword());
            sql.setString(11, bean.getStudentPassPortname());
            sql.setString(12, bean.getPassPortPath());
            sql.setString(13, bean.getStudentID());
            
            int i =  sql.executeUpdate();
            
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" + ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return "Error" + ex;
            
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String UpdateStudentNurseryTwo(StudentBean bean) {
        try {
            
             con  = DBConnection.createConnection();
        
             
             
            PreparedStatement sql = con.prepareStatement("UPDATE Nurserytwo SET Student_Firstname=?,Student_Lastname=?,"
                    + "Student_Gender=?,Student_Age=?, Student_Parent_Guardian=?, Student_Address=?,"
                    + "Student_Contact=?,Student_Country=?,Student_Class=?, Student_Password=?,Student_PassPort=?,"
                    + "Student_ImagePath=? WHERE Student_ID=?");
            
             
            sql.setString(1,bean.getStudentFirstName());
            sql.setString(2, bean.getStudentLastName());
            sql.setString(3, bean.getStudentGender());
            sql.setString(4, bean.getStudentAge());
            sql.setString(5, bean.getStudentParentGuardian());
            sql.setString(6, bean.getStudentAddress());
            sql.setString(7, bean.getStudentParentContact());
            sql.setString(8, bean.getStudentCountry());
            sql.setString(9, "Primary Six");
            sql.setString(10, bean.getStudentPassword());
            sql.setString(11, bean.getStudentPassPortname());
            sql.setString(12, bean.getPassPortPath());
            sql.setString(13, bean.getStudentID());
            
            int i =  sql.executeUpdate();
            
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" + ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return "Error" + ex;
            
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String UpdateStudentPrimaryOne(StudentBean bean) {
        try {
            
             con  = DBConnection.createConnection();
        
             
             
            PreparedStatement sql = con.prepareStatement("UPDATE Primaryone SET Student_Firstname=?,Student_Lastname=?,"
                    + "Student_Gender=?,Student_Age=?, Student_Parent_Guardian=?, Student_Address=?,"
                    + "Student_Contact=?,Student_Country=?,Student_Class=?, Student_Password=?,Student_PassPort=?,"
                    + "Student_ImagePath=? WHERE Student_ID=?");
            
             
            sql.setString(1,bean.getStudentFirstName());
            sql.setString(2, bean.getStudentLastName());
            sql.setString(3, bean.getStudentGender());
            sql.setString(4, bean.getStudentAge());
            sql.setString(5, bean.getStudentParentGuardian());
            sql.setString(6, bean.getStudentAddress());
            sql.setString(7, bean.getStudentParentContact());
            sql.setString(8, bean.getStudentCountry());
            sql.setString(9, "Primary Six");
            sql.setString(10, bean.getStudentPassword());
            sql.setString(11, bean.getStudentPassPortname());
            sql.setString(12, bean.getPassPortPath());
            sql.setString(13, bean.getStudentID());
            
            int i =  sql.executeUpdate();
            
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" + ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return "Error" + ex;
            
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String UpdateStudentPrimaryTwo(StudentBean bean) {
        try {
            
             con  = DBConnection.createConnection();
        
             
             
            PreparedStatement sql = con.prepareStatement("UPDATE primarytwo SET Student_Firstname=?,Student_Lastname=?,"
                    + "Student_Gender=?,Student_Age=?, Student_Parent_Guardian=?, Student_Address=?,"
                    + "Student_Contact=?,Student_Country=?,Student_Class=?, Student_Password=?,"
                    + "Student_PassPort=?,Student_ImagePath=? WHERE Student_ID=?");
            
             
            sql.setString(1,bean.getStudentFirstName());
            sql.setString(2, bean.getStudentLastName());
            sql.setString(3, bean.getStudentGender());
            sql.setString(4, bean.getStudentAge());
            sql.setString(5, bean.getStudentParentGuardian());
            sql.setString(6, bean.getStudentAddress());
            sql.setString(7, bean.getStudentParentContact());
            sql.setString(8, bean.getStudentCountry());
            sql.setString(9, "Primary Six");
            sql.setString(10, bean.getStudentPassword());
            sql.setString(11, bean.getStudentPassPortname());
            sql.setString(12, bean.getPassPortPath());
            sql.setString(13, bean.getStudentID());
            
            int i =  sql.executeUpdate();
            
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" + ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return "Error" + ex;
            
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String UpdateStudentPrimaryThree(StudentBean bean) {
        try {
            
             con  = DBConnection.createConnection();
        
             
             
            PreparedStatement sql = con.prepareStatement("UPDATE Primarythree SET Student_Firstname=?,Student_Lastname=?,"
                    + "Student_Gender=?,Student_Age=?, Student_Parent_Guardian=?, Student_Address=?,"
                    + "Student_Contact=?,Student_Country=?,Student_Class=?, Student_Password=?,"
                    + "Student_PassPort=?,Student_ImagePath=? WHERE Student_ID=?");
            
             
            sql.setString(1,bean.getStudentFirstName());
            sql.setString(2, bean.getStudentLastName());
            sql.setString(3, bean.getStudentGender());
            sql.setString(4, bean.getStudentAge());
            sql.setString(5, bean.getStudentParentGuardian());
            sql.setString(6, bean.getStudentAddress());
            sql.setString(7, bean.getStudentParentContact());
            sql.setString(8, bean.getStudentCountry());
            sql.setString(9, "Primary Six");
            sql.setString(10, bean.getStudentPassword());
            sql.setString(11, bean.getStudentPassPortname());
            sql.setString(12, bean.getPassPortPath());
            sql.setString(13, bean.getStudentID());
            
            int i =  sql.executeUpdate();
            
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" + ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return "Error" + ex;
            
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String UpdateStudentPrimaryFour(StudentBean bean) {
        try {
            
             con  = DBConnection.createConnection();
        
             
             
            PreparedStatement sql = con.prepareStatement("UPDATE primaryfour SET Student_Firstname=?,Student_Lastname=?,"
                    + "Student_Gender=?,Student_Age=?, Student_Parent_Guardian=?, Student_Address=?,"
                    + "Student_Contact=?,Student_Country=?,Student_Class=?, Student_Password=?,"
                    + "Student_PassPort=?,Student_ImagePath=? WHERE Student_ID=?");
            
             
            sql.setString(1,bean.getStudentFirstName());
            sql.setString(2, bean.getStudentLastName());
            sql.setString(3, bean.getStudentGender());
            sql.setString(4, bean.getStudentAge());
            sql.setString(5, bean.getStudentParentGuardian());
            sql.setString(6, bean.getStudentAddress());
            sql.setString(7, bean.getStudentParentContact());
            sql.setString(8, bean.getStudentCountry());
            sql.setString(9, "Primary Six");
            sql.setString(10, bean.getStudentPassword());
            sql.setString(11, bean.getStudentPassPortname());
            sql.setString(12, bean.getPassPortPath());
            sql.setString(13, bean.getStudentID());
            
            int i =  sql.executeUpdate();
            
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" + ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return "Error" + ex;
            
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String UpdateStudentPrimaryFive(StudentBean bean) {
        try {
            
             con  = DBConnection.createConnection();
        
             
             
            PreparedStatement sql = con.prepareStatement("UPDATE Primaryfive SET Student_Firstname=?,Student_Lastname=?,"
                    + "Student_Gender=?,Student_Age=?, Student_Parent_Guardian=?, Student_Address=?,"
                    + "Student_Contact=?,Student_Country=?,Student_Class=?, Student_Password=?,"
                    + "Student_PassPort=?,Student_ImagePath=? WHERE Student_ID=?");
            
             
            sql.setString(1,bean.getStudentFirstName());
            sql.setString(2, bean.getStudentLastName());
            sql.setString(3, bean.getStudentGender());
            sql.setString(4, bean.getStudentAge());
            sql.setString(5, bean.getStudentParentGuardian());
            sql.setString(6, bean.getStudentAddress());
            sql.setString(7, bean.getStudentParentContact());
            sql.setString(8, bean.getStudentCountry());
            sql.setString(9, "Primary Six");
            sql.setString(10, bean.getStudentPassword());
            sql.setString(11, bean.getStudentPassPortname());
            sql.setString(12, bean.getPassPortPath());
            sql.setString(13, bean.getStudentID());
            
            int i =  sql.executeUpdate();
            
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" + ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return "Error" + ex;
            
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String UpdateStudentPrimarySix(StudentBean bean) {
        try {
            
             con  = DBConnection.createConnection();
        
             
             
            PreparedStatement sql = con.prepareStatement("UPDATE primarysix SET Student_Firstname=?,Student_Lastname=?,"
                    + "Student_Gender=?,Student_Age=?, Student_Parent_Guardian=?, Student_Address=?,"
                    + "Student_Contact=?,Student_Country=?,Student_Class=?, Student_Password=?,"
                    + "Student_PassPort=?,Student_ImagePath=? WHERE Student_ID=?");
            
             
            sql.setString(1,bean.getStudentFirstName());
            sql.setString(2, bean.getStudentLastName());
            sql.setString(3, bean.getStudentGender());
            sql.setString(4, bean.getStudentAge());
            sql.setString(5, bean.getStudentParentGuardian());
            sql.setString(6, bean.getStudentAddress());
            sql.setString(7, bean.getStudentParentContact());
            sql.setString(8, bean.getStudentCountry());
            sql.setString(9, "Primary Six");
            sql.setString(10, bean.getStudentPassword());
            sql.setString(11, bean.getStudentPassPortname());
            sql.setString(12, bean.getPassPortPath());
            sql.setString(13, bean.getStudentID());
            
            int i =  sql.executeUpdate();
            
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" + ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return "Error" + ex;
            
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //delete data access object
    public String DeleteStudentFromCreche(int ID) {
       try {
            
            con  = DBConnection.createConnection();
           
             
             
            PreparedStatement sql = con.prepareStatement("DELETE FROM Creche WHERE Student_ID=?");
            sql.setInt(1, ID);

            sql.execute();
            
              return "Deleted";
            
            
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" +ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
          return "Error" +ex;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
    public String DeleteStudentFromNurseryOne(int ID) {
       try {
            
            con  = DBConnection.createConnection();
           
             
             
            PreparedStatement sql = con.prepareStatement("DELETE FROM nurseryone WHERE Student_ID=?");
            sql.setInt(1, ID);

            sql.execute();
            
              return "Deleted";
            
            
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" +ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
          return "Error" +ex;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
    public String DeleteStudentFromNurseryTwo(int ID) {
       try {
            
            con  = DBConnection.createConnection();
           
             
             
            PreparedStatement sql = con.prepareStatement("DELETE FROM Creche WHERE Student_ID=?");
            sql.setInt(1, ID);

            sql.execute();
            
              return "Deleted";
            
            
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" +ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
          return "Error" +ex;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
    public String DeleteStudentFromPrimaryOne(int ID) {
       try {
            
            con  = DBConnection.createConnection();
           
             
             
            PreparedStatement sql = con.prepareStatement("DELETE FROM primaryone WHERE Student_ID=?");
            sql.setInt(1, ID);

            sql.execute();
            
              return "Deleted";
            
            
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" +ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
          return "Error" +ex;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
    public String DeleteStudentFromPrimaryTwo(int ID) {
       try {
            
            con  = DBConnection.createConnection();
           
             
             
            PreparedStatement sql = con.prepareStatement("DELETE FROM primarytwo WHERE Student_ID=?");
            sql.setInt(1, ID);

            sql.execute();
            
              return "Deleted";
            
            
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" +ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
          return "Error" +ex;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
    public String DeleteStudentFromPrimaryThree(int ID) {
       try {
            
            con  = DBConnection.createConnection();
           
             
             
            PreparedStatement sql = con.prepareStatement("DELETE FROM primarythree WHERE Student_ID=?");
            sql.setInt(1, ID);

            sql.execute();
            
              return "Deleted";
            
            
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" +ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
          return "Error" +ex;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
    public String DeleteStudentFromPrimaryFour(int ID) {
       try {
            
            con  = DBConnection.createConnection();
           
             
             
            PreparedStatement sql = con.prepareStatement("DELETE FROM primaryfour WHERE Student_ID=?");
            sql.setInt(1, ID);

            sql.execute();
            
              return "Deleted";
            
            
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" +ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
          return "Error" +ex;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
    public String DeleteStudentFromPrimaryFive(int ID) {
       try {
            
            con  = DBConnection.createConnection();
           
             
             
            PreparedStatement sql = con.prepareStatement("DELETE FROM primaryfive WHERE Student_ID=?");
            sql.setInt(1, ID);

            sql.execute();
            
              return "Deleted";
            
            
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" +ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
          return "Error" +ex;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
    public String DeleteStudentFromPrimarySix(int ID) {
       try {
            
            con  = DBConnection.createConnection();
           
             
             
            PreparedStatement sql = con.prepareStatement("DELETE FROM primarysix WHERE Student_ID=?");
            sql.setInt(1, ID);

            sql.execute();
            
              return "Deleted";
            
            
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return "Error" +ex;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
          return "Error" +ex;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
    
    //insert data access object
    public  String InsertStudentCreche(String school) throws SQLException{
        StudentBean bean = new StudentBean();
        try{
          String query  = "insert into creche value(?,?,?,?,?,?,?,?,?,?) where creche.schoolname = ?";
            con = DBConnection.createConnection();
            PreparedStatement sql = con.prepareStatement(query);
            sql.setString(1, bean.getStudentID());
            sql.setString(2,bean.getStudentFirstName());
            sql.setString(3, bean.getStudentLastName());
            sql.setString(4, bean.getStudentGender());
            sql.setString(5, bean.getStudentAge());
            sql.setString(6, bean.getStudentParentGuardian());
            sql.setString(7, bean.getStudentAddress());
            sql.setString(8, bean.getStudentParentContact());
            sql.setString(9, bean.getStudentCountry());
            sql.setString(10, "Creche");
            sql.setString(11, school);
            int i =  sql.executeUpdate();
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  String InsertStudentNurseryOne(String school) throws SQLException{
        StudentBean bean = new StudentBean();
        try{
          String query  = "insert into Nurseryone value(?,?,?,?,?,?,?,?,?,?,?,?,?) where schoolname = ?";
            con = DBConnection.createConnection();
            PreparedStatement sql = con.prepareStatement(query);
            sql.setString(1, bean.getStudentID());
            sql.setString(2,bean.getStudentFirstName());
            sql.setString(3, bean.getStudentLastName());
            sql.setString(4, bean.getStudentGender());
            sql.setString(5, bean.getStudentAge());
            sql.setString(6, bean.getStudentParentGuardian());
            sql.setString(7, bean.getStudentAddress());
            sql.setString(8, bean.getStudentParentContact());
            sql.setString(9, bean.getStudentCountry());
            sql.setString(10, "Nursery One");
            sql.setString(11, bean.getStudentPassword());
            sql.setString(12, bean.getStudentPassPortname());
            sql.setString(13, bean.getPassPortPath());
            sql.setString(14, school);
            int i =  sql.executeUpdate();
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  String InsertStudentNurseryTwo(String school) throws SQLException{
        StudentBean bean = new StudentBean();
        try{
          String query  = "insert into NurseryTwo value(?,?,?,?,?,?,?,?,?,?,?,?,?) where schoolname=?";
            con = DBConnection.createConnection();
            PreparedStatement sql = con.prepareStatement(query);
            sql.setString(1, bean.getStudentID());
            sql.setString(2,bean.getStudentFirstName());
            sql.setString(3, bean.getStudentLastName());
            sql.setString(4, bean.getStudentGender());
            sql.setString(5, bean.getStudentAge());
            sql.setString(6, bean.getStudentParentGuardian());
            sql.setString(7, bean.getStudentAddress());
            sql.setString(8, bean.getStudentParentContact());
            sql.setString(9, bean.getStudentCountry());
            sql.setString(10, "Nursery Two");
            sql.setString(11, bean.getStudentPassword());
            sql.setString(12, bean.getStudentPassPortname());
            sql.setString(13, bean.getPassPortPath());
            sql.setString(14, school);
            
            int i =  sql.executeUpdate();
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  String InsertStudentPrimaryOne(String school) throws SQLException{
        StudentBean bean = new StudentBean();
        
        try{
          String query  = "insert into primaryone value(?,?,?,?,?,?,?,?,?,?,?,?,?) where schoolname = ?";
            con = DBConnection.createConnection();
            PreparedStatement sql = con.prepareStatement(query);
            sql.setString(1, bean.getStudentID());
            sql.setString(2,bean.getStudentFirstName());
            sql.setString(3, bean.getStudentLastName());
            sql.setString(4, bean.getStudentGender());
            sql.setString(5, bean.getStudentAge());
            sql.setString(6, bean.getStudentParentGuardian());
            sql.setString(7, bean.getStudentAddress());
            sql.setString(8, bean.getStudentParentContact());
            sql.setString(9, bean.getStudentCountry());
            sql.setString(10, "Primary One");
            sql.setString(11, bean.getStudentPassword());
            sql.setString(12, bean.getStudentPassPortname());
            sql.setString(13, bean.getPassPortPath());
            sql.setString(14, school);
            
            int i =  sql.executeUpdate();
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  String InsertStudentPrimaryTwo(String school) throws SQLException{
        StudentBean bean = new StudentBean();
        try{
          String query  = "insert into primarytwo value(?,?,?,?,?,?,?,?,?,?,?,?,?) where schoolname = ?";
            con = DBConnection.createConnection();
            PreparedStatement sql = con.prepareStatement(query);
            sql.setString(1, bean.getStudentID());
            sql.setString(2,bean.getStudentFirstName());
            sql.setString(3, bean.getStudentLastName());
            sql.setString(4, bean.getStudentGender());
            sql.setString(5, bean.getStudentAge());
            sql.setString(6, bean.getStudentParentGuardian());
            sql.setString(7, bean.getStudentAddress());
            sql.setString(8, bean.getStudentParentContact());
            sql.setString(9, bean.getStudentCountry());
            sql.setString(10, "Primary Two");
            sql.setString(11, bean.getStudentPassword());
            sql.setString(12, bean.getStudentPassPortname());
            sql.setString(13, bean.getPassPortPath());
            sql.setString(14, school);
            
            int i =  sql.executeUpdate();
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  String InsertStudentPrimaryThree(String school) throws SQLException{
        StudentBean bean = new StudentBean();
        
        try{
          String query  = "insert into primarythree value(?,?,?,?,?,?,?,?,?,?,?,?,?) where schoolname =?";
            con = DBConnection.createConnection();
            PreparedStatement sql = con.prepareStatement(query);
            sql.setString(1, bean.getStudentID());
            sql.setString(2,bean.getStudentFirstName());
            sql.setString(3, bean.getStudentLastName());
            sql.setString(4, bean.getStudentGender());
            sql.setString(5, bean.getStudentAge());
            sql.setString(6, bean.getStudentParentGuardian());
            sql.setString(7, bean.getStudentAddress());
            sql.setString(8, bean.getStudentParentContact());
            sql.setString(9, bean.getStudentCountry());
            sql.setString(10, "Primary Three");
            sql.setString(11, bean.getStudentPassword());
            sql.setString(12, bean.getStudentPassPortname());
            sql.setString(13, bean.getPassPortPath());
            sql.setString(5,school);
            
            int i =  sql.executeUpdate();
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  String InsertStudentPrimaryFour(String school) throws SQLException{
        StudentBean bean = new StudentBean();
        
        try{
          String query  = "insert into primaryfour value(?,?,?,?,?,?,?,?,?,?,?,?,?) where schoolname =?";
            con = DBConnection.createConnection();
            PreparedStatement sql = con.prepareStatement(query);
            sql.setString(1, bean.getStudentID());
            sql.setString(2,bean.getStudentFirstName());
            sql.setString(3, bean.getStudentLastName());
            sql.setString(4, bean.getStudentGender());
            sql.setString(5, bean.getStudentAge());
            sql.setString(6, bean.getStudentParentGuardian());
            sql.setString(7, bean.getStudentAddress());
            sql.setString(8, bean.getStudentParentContact());
            sql.setString(9, bean.getStudentCountry());
            sql.setString(10, "Primary Four");
            sql.setString(11, bean.getStudentPassword());
            sql.setString(12, bean.getStudentPassPortname());
            sql.setString(13, bean.getPassPortPath());
            sql.setString(14,school);
            
            int i =  sql.executeUpdate();
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  String InsertStudentPrimaryFive(String school) throws SQLException{
        StudentBean bean = new StudentBean();
        
        try{
          String query  = "insert into primarythree value(?,?,?,?,?,?,?,?,?,?,?,?,?) where schoolname =?";
            con = DBConnection.createConnection();
            PreparedStatement sql = con.prepareStatement(query);
            sql.setString(1, bean.getStudentID());
            sql.setString(2,bean.getStudentFirstName());
            sql.setString(3, bean.getStudentLastName());
            sql.setString(4, bean.getStudentGender());
            sql.setString(5, bean.getStudentAge());
            sql.setString(6, bean.getStudentParentGuardian());
            sql.setString(7, bean.getStudentAddress());
            sql.setString(8, bean.getStudentParentContact());
            sql.setString(9, bean.getStudentCountry());
            sql.setString(10, "Primary Five");
            sql.setString(11, bean.getStudentPassword());
            sql.setString(12, bean.getStudentPassPortname());
            sql.setString(13, bean.getPassPortPath());
            sql.setString(14,school);
            
            int i =  sql.executeUpdate();
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public  String InsertStudentPrimarySix(String school) throws SQLException{
        StudentBean bean = new StudentBean();
        
        try{
          String query  = "insert into primarysix value(?,?,?,?,?,?,?,?,?,?,?,?,?) where schoolname =?";
            con = DBConnection.createConnection();
            PreparedStatement sql = con.prepareStatement(query);
            sql.setString(1, bean.getStudentID());
            sql.setString(2,bean.getStudentFirstName());
            sql.setString(3, bean.getStudentLastName());
            sql.setString(4, bean.getStudentGender());
            sql.setString(5, bean.getStudentAge());
            sql.setString(6, bean.getStudentParentGuardian());
            sql.setString(7, bean.getStudentAddress());
            sql.setString(8, bean.getStudentParentContact());
            sql.setString(9, bean.getStudentCountry());
            sql.setString(10, "Primary Three");
            sql.setString(11, bean.getStudentPassword());
            sql.setString(12, bean.getStudentPassPortname());
            sql.setString(13, bean.getPassPortPath());
            sql.setString(14,school);
            
            int i =  sql.executeUpdate();
            if (i!=0){  //Just to ensure data has been inserted into the database
                 return "success";
            }
            else{
                return "Error";
            }
        }catch (SQLException ex) {
            Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
}
