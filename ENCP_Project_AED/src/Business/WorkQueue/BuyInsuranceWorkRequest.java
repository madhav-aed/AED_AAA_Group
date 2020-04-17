/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Patient;
import Business.Enterprises.Enterprise;

/**
 *
 * @author rohit
 */
public class BuyInsuranceWorkRequest extends WorkRequest {
     private String testResult;
     private Enterprise currentEnterprise;

    public Enterprise getCurrentEnterprise() {
        return currentEnterprise;
    }

    public void setCurrentEnterprise(Enterprise currentEnterprise) {
        this.currentEnterprise = currentEnterprise;
    }

    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public void setTypeOfInsurance(String typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }
     private String typeOfInsurance;
     private float premiums;

    public float getPremiums() {
        return premiums;
    }

    public void setPremiums(float premiums) {
        this.premiums = premiums;
    }

    public String getVitals() {
        return vitals;
    }

    public void setVitals(String vitals) {
        this.vitals = vitals;
    }
     private Patient patient;
     // Below needs to be changed, file number
     private String vitals;
     

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }


   
}
