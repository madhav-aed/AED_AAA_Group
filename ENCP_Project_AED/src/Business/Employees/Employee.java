/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employees;

import Business.Departments.Organization;
import Business.Enterprises.Enterprise;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
    private String profilePicture;
    private Image picture;
    private Enterprise enterprise;
    private Organization org;
    

    public Employee() {
        id = count;
        count++;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
   
    public String getProfilePicture() {
        if(this.profilePicture == null)
                return "";
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }
 //   //Below variables added for new customer role
    private String userId;
    private String dob;
    private String insDetail;
    private String mobno;
    private String emerName;
    private String emerMobile;
    private String primDoc;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getInsDetail() {
        return insDetail;
    }

    public void setInsDetail(String insDetail) {
        this.insDetail = insDetail;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getEmerName() {
        return emerName;
    }

    public void setEmerName(String emerName) {
        this.emerName = emerName;
    }

    public String getEmerMobile() {
        return emerMobile;
    }

    public void setEmerMobile(String emerMobile) {
        this.emerMobile = emerMobile;
    }

    public String getPrimDoc() {
        return primDoc;
    }

    public void setPrimDoc(String primDoc) {
        this.primDoc = primDoc;
    }

   //below is included for doctors and lab techincian type. get/set speciality is used 
   //for both lab and doctor organization
    
    
    private String Speciality;

    public String getSpeciality() {
         return Speciality;
    }

    public void setSpeciality(Employee.DocLabType docType ) {
        this.Speciality = docType.getValue();
    }
    
    public enum DocLabType{
        
        PrimaryPhysician("Primary Physician"), 
        Cardiologist("Cardiologist"), 
        Rheumatologist("Rheumatologist"),
        Surgeon("General Surgeon"), 
        Psychiatrist("Psychiatrist"), 
        Dermatologist("Dermatologist"),        
        Neurologist("Neurologist"),
        
        LabTechnician("Lab Technician");
        
		
        
        private String value;
        private DocLabType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
		
		
		private static final List<String> VALUES;
		
		static {
        VALUES = new ArrayList<>();
        for (DocLabType docType : DocLabType.values()) {
            VALUES.add(docType.value);
			}
		}
		
		public static List<String> getValues() {
        return Collections.unmodifiableList(VALUES);
		}
    }
    
}
