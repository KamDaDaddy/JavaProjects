package MethodsWithObjects;

public class Car {
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    
    
    public static void displayXY(XYCords cords){
        System.out.println(cords.x + ", " + cords.y);
    }
    
    
    
    //Methods
    public static void checkModel(Car car){
        System.out.println("The model of the car is " + car.model);
    }

    public static void checkMake(Car car){
        System.out.println("The make of the car is " + car.make);
    }

}

public class XYCords {
        int x;
        int y;

        public XYCords(int x, int y){
            this.x = x;
            this.y = y;
        }
    }