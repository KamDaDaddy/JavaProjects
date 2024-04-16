package MethodsWithObjects.Maths;

public class Formulas {
    public Formulas(){
        System.out.println("Formula Initialized\n--------------------\n\n");
    }

    public void addition(ABNums ab){
        System.out.println("Addition: " + ab.getA() + " + " + ab.getB() + " = " + (ab.getA() + ab.getB()));
    }

    public void substraction(ABNums ab){
        System.out.println("Substraction: " + ab.getA() + " - " + ab.getB() + " = " + (ab.getA() - ab.getB()));
    }

    public void multiply(ABNums ab){
        System.out.println("Multiply: " + ab.getA() + " x " + ab.getB() + " = " + (ab.getA() * ab.getB()));
    }

    public void squared(ABNums ab){
        System.out.println("Squared: " + ab.getA() + "^2 = " + (ab.getA() * ab.getA()) + " and " + ab.getB() + "^2 = " + (ab.getB() * ab.getB()));
    }

    public void cubed(ABNums ab){
        System.out.println("Cubed: " + ab.getA() + "^3 = " + (ab.getA() * ab.getA() * ab.getA()) + " and " + ab.getB() + "^3 = " + (ab.getB() * ab.getB() * ab.getB()));
    }


}
