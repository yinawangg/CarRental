/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalproject;

import java.util.Scanner;

/**
 *
 * @author wezhou
 */
public class Agent {
    
    private RentalList rentalList;
    private CustList custList;
    private CarList carList;
    
    public Agent(RentalList rentalList, CustList custList, CarList carList) {
        this.rentalList = rentalList;
        this.custList = custList;
        this.carList = carList;
    }
    
   public void reserveCar(String custName){
       int currentCustID = custList.findCust(custName);
       if (currentCustID == -1){
           System.out.println("Please enter your address");
           Scanner sc1 = new Scanner (System.in);
           String adr = sc1.nextLine();
           System.out.println("Please enter your credit card number");
           Scanner sc2 = new Scanner (System.in);
           int CC = sc2.nextInt();
           int newCustID = custList.listOfCust.size()+1;
           custList.createCust(custName, newCustID, adr, CC);
           currentCustID = newCustID;
       }
       System.out.println("Your customer ID is: " + currentCustID);
       Car currCar = carList.findCar();
       currCar.setAvail(false);
       int rentalID = rentalList.createRental(currentCustID,
               currCar.getID(),
               currCar.getPrice());
       System.out.println("Your rental ID is: " + rentalID);    
   }
   
   
   
   public void pickUpCar(int currRentalID){
       Rental currRental = rentalList.findRental(currRentalID);
       rentalList.setDateOut(currRental);
       System.out.println("Your car has been picked up");
       System.out.println("Drive safely :^)");
   }
   
   public void returnCar(int currRentalID){
       Rental currRental = rentalList.findRental(currRentalID);
       rentalList.setDateIn(currRental);
       currRental.setPayDue(true);
       long payDue = rentalList.pay(currRental);
       int currCarID = currRental.getCarID();
       Car currCar = carList.findCar(currCarID);
       System.out.println("You owe " + payDue + " dollars");
       System.out.println("Thank your for your patronage");
       System.out.println("Have a nice day ;)");
       currCar.setAvail(true);  
   }

    public RentalList getRentalList() {
        return rentalList;
    }

    public void setRentalList(RentalList rentalList) {
        this.rentalList = rentalList;
    }

    public CustList getCustList() {
        return custList;
    }

    public void setCustList(CustList custList) {
        this.custList = custList;
    }

    public CarList getCarList() {
        return carList;
    }

    public void setCarList(CarList carList) {
        this.carList = carList;
    }
    

   
}
