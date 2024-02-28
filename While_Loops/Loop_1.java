package While_Loops;
import java.util.Scanner;

public class Loop_1 {
    static int num1;
    static int num2;
    
    public static void Asterisks(){
        int asterisks = 1;

        while (asterisks <= 9){
            System.out.print("* ");
            asterisks++;
        }
        System.out.println();
    }
    
    
    //Problem 2
     public static void SumCalculator(){
        int sum = 0;
        int userNum = 1;
        while (userNum <= 20){
            sum += userNum;
            userNum++;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Problem two
        System.out.println("Enter a number: ");
        num1 = sc.nextInt();
        System.out.println("Enter a second number: ");
        num2 = sc.nextInt();

        SumCalculator();

        
        
        
    
    
    
    
    }

    

}
