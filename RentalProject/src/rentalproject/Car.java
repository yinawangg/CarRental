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
public class Car {
    /**
     * declaring these fields
     */
    private String name;
    private int ID;
    private int price;
    private boolean avail;
    
    /**
     * constructor for Car so initializing fields
     * @param name
     * @param ID
     * @param price
     * @param avail 
     */
    public Car(String name, int ID, int price, boolean avail){
        this.name = name;
        this.ID = ID;
        this.price = price;
        this.avail = avail;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvail() {
        return avail;
    }

    public void setAvail(boolean avail) {
        this.avail = avail;
    }
    
    
}
