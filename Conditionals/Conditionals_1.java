package Conditionals;
import java.io.Console;
import java.util.Scanner;

public class Conditionals_1 {
    //Use scanner for numbers, console for string
        static int num1;
        static int correctNumber = 25;
        static int negatedNum;
        static String weekDay;
        static String password = "abc123";
        static String userEnter;
        
        
        //Problem 1
        public static void MathSigns(){
            if(num1 > 0){
                System.out.println("The number is positive.");
            }
            else if (num1 < 0) {
                System.out.println("The number is negative.");
            }
        
            else if (num1 == 0)
            {
                System.out.println("0 is neither a positive or negative!");
            }
        }
    
        //Problem 2
        public static void NumberHunt(){
            if(correctNumber > 25){
                System.out.println("More than Enough! Little less this time!");
            }
            else if(correctNumber < 25){
                System.out.println("You'll need a bit more...");
            }
            else if (correctNumber == 25){
                System.out.println("Exactly right!");
            }
        }

        //Problem 3
        public static void CursedTechniqueNumberNegation(){
            if(negatedNum > 0){
                System.out.println("Reverse technique: Number negation " + (-1) * negatedNum);
            }
            else if(negatedNum < 0){
                System.out.println("Reverse technique: Number Negation " + (-1) * negatedNum);
            }
            else if (negatedNum == 0){
                System.out.println("The sign of zero isn't affected by the cursed technique: Number Negation.");
            }
        }

        //Problem 4 & 5
        public static void WeekDays(){
            if(weekDay.equals("Monday")){
                System.out.println("This is the 1st day of the week.");
            }
            else if(weekDay.equals("Tuesday")){
                System.out.println("This is the 2nd day of the week.");
            }
            else if(weekDay.equals("Wednesday")){
                System.out.println("This is the 3rd day of the week.");
            }
            else if(weekDay.equals("Thursday")){
                System.out.println("This is the 4th day of the week.");
            }
            else if(weekDay.equals("Friday")){
                System.out.println("This is the 5th day of the week.");
            }
            else {
                System.out.println("Invalid Day, Please try again");
            }
        }
        
        //Problem 6
        public static void PasswordChecker(){
            if(password.length() >= 5){
                System.out.println("Your Code is Valid!");
            }
            else{
                System.out.println("Your Code is Invalid, Please Try Again.");
            }
        }
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Console con = System.console();
            if(con == null)
            {
                System.out.println("No console");
                return;
            }
            
            //Problem 1
            System.out.println("_1st Question_");
            System.out.print("Please enter a number: ");
                num1 = sc.nextInt();
                MathSigns();
            System.out.println(" ");
    
            //Problem 2
            System.out.println("_2nd Question_");
            System.out.print("Please enter a number: ");
                correctNumber = sc.nextInt();
                NumberHunt();
            System.out.println(" ");
        
            //Problem 3
            System.out.println("_3rd Question_");
            System.out.print("Enter the number you want to be negated: ");
                negatedNum = sc.nextInt();
                CursedTechniqueNumberNegation();
            System.out.println(" ");
    
            //Problem 4 & 5
            System.out.println("_4th Question");
                weekDay = con.readLine("Please enter a day of the week: ");
                WeekDays();
            System.out.println(" ");
    
            //Problem 6
            System.out.println("_6th Question_");
                userEnter = con.readLine("Please enter your code: ");
                PasswordChecker();
            System.out.println(" ");
    
    
    }


}


