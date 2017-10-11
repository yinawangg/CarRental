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
public class CarRentalApp {
    
    public static void main (String args[]){
        CarList carList = new CarList();
        CustList custList = new CustList();
        RentalList rentalList = new RentalList();
        Agent ourAgent = new Agent(rentalList, custList, carList);
    System.out.println("Welcome to the car rental agency");
    System.out.println("Type 1 to reserve a car, 2 to pick up a car, " +
            "3 to return a car, 4 to exit");
    Scanner sc = new Scanner(System.in);
    int numEntered = sc.nextInt();
    while (numEntered != 4){
    switch (numEntered) {
        case 1: 
            System.out.println("Please enter your name");
            Scanner nm = new Scanner(System.in);
            String custName = nm.nextLine();
            ourAgent.reserveCar(custName);
            break;
            
        case 2:
            System.out.println("Please enter your rental ID");
            Scanner rid = new Scanner(System.in);
            int currRentalID = rid.nextInt();
            ourAgent.pickUpCar(currRentalID);
            break;
            
        case 3:
            System.out.println("Please enter your rental ID");
            Scanner rid2 = new Scanner(System.in);
            int rentalID = rid2.nextInt();
            ourAgent.returnCar(rentalID);
            break;
            
        default: break;
    }
    System.out.println("Type 1 to reserve a car, 2 to pick up a car, " +
            "3 to return a car, 4 to exit");
    Scanner scNew = new Scanner(System.in);
    numEntered = scNew.nextInt();
    }
    }
    
}
