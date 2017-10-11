/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalproject;

import java.util.ArrayList;

/**
 *
 * @author wezhou
 */
public class CarList {

    ArrayList<Car> listOfCar = new ArrayList<>();

    public CarList() {
        listOfCar.add(new Car("edgar", 2, 1, true));
        listOfCar.add(new Car("wen", 548, 2, false));
        listOfCar.add(new Car("trolls", 939, 10, true));
        listOfCar.add(new Car("edgar", 999, 1, true));
    }

    /**
     * method to find cars in the Car Class
     *
     * @param name
     * @return a Car, the first one that is available
     */
    public Car findCar() {
        for (int i = 0; i < listOfCar.size(); i++) {
            if (listOfCar.get(i).isAvail()) {
                return listOfCar.get(i);
            }
        }
        return null;
    }
    
    public Car findCar(int carID) {
        for (int i = 0; i < listOfCar.size(); i++) {
            if (listOfCar.get(i).getID()==carID) {
                return listOfCar.get(i);
            }
        }
        return null;
    }

    /**
     * method to set the availability of a car
     *
     * @param currentCar
     * @param tf
     */
    public void setAvail(Car currentCar, boolean tf) {
        currentCar.setAvail(tf);
    }

}
