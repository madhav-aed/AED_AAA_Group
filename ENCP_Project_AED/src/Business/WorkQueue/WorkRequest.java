/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Departments.Organization;
import Business.Enterprises.Enterprise;
import Business.Network.Network;
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
    
    private Network networkState;
    private Enterprise hospital;
    private Organization orgRequested;
    
     private String specialistType;
    private String WorkRequestType;
    
    private String  RefBy;

    public Network getNetworkState() {
        return networkState;
    }

    public void setNetworkState(Network networkState) {
        this.networkState = networkState;
    }

    public Enterprise getHospital() {
        return hospital;
    }

    public void setHospital(Enterprise hospital) {
        this.hospital = hospital;
    }

    public Organization getOrgRequested() {
        return orgRequested;
    }

    public void setOrgRequested(Organization orgRequested) {
        this.orgRequested = orgRequested;
    }

    public String getWorkRequestType() {
        return WorkRequestType;
    }

    public void setWorkRequestType(String WorkRequestType) {
        this.WorkRequestType = WorkRequestType;
    }

    public String getRefBy() {
        return RefBy;
    }

    public void setRefBy(String RefBy) {
        this.RefBy = RefBy;
    }
   

    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getSpecialistType() {
        return specialistType;
    }

    public void setSpecialistType(String specialistType) {
        this.specialistType = specialistType;
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
