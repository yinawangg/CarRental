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
import java.util.Date;

/**
 *
 * @author wezhou
 */
public class RentalListTest {

    public RentalListTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of findRental method, of class RentalList.
     */
    @Test
    public static void testFindRental() {
        System.out.println("findRental");
        int rentalID = 3;
        RentalList instance = new RentalList();
        Rental result = instance.findRental(rentalID);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createRental method, of class RentalList.
     */
    @Test
    public static int testCreateRental() {
        System.out.println("createRental");
        int custID = 12;
        int carID = 10;
        int payment = 720;
        RentalList instance = new RentalList();
        instance.createRental(custID, carID, payment);
        instance.createRental(1, 1, 1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println(instance.findRental(1210).getRentalID());
        return instance.findRental(11).getRentalID();
    }

    /**
     * Test of setDateIn method, of class RentalList.
     */
    @Test
    public static void testSetDateIn() {
        System.out.println("setDateIn");
        RentalList instance = new RentalList();
        instance.createRental(1, 1, 10);
        System.out.println(instance.findRental(11).getRentalID());
        instance.setDateIn(instance.findRental(11));
        System.out.println(instance.findRental(11).getDateIn());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDateOut method, of class RentalList.
     */
    @Test
    public static void testSetDateOut() {
        System.out.println("setDateOut");
        RentalList instance = new RentalList();
        instance.createRental(1, 1, 10);
        instance.setDateOut(instance.findRental(11));
        System.out.println(instance.findRental(11).getDateOut());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Pay method, of class RentalList.
     */
    @Test
    public static void testPay() {
        System.out.println("pay");
        Rental currentRental = new Rental(0, 0, 30, 40, true);
        currentRental.setDateIn(new Date(2017, 4, 22));
        currentRental.setDateOut(new Date(2017, 4, 23));
        RentalList instance = new RentalList();
        int expResult = 30 * 24;
        long result = instance.pay(currentRental);

        if (expResult == result) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println(instance.pay(currentRental));
        }
    }

    public static void main(String args[]) {
        testFindRental();
        testCreateRental();
        testPay();
        testSetDateIn();
        testSetDateOut();
    }

}
