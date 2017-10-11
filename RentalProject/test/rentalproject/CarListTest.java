/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalproject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author wezhou
 */
public class CarListTest {
    
    public CarListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of findCar method, of class CarList.
     */
    @Test
    public static void testFindCar() {
        System.out.println("findCar");
        CarList instance = new CarList();
        int result = instance.findCar().getID();
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of findCar method, of class CarList.
     */
    @Test
    public static void testFindCar(int carID) {
        System.out.println("findCar");
        int ID = 1;
        CarList instance = new CarList();
        int result = instance.findCar(1).getID();
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAvail method, of class CarList.
     */
    @Test
    public static void testSetAvail() {
        System.out.println("setAvail");
        boolean tf = false;
        CarList instance = new CarList();
        Car currentCar = new Car("edgar", 999, 1, true);
        instance.setAvail(currentCar, tf);
        System.out.println(currentCar.isAvail());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public static void main(String args[]){
        testFindCar();
        testSetAvail();
    }
    
}
