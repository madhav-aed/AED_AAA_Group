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
public class Airliner {
    String airlineName;
    String airlineCode;
    Fleet fleet;

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }


    public Airliner(String airlineName, String airlineCode) {
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.fleet = new Fleet();
    }

    @Override
    public String toString() {
        return this.getAirlineName();
    }
    

    
    
    
    
    
    
}
