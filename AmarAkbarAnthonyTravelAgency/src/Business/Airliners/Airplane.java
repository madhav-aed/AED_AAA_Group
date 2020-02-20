/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliners;

/**
 *
 * @author rohit
 */
public class Airplane {

    String name;
    String type;
    int noOfSeats;
    Flight flightDetails;

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
        return "Airplane{" + "name=" + name + ", noOfSeats=" + noOfSeats + '}';
    }

    
    
    
}
