package MethodReturnTypes;

public class Run {
    public static void main(String[] args) 
    {
        Rectangle square = new Rectangle();
        
        System.out.println("Area of Rectangle: " + square.getArea());
        System.out.println("The Width of Rectangle: " + square.getWidth());
        System.out.println("The Height of the Rectangle: " + square.getHeight());
    
        square.getResize(30, 50);
        System.out.println("\nNew Area of Rectangle after resizing: " + square.getArea());
        
    }
}
