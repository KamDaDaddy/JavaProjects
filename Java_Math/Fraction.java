package Java_Math;

public class Fraction {
    private int numOnTop;
    private int numOnBottom;
    private float result;

    public Fraction(int numOnTop, int numOnBottom)
    {
        this.numOnTop = numOnTop;
        this.numOnBottom = numOnBottom;
        this.result = (float) numOnTop / (float) numOnBottom;
    }

    public void finalPrint(String message)
    {
        for (int i = 0; i <= message.length(); i++)
        {
            System.out.print("  ");

            System.out.println(" " + numOnTop);
            System.out.println(message + " - = " + result);
        }
    
        for (int i = 0; i <= message.length(); i++)
        {
            System.out.print(" ");

            System.out.println(" " + numOnBottom);
        }
    
    }


}
