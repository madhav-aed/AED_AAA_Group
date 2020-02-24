/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelOffice;

import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class Customer {
    String firstName;
    String lastName;
    String age;
    String gender;
    int contactNumber;
    String email;
    ArrayList<Reservations> reservationsAList;
    
    public Customer(){
    
    this.reservationsAList = new ArrayList<>();}
    
   
    

    public ArrayList<Reservations> getReservationsAList() {
        return reservationsAList;
    }
    
    
    public void addReservation(String seat, String origin, String destination, String date, String time, String flightNo, String airLineName){
        Reservations rs = new Reservations(seat,origin,destination,date,time,flightNo,airLineName);
        this.reservationsAList.add(rs);
    }
    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    @Override
    public String toString() {
        return firstName;
    }
}
