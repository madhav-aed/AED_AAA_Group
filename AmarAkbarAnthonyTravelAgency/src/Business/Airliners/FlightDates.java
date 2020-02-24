/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliners;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author rohit
 */
public class FlightDates {
    Date dates;
    float flightTime;
    HashMap<Integer, Boolean> seatsAllocation;

    public FlightDates(Date dates, float flightTime, int numberOfSeats) {
        this.dates = dates;
        this.flightTime = flightTime;
        this.seatsAllocation = new HashMap<>(numberOfSeats);
    }
    
    public float getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(float flightTime) {
        this.flightTime = flightTime;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public HashMap<Integer, Boolean> getSeatsAllocation() {
        return seatsAllocation;
    }

    public void setSeatsAllocation(HashMap<Integer, Boolean> seatsAllocation) {
        this.seatsAllocation = seatsAllocation;
    }

    @Override
    public String toString() {
        return (""+this.getDates()).substring(0,10);
    }
    
    
    
    
    
    
    
}
