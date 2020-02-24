/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliners;

import Business.TravelOffice.MainTravelAgency;
import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class MasterFlightSchedule {
    
    private ArrayList<Airliner> allAirliners;
    private ArrayList<Flight> allFlights;
    private ArrayList<Airplane> allAirplane;
    
    
    
    public MasterFlightSchedule() {
        allAirliners = new ArrayList<>();
        allFlights = new ArrayList<>();
        allAirplane = new ArrayList<>();

    }
    
    
    public boolean flightNumberExists(String flightNum){
    
        for(Flight flight: this.allFlights){
            if(flight.flightNumber.equals(flightNum))
                return true;
        }        
        return false;
    }
    
    
    
    public void addAirliners(Airliner airliner){
        allAirliners.add(airliner);

    }    
    
    public void removeAirliners(Airliner airliner){
        allAirliners.remove(airliner);

    }    
    
    public void addFlights(Flight flight){
        allFlights.add(flight);

    }        
    
    public void removeFlights(Flight flight){
        allFlights.remove(flight);
    }     
    
    
    public void addAeroplane(Airplane airplane){
        allAirplane.add(airplane);

    }        
    
    public void removeAeroplane(Airplane airplane){
        allAirplane.remove(airplane);
    }     
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
}
