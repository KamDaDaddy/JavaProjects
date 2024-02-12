import java.io.Console;

public class Conditionals_3 {
    String yesCmd = "yes";
    String yCmd = "y";
    String nocmd = "no";
    String nCmd = "n";

    public static void main(String[] args) {
        Console userInput = System.console();
        if(userInput == null){
            System.out.println("No console");
            return;
        }
    
        System.out.print("Is the car silent when you turn the key? ");
        Object cmd = userInput.readLine();
            if(cmd.equals("yes") || cmd.equals("y")){
                System.out.print(" ");
                System.out.print("Are the battery terminals corroded? ");
                cmd = userInput.readLine();

                if(cmd.equals("yes") || cmd.equals("y")){
                    System.out.print(" ");
                    System.out.println("Clean terminals and try starting again.");
                }
            
                if(cmd.equals("no") || cmd.equals("n")){
                    System.out.print(" ");
                    System.out.println("Replace cables and try again.");
                }
            
            }
            else if(cmd.equals("no") || cmd.equals("n")){
                System.out.print(" ");
                System.out.print("Does the car make a clicking noise? ");
                cmd = userInput.readLine();
                
                if(cmd.equals("yes") || cmd.equals("y")){
                    System.out.print(" ");
                    System.out.println("Replace the battery.");
                }
                else if(cmd.equals("no") || cmd.equals("n")){
                    System.out.print(" ");
                    System.out.print("Does the car crank up but fail to start? ");
                    cmd = userInput.readLine();

                    if(cmd.equals("yes") || cmd.equals("y")){
                        System.out.print(" ");
                        System.out.print("Check spark plug connections.");
                    }
                    
                    else if(cmd.equals("no") || cmd.equals("n")){
                        System.out.print(" ");
                        System.out.print("Does the engine start and then die? ");
                        cmd = userInput.readLine();

                        if(cmd.equals("yes") || cmd.equals("y")){
                            System.out.print(" ");
                            System.out.print("Does your car have fuel injection? ");
                            cmd = userInput.readLine();

                            if(cmd.equals("no") || cmd.equals("n")){
                                System.out.print(" ");
                                System.out.print("Check to ensure the choke is opening and closing.");
                            }
                            else if(cmd.equals("yes") || cmd.equals("y")){
                                System.out.print(" ");
                                System.out.print("Get it in for service.");
                            }
                        }
                    }
                
                }
            
            
            
            }
            
            
    
    
    
    
    
    }
}
