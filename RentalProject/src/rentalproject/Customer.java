/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalproject;

/**
 *
 * @author wezhou
 */
public class Customer {
    /**
     * declaring these fields
     */
    private String name;
    private int ID;
    private String address;
    private int CC;
    
    /**
     * constructor for Customer class
     * to initialize the fields
     * @param name
     * @param ID
     * @param address
     * @param CC 
     */
    public Customer(String name, int ID, String address, int CC){
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.CC = CC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }
    
    
}
