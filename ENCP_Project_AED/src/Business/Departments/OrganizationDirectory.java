/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Departments;

import Business.Departments.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new Hospital_Doctor_Department();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new Hospital_LabTest_Department();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InsuranceManager.getValue())){
            organization = new Insurance_Management_Department();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Claims.getValue())){
            organization = new Insurance_Claims_Department();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Sales.getValue())){
            organization = new Insurance_Sales_Department();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DoctorAssistant.getValue())){
            organization = new Hospital_DoctorAssistant_Department();
            organizationList.add(organization);
        }
        return organization;
    }
}