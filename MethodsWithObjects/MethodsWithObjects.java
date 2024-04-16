package MethodsWithObjects;

import MethodsWithObjects.Car.XYCords;

public class MethodsWithObjects {
    //Declare a class called Car
    //Make it contain properties like String make and model
    //Create a constructor that initializes using parameters of make and model

    public static void main(String[] args) {
        Car Honda = new Car("Civic", "2019");
        Car.checkMake(Honda);
        Car.checkModel(Honda);
        System.out.println(" ");
    
        XYCords cords1 = new XYCords(6, 12);
        XYCords.displayXY(cords1);
    
    }

}
