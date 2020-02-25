/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelOffice;

import Business.Airliners.Seats;

/**
 *
 * @author rohit
 */
public class Reservations {
   // private Seats seat;
   // private Customer customer;
    private String seat;
    private String origin;
    private String destination;
    private String date;
    private String time;
    private String flightNo;
    private String airLineName;

    public Reservations(String seat, String origin, String destination, String date, String time, String flightNo, String airLineName) {
        this.seat = seat;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.flightNo = flightNo;
        this.airLineName = airLineName;
    }

    
    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getAirLineName() {
        return airLineName;
    }

    public void setAirLineName(String airLineName) {
        this.airLineName = airLineName;
    }
    
    
    @Override
    public String toString() {
        return airLineName;
    }
    
    
  
}
