/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    private ArrayList<CustomerDoctorWorkRequest> custDoctorworkRequestList;
    
    private ArrayList<CustomerLabWorkRequest> custLabworkRequestList;

    public ArrayList<CustomerDoctorWorkRequest> getCustDoctorworkRequestList() {
        return custDoctorworkRequestList;
    }

    public void setCustDoctorworkRequestList(ArrayList<CustomerDoctorWorkRequest> custDoctorworkRequestList) {
        this.custDoctorworkRequestList = custDoctorworkRequestList;
    }
    public WorkQueue() {
        workRequestList = new ArrayList();
        custDoctorworkRequestList = new ArrayList();
        custLabworkRequestList  = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public CustomerDoctorWorkRequest createCustomerDoctorWorkRequest(){
        CustomerDoctorWorkRequest custDocReq = new CustomerDoctorWorkRequest(); 
        custDoctorworkRequestList.add(custDocReq);
        return custDocReq;
    }
    
    public CustomerLabWorkRequest createCustomerLabWorkRequest(){
        CustomerLabWorkRequest custLabReq = new CustomerLabWorkRequest(); 
        custLabworkRequestList.add(custLabReq);
        return custLabReq;
    }
}