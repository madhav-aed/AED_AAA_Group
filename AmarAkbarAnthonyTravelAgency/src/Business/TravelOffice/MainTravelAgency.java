/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelOffice;

import Business.Airliners.Airliner;
import Business.Airliners.MasterFlightSchedule;
import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class MainTravelAgency {
    ArrayList<Airliner> airliners;
    MasterFlightSchedule masterFlightSchedule;
    CustomerDirectory customers;
    
    public MainTravelAgency() {
        this.airliners = new ArrayList<>();
        this.masterFlightSchedule = new MasterFlightSchedule();
        this.customers = new CustomerDirectory();
        
    }
    
    public void addAirliner(Airliner airliner){
        airliners.add(airliner);
    
    }

    public CustomerDirectory getCustomers() {
        return customers;
    }

    public void setCustomers(CustomerDirectory customers) {
        this.customers = customers;
    }

    
    
    
    
    public ArrayList<Airliner> getAirliners() {
        return airliners;
    }

    public void setAirliners(ArrayList<Airliner> airliners) {
        this.airliners = airliners;
    }

    public MasterFlightSchedule getMasterFlightSchedule() {
        return masterFlightSchedule;
    }

    public void setMasterFlightSchedule(MasterFlightSchedule masterFlightSchedule) {
        this.masterFlightSchedule = masterFlightSchedule;
    }
    
    
    
    public ArrayList<Airliner> searchAirliners(String name){
        ArrayList<Airliner> arr = new ArrayList<>();
        
        for(Airliner airliner : this.getAirliners()){
            if(airliner.getAirlineName().equalsIgnoreCase(name))
                arr.add(airliner);
            if(airliner.getAirlineCode().equalsIgnoreCase(name))
                arr.add(airliner);
        }
        return arr;
    }    
    
    
    public Boolean airlineNameExists(String name){
        for(Airliner airliner  : this.getAirliners()){
            if(airliner.getAirlineName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
        
    public Boolean airlineCodeExists(String name){
        for(Airliner airliner  : this.getAirliners()){
            if(airliner.getAirlineCode().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }  
    
        
    public void deleteAirline(Airliner name){
        airliners.remove(name);
        
        
    } 

    
    
    
    
}
