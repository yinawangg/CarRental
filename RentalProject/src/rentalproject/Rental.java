/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalproject;

import java.util.Date;

/**
 *
 * @author wezhou
 */
public class Rental {
    /**
     * declaring these fields
     */
    private int custID;
    private int carID;
    private Date dateIn;
    private Date dateOut;
    private long payment;
    private boolean payDue;
    private int rentalID;
    
    
    /**
     * constructor for the Rental class
     * initializing the fields 
     * @param custID
     * @param carID
     * @param payment
     * @param payDue 
     */
    public Rental(int rentalID, int custID, int carID, long payment, boolean payDue){
        this.rentalID = rentalID;
        this.custID = custID;
        this.carID = carID;
        this.payment = payment;
        this.payDue = payDue;
        Date dateOut;
        Date dateIn;
        
    }

    /**
     * @return the rentalID
     */
    public int getRentalID() {
        return rentalID;
    }

    /**
     * @param rentalID the rentalID to set
     */
    public void setRentalID(int rentalID) {
        this.rentalID = rentalID;
    }

    /**
     * @return the custID
     */
    public int getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(int custID) {
        this.custID = custID;
    }

    /**
     * @return the carID
     */
    public int getCarID() {
        return carID;
    }

    /**
     * @param carID the carID to set
     */
    public void setCarID(int carID) {
        this.carID = carID;
    }

    /**
     * @return the dateIn
     */
    public Date getDateIn() {
        return dateIn;
    }

    /**
     * @param dateIn the dateIn to set
     */
    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    /**
     * @return the dateOut
     */
    public Date getDateOut() {
        return dateOut;
    }

    /**
     * @param dateOut the dateOut to set
     */
    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    /**
     * @return the payment
     */
    public long getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(long payment) {
        this.payment = payment;
    }

    /**
     * @return the payDue
     */
    public boolean isPayDue() {
        return payDue;
    }

    /**
     * @param payDue the payDue to set
     */
    public void setPayDue(boolean payDue) {
        this.payDue = payDue;
    }
    
    
    
}
