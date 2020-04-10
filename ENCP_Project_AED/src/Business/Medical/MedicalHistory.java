/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medical;

import Business.Customer.*;
import Business.Employees.*;
import java.util.ArrayList;




public class MedicalHistory {
    
    private String Patient;
    
    private ArrayList<MedicalReport> medReportDir;

    public MedicalHistory() {
        medReportDir = new ArrayList();
    }

    public ArrayList<MedicalReport> getmedReportDir() {
        return medReportDir;
    }
    
    public MedicalReport createMedReport(){
        MedicalReport medRep = new MedicalReport();
        medReportDir.add(medRep);
      
        return medRep;
    }
}