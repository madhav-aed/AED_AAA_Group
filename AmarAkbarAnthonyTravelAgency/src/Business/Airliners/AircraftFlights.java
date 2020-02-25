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
public class AircraftFlights {
    String flightNumber; // Needs to be unique
    String originCity;
    String destinationCity;
//    Date dateFlight;
    Double price;
    ArrayList<FlightDates> flightDates = null;

    public AircraftFlights() {
        
    }

    public AircraftFlights(String flightNumber, String originCity, String destinationCity, Double price, FlightDates flightDate) {
        this.flightNumber = flightNumber;
        this.originCity = originCity;
        this.destinationCity = destinationCity;
        if(this.flightDates == null)
            this.flightDates = new ArrayList<>();
                    
        this.price = price;
        this.flightDates.add(flightDate);
    }

    public void setFlightSchedule(String flightNumber, String originCity, String destinationCity, Double price, FlightDates flightDate) {
        this.flightNumber = flightNumber;
        this.originCity = originCity;
        this.destinationCity = destinationCity;
        this.price = price;
        this.flightDates.add(flightDate);
    }

    
    
    
    
    @Override
    public String toString() {
        return this.flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public ArrayList<FlightDates> getFlightDates() {
        return flightDates;
    }

    public void setFlightDates(ArrayList<FlightDates> flightDates) {
        this.flightDates = flightDates;
    }
    
   
    

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }



    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
   
    
}
