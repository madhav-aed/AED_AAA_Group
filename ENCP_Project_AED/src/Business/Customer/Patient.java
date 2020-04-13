/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employees.*;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.awt.Image;

/**
 *
 * @author Rohit
 */
public class Patient extends UserAccount {
    
    private String name;
    private int id;
    private static int count = 1;
    private String profilePicture;
    private Image picture;
    private String userName;
    private String password;
    private String dob;
    private String insDetail;
    private String mobno;
    private String emerName;
    private String emerMobile;
    private String primDoc;
    private static int totalPatients = 1;
    
    private Role role;
    private WorkQueue workQueue;
    
    

    public Patient()  {
        id = count;
        totalPatients  = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getInsDetail() {
        return insDetail;
    }

    public void setInsDetail(String insDetail) {
        this.insDetail = insDetail;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getEmerName() {
        return emerName;
    }

    public void setEmerName(String emerName) {
        this.emerName = emerName;
    }

    public String getEmerMobile() {
        return emerMobile;
    }

    public void setEmerMobile(String emerMobile) {
        this.emerMobile = emerMobile;
    }

    public String getPrimDoc() {
        return primDoc;
    }

    public void setPrimDoc(String primDoc) {
        this.primDoc = primDoc;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public static void setTotalPatients(int totalPatients) {
        Patient.totalPatients = totalPatients;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
