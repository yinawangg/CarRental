/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalproject;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author wezhou
 */
public class RentalList {

    private int PRICE = 30;

    ArrayList<Rental> listOfRental = new ArrayList<>();

    public RentalList() {
        Rental rental1 = new Rental(12, 1, 2, 3, false);
        Rental rental2 = new Rental(45, 4, 5, 6, false);
        Rental rental3 = new Rental(78, 7, 8, 9, false);
        Rental rental4 = new Rental(1011, 10, 11, 12, false);
        listOfRental.add(rental1);
        setDateOut(rental1);
        listOfRental.add(rental2);
        setDateOut(rental2);
        listOfRental.add(rental3);
        setDateOut(rental3);
        listOfRental.add(rental4);
        setDateOut(rental4);
    }

    /**
     * method to find rentals in the Rental Class
     *
     * @param rentalID
     * @return a Rental from 0 to car number
     */
    public Rental findRental(int rentalID) {

        for (int i = 0; i < listOfRental.size(); i++) {
            if (listOfRental.get(i).getRentalID() == rentalID) {
                return listOfRental.get(i);
            }
        }
        return null;

    }

    /**
     * creating a new rental
     *
     * @param custID
     * @param carID
     * @param payment
     */
    public int createRental(int custID, int carID, long payment) {
        int rentalID = Integer.parseInt(Integer.toString(custID)
                + Integer.toString(carID));
        Rental toAdd = new Rental(rentalID, custID, carID, payment, false);
        listOfRental.add(toAdd);
        return toAdd.getRentalID();
    }

    /**
     * setting the date the car is returned
     *
     * @param currentRental
     */
    public void setDateIn(Rental currentRental) {
        Date now = new Date();
        currentRental.setDateIn(now);
    }

    /**
     * setting the date the car is picked up
     *
     * @param currentRental
     */
    public void setDateOut(Rental currentRental) {
        Date now = new Date();
        currentRental.setDateOut(now);
    }

    /**
     * change the boolean for paymentDue
     *
     * @param currentRental
     * @return The price owed
     */
    public long pay(Rental currentRental) {
        currentRental.setPayDue(false);
        return PRICE
                * ((currentRental.getDateOut().getTime()
                - currentRental.getDateIn().getTime()) / 3600000);
    }

}
