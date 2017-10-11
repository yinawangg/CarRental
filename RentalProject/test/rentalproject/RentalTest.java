/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalproject;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wezhou
 */
public class RentalTest {
    
    public RentalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getRentalID method, of class Rental.
     */
    @Test
    public void testGetRentalID() {
        System.out.println("getRentalID");
        Rental instance = null;
        int expResult = 0;
        int result = instance.getRentalID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRentalID method, of class Rental.
     */
    @Test
    public void testSetRentalID() {
        System.out.println("setRentalID");
        int rentalID = 0;
        Rental instance = null;
        instance.setRentalID(rentalID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustID method, of class Rental.
     */
    @Test
    public void testGetCustID() {
        System.out.println("getCustID");
        Rental instance = null;
        int expResult = 0;
        int result = instance.getCustID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustID method, of class Rental.
     */
    @Test
    public void testSetCustID() {
        System.out.println("setCustID");
        int custID = 0;
        Rental instance = null;
        instance.setCustID(custID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarID method, of class Rental.
     */
    @Test
    public void testGetCarID() {
        System.out.println("getCarID");
        Rental instance = null;
        int expResult = 0;
        int result = instance.getCarID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarID method, of class Rental.
     */
    @Test
    public void testSetCarID() {
        System.out.println("setCarID");
        int carID = 0;
        Rental instance = null;
        instance.setCarID(carID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateIn method, of class Rental.
     */
    @Test
    public void testGetDateIn() {
        System.out.println("getDateIn");
        Rental instance = null;
        Date expResult = null;
        Date result = instance.getDateIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateIn method, of class Rental.
     */
    @Test
    public void testSetDateIn() {
        System.out.println("setDateIn");
        Date dateIn = null;
        Rental instance = null;
        instance.setDateIn(dateIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateOut method, of class Rental.
     */
    @Test
    public void testGetDateOut() {
        System.out.println("getDateOut");
        Rental instance = null;
        Date expResult = null;
        Date result = instance.getDateOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateOut method, of class Rental.
     */
    @Test
    public void testSetDateOut() {
        System.out.println("setDateOut");
        Date dateOut = null;
        Rental instance = null;
        instance.setDateOut(dateOut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPayment method, of class Rental.
     */
    @Test
    public void testGetPayment() {
        System.out.println("getPayment");
        Rental instance = null;
        int expResult = 0;
        long result = instance.getPayment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPayment method, of class Rental.
     */
    @Test
    public void testSetPayment() {
        System.out.println("setPayment");
        long payment = 0;
        Rental instance = null;
        instance.setPayment(payment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPayDue method, of class Rental.
     */
    @Test
    public void testIsPayDue() {
        System.out.println("isPayDue");
        Rental instance = null;
        boolean expResult = false;
        boolean result = instance.isPayDue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPayDue method, of class Rental.
     */
    @Test
    public void testSetPayDue() {
        System.out.println("setPayDue");
        boolean payDue = false;
        Rental instance = null;
        instance.setPayDue(payDue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
