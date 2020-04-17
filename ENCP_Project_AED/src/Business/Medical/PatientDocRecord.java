/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medical;

import Business.Customer.*;
import Business.Employees.*;
import java.util.HashMap;


public class PatientDocRecord {
    
    private String patient;
    private String date;
    private int patientDocNumber;
    private String diagnosis;
    private String prescription;

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    
    
    private static int count = 1001;

    public PatientDocRecord() {
        patientDocNumber = count;
        count++;
    }

    

    //@Override
   // public String toString() {
   //     return name;
   // }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPatientDocNumber() {
        return patientDocNumber;
    }

    public void setPatientDocNumber(int patientDocNumber) {
        this.patientDocNumber = patientDocNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PatientDocRecord.count = count;
    }

   
     @Override
   public String toString() {
       return String.valueOf(patientDocNumber);
    }
    
}
