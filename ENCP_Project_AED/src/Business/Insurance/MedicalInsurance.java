/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

import Business.Medical.*;
import Business.Customer.*;
import Business.Departments.Organization;
import Business.Employees.*;
import java.util.ArrayList;




public class MedicalInsurance {
    
    private String Patient;
    private String startDate;
    private String endDate;
    
    private Organization org;

    public String getPatient() {
        return Patient;
    }

    public void setPatient(String Patient) {
        this.Patient = Patient;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public int getInsuranceNumber() {
        return InsuranceNumber;
    }

    public void setInsuranceNumber(int InsuranceNumber) {
        this.InsuranceNumber = InsuranceNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MedicalInsurance.count = count;
    }
    
    private int InsuranceNumber;
    
    
    private static int count = 100001;

    public MedicalInsurance (){
        InsuranceNumber = count;
        count++;
    }
 
 

   

}