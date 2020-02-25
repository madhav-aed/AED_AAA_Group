/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliners;

import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class Airplane {

    String name;
    String type;
    int noOfSeats;
    Flight flightDetails;
    ArrayList<AircraftFlights> flights;
    
    

    public Airplane() {

    }

    public Airplane(String name, String type, int noOfSeats) {
        this.name = name;
        this.type = type;
        this.noOfSeats = noOfSeats;
        this.flightDetails = new Flight();
        this.flights = new ArrayList<>();
        
    }

    public ArrayList<AircraftFlights> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<AircraftFlights> flights) {
        this.flights = flights;
    }
    
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Flight getFlightDetails() {
        return flightDetails;
    }

    public void setFlightDetails(Flight flightDetails) {
        this.flightDetails = flightDetails;
    }
    
    
        
    
    
    
    
    
    @Override
    public String toString() {
        return this.getName();
    }

    
    
    
}
