package Java_Math;

public class JavaMath 
{
    public static void main(String[] args) {

        int a = 5;
        int b = 2;
        int c = 3;
        String aLetter = "a";
        String bLetter = "b";
        double result = 29.0;
        
        int x1 = b * b;
        int y1 = a + b;
        int x2 = x1 + c;
        int y2 = -y1 + -y1;
        String xLetter = "x";
        String yLetter = "y";

        //Numero uno
        System.out.println("1. " + Math.pow(b, Math.abs(b)));

        //Numero dos
        System.out.println("2. " + Math.pow(a, 2) + " + " + Math.pow(b, 2) + " = " + result);

        //Numero tres
        System.out.println("3. " + "|-2 * (12 * 2)^3 + 5|" + " = " + Math.abs(-2 * Math.pow((12 * 3), 3) + a));

        //Numero cuatro
        System.out.print("4. " + "|x - 3|" + " = " + 0.8);
        System.out.print(" \n    ----- \n      5");
    
        //Numero cinco
        System.out.println(" ");
        System.out.println("5. " + "The square root of a^2 and b^2 is " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));

        //Numero seis
        System.out.print("6. " + "y2 - y1" + " equals " + (y2 - y1) / (x2 - x1));
        System.out.print(" \n   ------- \n   x2 - x1");

        //Numero siete
        System.out.println(" ");
        System.out.print("7. " + "The Quadratic formula of radical(-b^2 - 4(a)(c)) is: " + Math.sqrt(-(Math.pow(b, 2)) - 4 * (a) * (c)) / 2 * (a));
        System.out.print(" \n                                    -------------- \n                                          2a");
    
        //I don't know what NaN is and I don't know if it's correct or not!!
    }
}