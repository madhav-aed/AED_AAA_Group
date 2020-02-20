/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliners;

import java.util.HashMap;

/**
 *
 * @author rohit
 */
public class Seats {
    String dates;
    HashMap<Integer, Boolean> seatsAllocation;

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public HashMap<Integer, Boolean> getSeatsAllocation() {
        return seatsAllocation;
    }

    public void setSeatsAllocation(HashMap<Integer, Boolean> seatsAllocation) {
        this.seatsAllocation = seatsAllocation;
    }
    
    
    
    
    
    
    
}
