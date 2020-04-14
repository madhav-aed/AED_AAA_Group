/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Patient;

/**
 *
 * @author rohit
 */
public class BuyInsuranceWorkRequest extends WorkRequest {
     private String testResult;
     private String currentEnterprise;
     private String typeOfInsurance;
     private float premiums;
     private Patient patient;
     // Below needs to be changed, file number
     private String vitals;
     

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getCurrentEnterprise() {
        return currentEnterprise;
    }

    public void setCurrentEnterprise(String currentEnterprise) {
        this.currentEnterprise = currentEnterprise;
    }
   
}
