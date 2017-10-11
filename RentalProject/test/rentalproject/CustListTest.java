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
public class CustListTest {
    
    public CustListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of findCust method, of class CustList.
     */
    @Test
    public static void testFindCust() {
        System.out.println("findCust");
        String name = "Fang";
        CustList instance = new CustList();
        int result = instance.findCust(name);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createCust method, of class CustList.
     */
    @Test
    public static void testCreateCust() {
        System.out.println("createCust");
        String name = "George";
        int ID = 696969;
        String address = "compsci lab";
        int CC = 420;
        CustList instance = new CustList();
        instance.createCust(name, ID, address, CC);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println(instance.findCust("George"));
    }
    
    public static void main(String args[]) {
        testFindCust();
        testCreateCust();
    }
    
}
