/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author user
 */
public class AccountData {
    private String name;
    private String username;
    private String password;
    private String position;
    private String address;
    private String kin;
    private int contact;
    private String SQ;
    private Date dob;
    private Double salary;
    private boolean salaryinfo;
    private String email;
    private Image pics;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getKin() {
        return kin;
    }

    public void setKin(String kin) {
        this.kin = kin;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getSQ() {
        return SQ;
    }

    public void setSQ(String SQ) {
        this.SQ = SQ;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public boolean isSalaryinfo() {
        return salaryinfo;
    }

    public void setSalaryinfo(boolean salaryinfo) {
        this.salaryinfo = salaryinfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Image getPics() {
        return pics;
    }

    public void setPics(Image pics) {
        this.pics = pics;
    }
    
    
}
