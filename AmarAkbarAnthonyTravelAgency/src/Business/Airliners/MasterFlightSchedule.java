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
    private ArrayList<AircraftFlights> allFlights;
    
    public ArrayList<Airliner> getAllAirliners() {
        return allAirliners;
    }

    public void setAllAirliners(ArrayList<Airliner> allAirliners) {
        this.allAirliners = allAirliners;
    }

    public ArrayList<AircraftFlights> getAllFlights() {
        return allFlights;
    }

    public void setAllFlights(ArrayList<AircraftFlights> allFlights) {
        this.allFlights = allFlights;
    }

    
    
    
    public MasterFlightSchedule() {
        allAirliners = new ArrayList<>();
        allFlights = new ArrayList<>();
       // allAirplane = new ArrayList<>();

    }
    
    
    public boolean flightNumberExists(String flightNum){
    
        boolean result = false;
        if(!this.allFlights.isEmpty()){
            for(AircraftFlights flight: this.allFlights){
                if(flight.getFlightNumber().equalsIgnoreCase(flightNum)){
                    result = true;
                       break;}
                else{
                    result = false;

                }
            }
        }
        return result;
    }
    
    
    
    public void addAirliners(Airliner airliner){
        allAirliners.add(airliner);

    }    
    
    public void removeAirliners(Airliner airliner){
        allAirliners.remove(airliner);

    }    
    
    public void addFlights(AircraftFlights flight){
        allFlights.add(flight);

    }        
    
    public void removeFlights(AircraftFlights flight){
        allFlights.remove(flight);
    }     
    
   
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
}
