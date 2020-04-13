/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.*;
import Business.Employees.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rohit
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList();
    }

    public ArrayList<Patient> getUserAccountList() {
        return patientList;
    }
    
    public Patient authenticateUser(String username, String password){
        for (Patient ua : patientList)
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    /*
    public UserAccount createUserAccount(String username, String password, Patient patient, Role role){
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(patient);
        userAccount.setRole(role);
        patientList.add(userAccount);
        return userAccount;
    } */
    
    
    
    public Patient createUserAccount(String username, String password, String name, Role role){
        Patient patient = new Patient();
        patient.setUserName(username);
        patient.setPassword(password);
        patient.setRole(role);
        patientList.add(patient);
        return patient;
    }
    
    
    
    public boolean checkIfUsernameIsUnique(String username){
        for (Patient ua : patientList){
            if (ua.getUserName().equals(username))
                return false;
        }
        return true;
    }
}
