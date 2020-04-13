/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprises.Enterprise;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(String appointmentType) {
        this.appointmentType = appointmentType;
    }

    public String getSpecialistType() {
        return specialistType;
    }

    public void setSpecialistType(String specialistType) {
        this.specialistType = specialistType;
    }

    public String getNetworkState() {
        return networkState;
    }

    public void setNetworkState(String networkState) {
        this.networkState = networkState;
    }

    public String getEnterpriseHospital() {
        return enterpriseHospital;
    }

    public void setEnterpriseHospital(String enterpriseHospital) {
        this.enterpriseHospital = enterpriseHospital;
    }

    public String getOrgRequested() {
        return orgRequested;
    }

    public void setOrgRequested(String orgRequested) {
        this.orgRequested = orgRequested;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getInsDetail() {
        return insDetail;
    }

    public void setInsDetail(String insDetail) {
        this.insDetail = insDetail;
    }

    public int getPatientEmpId() {
        return patientEmpId;
    }

    public void setPatientEmpId(int patientEmpId) {
        this.patientEmpId = patientEmpId;
    }
    
    
    private Enterprise enterprise;
    private String patient;
    private String  RefBy;
    private String doctor;
    private String WorkRequestType;
    
    private String appointmentType;
    private String specialistType;
    
    private String networkState;
    private String enterpriseHospital;
    private String orgRequested;
    private String userName;
    private String insDetail;
    private int patientEmpId;

    
   
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}
