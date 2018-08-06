/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIS;

/**
 *
 * @author user
 */
public class StudentBean {
    String StudentID;
    String StudentFirstName;
    String StudentLastName;
    String StudentGender;
    String StudentAge;
    String StudentClass;
    String StudentAddress;
    String StudentParentContact;
    String StudentParentGuardian;
    String StudentCountry;
    String StudentPassPortname;
    String PassPortPath;
    String StudentPassword;

    
    
    public StudentBean() {
        super();
    }

          public  StudentBean(String StudentID, String StudentFirstName,
            String StudentLastName,
            String StudentGender, String StudentAge, String StudentClass, 
            String StudentAddress, String StudentParentContact, String StudentCountry, 
            String StudentPassPortname, String PassPortPath,String StudentParentGuardian,String StudentPassword) {
        
        this.StudentID = StudentID;
        this.StudentFirstName = StudentFirstName;
        this.StudentLastName = StudentLastName;
        this.StudentGender = StudentGender;
        this.StudentAge = StudentAge;
        this.StudentClass = StudentClass;
        this.StudentAddress = StudentAddress;
        this.StudentParentContact = StudentParentContact;
        this.StudentCountry = StudentCountry;
        this.StudentPassPortname = StudentPassPortname;
        this.PassPortPath = PassPortPath;
        this.StudentParentGuardian = StudentParentGuardian;
        this.StudentPassword = StudentPassword;
    }

    public String getStudentParentGuardian() {
        return StudentParentGuardian;
    }

    public void setStudentParentGuardian(String StudentParentGuardian) {
        this.StudentParentGuardian = StudentParentGuardian;
    }      
   
    public String getStudentPassword() {
        return StudentPassword;
    }

    public void setStudentPassword(String StudentPassword) {
        this.StudentPassword = StudentPassword;
    }
    
  

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getStudentFirstName() {
        return StudentFirstName;
    }

    public void setStudentFirstName(String StudentFirstName) {
        this.StudentFirstName = StudentFirstName;
    }

    public String getStudentLastName() {
        return StudentLastName;
    }

    public void setStudentLastName(String StudentLastName) {
        this.StudentLastName = StudentLastName;
    }

    public String getStudentGender() {
        return StudentGender;
    }

    public void setStudentGender(String StudentGender) {
        this.StudentGender = StudentGender;
    }

    public String getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(String StudentAge) {
        this.StudentAge = StudentAge;
    }

    public String getStudentClass() {
        return StudentClass;
    }

    public void setStudentClass(String StudentClass) {
        this.StudentClass = StudentClass;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String StudentAddress) {
        this.StudentAddress = StudentAddress;
    }

    public String getStudentParentContact() {
        return StudentParentContact;
    }

    public void setStudentParentContact(String StudentParentContact) {
        this.StudentParentContact = StudentParentContact;
    }

    public String getStudentCountry() {
        return StudentCountry;
    }

    public void setStudentCountry(String StudentCountry) {
        this.StudentCountry = StudentCountry;
    }

    public String getStudentPassPortname() {
        return StudentPassPortname;
    }

    public void setStudentPassPortname(String StudentPassPortname) {
        this.StudentPassPortname = StudentPassPortname;
    }

    public String getPassPortPath() {
        return PassPortPath;
    }

    public void setPassPortPath(String PassPortPath) {
        this.PassPortPath = PassPortPath;
    }
    
    
    
    
}
