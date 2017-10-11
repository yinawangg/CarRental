/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalproject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wezhou
 */
public class AgentTest {
    
    public AgentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reserveCar method, of class Agent.
     */
    @Test
    public static void testReserveCar() {
        CarList carList = new CarList();
        CustList custList = new CustList();
        RentalList rentalList = new RentalList();
        System.out.println("reserveCar");
        String custName = "Yina";
        Agent instance = new Agent(rentalList, custList, carList);
        instance.reserveCar(custName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pickUpCar method, of class Agent.
     */
    @Test
    public static void testPickUpCar() {
        CarList carList = new CarList();
        CustList custList = new CustList();
        RentalList rentalList = new RentalList();
        System.out.println("pickUpCar");
        int currRentalID = 12;
        Agent instance = new Agent(rentalList, custList, carList);
        instance.pickUpCar(currRentalID);
        Rental currRental = instance.getRentalList().findRental(currRentalID);
        System.out.println("Rental date in: " + currRental.getDateIn());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnCar method, of class Agent.
     */
    @Test
    public static void testReturnCar() {
        CarList carList = new CarList();
        CustList custList = new CustList();
        RentalList rentalList = new RentalList();
        System.out.println("returnCar");
        int currRentalID = 12;
        Agent instance = new Agent(rentalList, custList, carList);
        instance.returnCar(currRentalID);
        Rental currRental = instance.getRentalList().findRental(currRentalID);
        int currCarID = currRental.getCarID();
        Car currCar = instance.getCarList().findCar(currCarID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public static void main (String args[]){
        testReserveCar();
        testPickUpCar();
        testReturnCar();
    }
    
}
