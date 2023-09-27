import java.io.Console;

public class LongResponse {
    public static void main(String[] args) {
        //.readLine declaration
        Console cnsl = System.console();
    
    if(cnsl == null) {
        System.out.println("No console available");
        return;
    }

        //Actual conversation displayed in console
        System.out.println("Hi! My name is Eva");
            String str = cnsl.readLine("What's your name? ");
            System.out.println("Hi! " + str + ", Nice to meet you!");
        System.out.println("   ");
            String cStarter = cnsl.readLine("What's your favorite game? ");
        System.out.println("So " + cStarter + " huh.. well I have a small question for that if you don't mind");
        System.out.println(" ");
    
        //Second conversation displayed in console
        String vAQuote = "My territory, MY RULES!";
        
        System.out.println("What agent says this in " + cStarter);
            System.out.println(" ");
            System.out.print(vAQuote);
            System.out.println("   ");
            //gjkSystem.out.print("Hint: An operator from Valorant");
        String raString = cnsl.readLine("Your answer: ");
        System.out.println(raString + " says, " + vAQuote + " in Valorant! :D");

        Console icsl = System.console();
    if(icsl == null) {
        System.out.println("No number available");
        return;
    }

        
    /*This comment will not be deleted, for as it is a placemarker for my laptop coding process
        Remember to always save and push on github so that you can have the same code ![(BOZO)]!
    */
        
            
        
        
        




    }

    
}