package MethodsWithObjects.Maths;

public class run {
    public static void main(String[] args) {
        
        Formulas formula = new Formulas();
        ABNums ab = new ABNums(3, 4);
        
        formula.addition(ab);
        formula.substraction(ab);
        formula.multiply(ab);
        formula.squared(ab);
        formula.cubed(ab);
    
    
    
    
    }
    
}
