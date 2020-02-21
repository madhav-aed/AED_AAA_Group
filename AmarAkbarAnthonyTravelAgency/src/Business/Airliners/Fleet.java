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
public class Fleet {
    
    ArrayList<Airplane> airplanes;

    public Fleet() {
        
        this.airplanes = new ArrayList<>();
    }
    
    

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }
    
    public void addAirplane(Airplane airplane){
        airplanes.add(airplane);
    
    }
    
 
    public ArrayList<Airplane> searchPlanes(String name){
        ArrayList<Airplane> arr = new ArrayList<>();
        if(!(this.getAirplanes().isEmpty()))
        {
            for(Airplane airplane : this.getAirplanes()){
                if(airplane.getType().equalsIgnoreCase(name))
                    arr.add(airplane);
                if(airplane.getName().equalsIgnoreCase(name))
                    arr.add(airplane);
            }
        }   
        return arr;
    }    
    
    
    public Boolean airplaneNameExists(String name){
        for(Airplane airplane  : this.getAirplanes()){
            if(airplane.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    
}
