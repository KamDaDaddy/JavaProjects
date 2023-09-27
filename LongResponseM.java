import java.io.Console;

public class LongResponseM {
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
            System.out.println("Hi! " + str);
            System.out.print("Nice to meet you!");
        System.out.println("   ");
            String cStarter = cnsl.readLine("What's your favorite game? ");
        System.out.println("So " + cStarter + " huh.. well I have a small question for that if you don't mind");

    //Second conversation declaration
        Console sncl = System.console();
    
    if(sncl == null) {
        System.out.println("No console");
        return;
    }
        String vAQuote = "My territory, MY RULES!";
        //Second conversation displayed in console
        System.out.println("What agent says this in " + cStarter + "?");
            System.out.print(vAQuote);
            System.out.print("   ");
            //gjkSystem.out.print("Hint: An operator from Valorant");
        String raString = sncl.readLine("Your answer: ");
        System.out.println(raString + " says, " + vAQuote + " in Valorant! :D");
        
        
        
            
        
        
        




    }
}
