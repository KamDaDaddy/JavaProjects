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

    public void division(ABNums ab){
        System.out.println("Division: " + ab.getA() + " / " + ab.getB() + " = " + (ab.getA() / ab.getB()));
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

    public void squareRoot(ABNums num){
        System.out.println("Square Root: " + "√" + num.getA() + " = " + Math.sqrt(num.getA()) + " and " + "√" + num.getB() + " = " + Math.sqrt(num.getB()));
    }

    public void slope(XYPoints xy){
        int topFrac = (xy.getX2() - xy.getX1());
        int bottomFrac = (xy.getY2() - xy.getY1());

        System.out.println("Slope: " + topFrac + "         \n       ---\n       " + bottomFrac);
        System.out.println(" ");
    }

    public void midPoint(XYPoints xy){
        int midX = (xy.getX1() + xy.getX2()) / 2;
        int midY = (xy.getY1() + xy.getY2()) / 2;

        System.out.println("Midpoints: " + "(" + midX + ", " + midY + ")");
    }

}
