/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employees.*;
import Business.Enterprises.Enterprise;
import Business.Medical.MedicalHistory;
import Business.Network.Network;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.awt.Image;
import java.util.Date;

/**
 *
 * @author Rohit
 */
public class Patient extends UserAccount {
    
    private int id;
    private static int count = 1;
    private String profilePicture;
    private Image picture;
    
    private String fName;
    private String lastName;
    private String userName;
    private String password;
    private Date dob;
    private String insDetail;
    private String mobno;
    private String gender;
    private String insuredAmount;
    private String estEmi;
    private String[] checkBoxHealth;
    private String planType;
    private String actualEmi;

    public String getActualEmi() {
        return actualEmi;
    }

    public void setActualEmi(String actualEmi) {
        this.actualEmi = actualEmi;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }
    Network network;
    Enterprise insCompany;

    public Enterprise getInsCompany() {
        return insCompany;
    }

    public void setInsCompany(Enterprise insCompany) {
        this.insCompany = insCompany;
    }
    
    
    //    private String MedicalfileNumber;
    private static int totalPatients = 1;
    
    private Role role;
    private WorkQueue workQueue;
    private MedicalHistory medHist;
    
    
        public Patient()  {
        id = count;
        totalPatients  = count;
        count++;
        this.medHist = new MedicalHistory();

//        this.network = 
//        this.checkBoxHealth = new String[2];
    }
        
        
    
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEstEmi() {
        return estEmi;
    }

    public void setEstEmi(String estEmi) {
        this.estEmi = estEmi;
    }

    public String[] getCheckBoxHealth() {
        return checkBoxHealth;
    }

    public void setCheckBoxHealth(String[] checkBoxHealth) {
        this.checkBoxHealth = checkBoxHealth;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }



    public String getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(String insuredAmount) {
        this.insuredAmount = insuredAmount;
    }



    public MedicalHistory getMedHist() {
        return medHist;
    }

    public void setMedHist(MedicalHistory medHist) {
        this.medHist = medHist;
    }
    



    public int getId() {
        return id;
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

 

    public String getInsDetail() {
        return insDetail;
    }

    public void setInsDetail(String insDetail) {
        this.insDetail = insDetail;
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
        return fName+""+lastName;
    }
    
    
}
