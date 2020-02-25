/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelOffice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rohit
 */
public class CustomerDirectory {
    
    ArrayList<Customer> customers;

    public CustomerDirectory() {
        this.customers = new ArrayList<Customer>();
    }
    
    
    public Customer addCustomer(Customer customer){
        customers.add(customer);
        return customer;
    }
    
    
        public void deleteProduct(Customer customer){
        customers.remove(customer);
    }
    
    public Customer searchAccount(String name){
        for(Customer customer : this.customers){
            if(customer.getName().equalsIgnoreCase(name)){
                return customer;
            }
        }
        return null;
    }
    
    
     
    public List<String> getCustomersName(){
        
        ArrayList<String> arr = new ArrayList<>();
            for(int i = 0; i < customers.size(); i++)
            {
                arr.add(customers.get(i).getName());
            }

        return arr;
    }
  
        
    
    
    
    
    
    
    
    
    
    

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    
    
    
    
}
