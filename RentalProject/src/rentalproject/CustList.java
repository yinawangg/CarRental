/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalproject;

import java.util.ArrayList;

/**
 *
 * @author wezhou
 */
public class CustList {
    
    ArrayList<Customer> listOfCust = new ArrayList<>();
   
    /**
     * method to find customers in the Customer Class
     */
    public CustList(){
        listOfCust.add(new Customer("Yina", 1, "somewhere", 1));
        listOfCust.add(new Customer("Yin", 2, "somewhere", 1));
        listOfCust.add(new Customer("Yi", 3, "somewhere", 1));
        listOfCust.add(new Customer("Fang", 4, "somewhere", 1));
    }
    
     /**
     * method to find customers in the Customer Class
     * @param name
     * @return integer, custID
     */
    
    public int findCust(String name) {
     for(int i = 0; i<listOfCust.size(); i ++) {
         if (listOfCust.get(i).getName().equals(name)) {
             return listOfCust.get(i).getID();
         }
     }
     return -1;
    }
    
    /**
     * creating a new customer
     * @param name
     * @param ID
     * @param address
     * @param CC
     */
    public void createCust(String name, int ID, String address, int CC) {
        Customer toAdd = new Customer(name, ID, address, CC);
        listOfCust.add(toAdd);
        
    }
}
