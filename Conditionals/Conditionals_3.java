import java.io.Console;

public class Conditionals_3 {
    String cmd = "Yes";

    public static void main(String[] args) {
        Console userInput = System.console();
        if(userInput == null){
            System.out.println("No console");
            return;
        }
    
        System.out.println("Is the car silent when you turn the key?");
        Object cmd = userInput.readLine();
            if(cmd.equals("Yes")){
                System.out.print(" ");
                System.out.println("Are the battery terminals corroded?");
                cmd = userInput.readLine();

                if(cmd.equals("Yes")){
                    System.out.print(" ");
                    System.out.println("Clean terminals and try starting again.");
                }
            }
    
    
    
    
    
    }
}
