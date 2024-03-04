package While_Loops;
import java.util.*;

public class Loop_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Problem 1
        int sum = 0;
        int counts = 0;
        double average;
        System.out.println("Enter your test scores. To find the average, enter -1 into the console.");

        int score = scanner.nextInt();
        while (score != -1) {
            sum += score;
            counts++;
        
            score = scanner.nextInt();
        }
    
        if(counts > 0){
            average = (double) sum / counts;
            System.out.println("Your average is: " + average);
        }
        else {
            System.out.println("No scores entered!");
        }
    //-----------------------------------------------------
        
        //Problem 2
        int num1;
        int num2;
        String userInput;
        
        System.out.println("Enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("Print even or odd: ");
        userInput = scanner.nextLine();

        if(userInput.equals("even")){
        
            if(num1 % 2 == 0){
                System.out.println(num1);
            }
    
            int current = num1 + (num1 % 2 == 0 ? 2 : 1);
        
            while (current < num2) {
            if(current % 2 == 0){
                System.out.print(current + " ");
            }
        
            current += 2;
            }
    
            if (num2 % 2 == 0) {
                System.out.print(num2);
            }
        }
        else if(userInput.equals("odd")){
            if (num1 % 2 == 1) {
                System.out.println(num1);
            }
        
            int current = num1 + (num1 % 2 == 0 ? 2 : 1);
        
            while (current < num2) {
            if(current % 2 == 0){
                System.out.print(current + " ");
            }
        
            current += 2;
            }
    
            if (num2 % 2 == 0) {
                System.out.print(num2);
            }
        
        
        }


    scanner.close();
    }

    

}
