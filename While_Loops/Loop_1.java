package While_Loops;
import java.util.Scanner;

public class Loop_1 {
    public static void Asterisks(){
        int asterisks = 1;

        while (asterisks <= 9){
            System.out.print("* ");
            asterisks++;
        }
        System.out.println();
    }
    
    
    //Problem 2 & 5
    public static void SumCalculator(){
        int sum = 0;
        int num1 = 1;

        while (num1 <= 20){
            sum += num1;
            if(num1 == 1){
                System.out.println("0 + " + num1 +  " = " + sum);
            }
            else {
                System.out.println((sum - num1) + " + " + num1 + " = " + sum);
            }
        
            num1++;
        }
    }
    
    //Problem 3
    public static void NumberLadder(){
        int start = 50;
        int end = 20;

        while (start >= end){
            System.out.println(start);
            start--;
        }
    
        System.out.println();
    }

    //Problem 4
    public static void Multiply(){
        int term1 = 12;
        int term2 = 15;
        
        int result;

        while (term1 >= 0){
            result = term1 * term2;
            System.out.println(term1 + " x " + term2 + " = " + result);
            term2--;

            if(term2 < 0){
                break;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Problem two and five
        System.out.println("Problem two and five sums");
        SumCalculator();
        System.out.println();

        //Problem three
        System.out.println("Problem three Number Ladder!");
        NumberLadder();
        System.out.println();

        //Problem four
        System.out.println("Problem four multiplying!");
        Multiply();
        System.out.println();
        
    
    
    
    }

    

}
