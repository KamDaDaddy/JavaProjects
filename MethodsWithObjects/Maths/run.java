package MethodsWithObjects.Maths;

public class run {
    public static void main(String[] args) {
        
        Formulas formula = new Formulas();
        ABNums ab = new ABNums(3, 4);
        XYPoints xy = new XYPoints(4, 7, 1, 3);
        
        formula.addition(ab);
        formula.substraction(ab);
        formula.division(ab);
        formula.multiply(ab);
        formula.squared(ab);
        formula.cubed(ab);
        formula.squareRoot(ab);
    
        formula.slope(xy);
        formula.midPoint(xy);
    
    
    }
    
}
