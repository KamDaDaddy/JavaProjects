import java.io.Console;
import java.util.Scanner;

public class LongResponse {
    public static void main(String[] args) {
    //.readLine declaration
    Console cnsl = System.console();
    
    if(cnsl == null) {
        System.out.println("No console available");
        return;
    }

    //Actual conversation displayed in console
    //1st problem answer
        System.out.println("Hi! My name is Eva");
            String str = cnsl.readLine("What's your name? ");
        System.out.println("   ");
        System.out.println("Hi! " + str);
        System.out.print("Nice to meet you!");
        System.out.println("   ");
            String cStarter = cnsl.readLine("What's your favorite game? ");
        System.out.println("So " + cStarter + " huh.. well I have a small question for that if you don't mind");

    //Second conversation declaration
    //2nd problem answer
    Console sncl = System.console();
    
    if(sncl == null) {
        System.out.println("No console");
        return;
    }
            String vAQuote = "My territory, MY RULES!";
    //Second conversation displayed in console
        System.out.println("What agent says this in " + cStarter);
        System.out.print(vAQuote);
        System.out.print("   ");
            String raString = sncl.readLine("Your answer: ");
        System.out.print("   ");
        System.out.println(raString + " says, " + vAQuote + " in Valorant! :D");
        System.out.println("   ");
        
    //3rd problem answer
        System.out.println("Let's make a sentence!");
        System.out.print("Enter a noun: ");
            String noun = cnsl.readLine("");
        System.out.print("Enter a verb: ");
            String verb = cnsl.readLine("");
        System.out.print("Enter an adverb: ");
            String adverb = cnsl.readLine("");
    //Final sentence
        System.out.println("Is your sentence right? " + noun +" "+ verb +" "+ adverb + " ..on sundays?! Outrageous.");
        System.out.println("   ");


    //4th problem answer
    Scanner nInput = new Scanner(System.in);

        System.out.println("Fancy some math?");
        System.out.print("What's your first number? ");
            int firstNumber = nInput.nextInt();
        System.out.print("What's your second number? ");
            int secondNumber = nInput.nextInt();
        System.out.println("   ");
        System.out.println("Here's some math for ya'!");

    //Variable declaration
            int nSum = firstNumber + secondNumber;
            int nSub = firstNumber - secondNumber;
            int nMultiply = firstNumber * secondNumber;
            int nDivide = firstNumber / secondNumber;
            int nPerc = firstNumber % secondNumber;
            
        System.out.println(firstNumber + " + " + secondNumber + " = " + nSum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + nSub);
        System.out.println(firstNumber + " x " + secondNumber + " = " + nMultiply);
        System.out.println(firstNumber + " / " + secondNumber + " = " + nDivide);
        System.out.println(firstNumber + " % " + secondNumber + " = " + nPerc);
        System.out.println("   ");


    //5th problem answer
        System.out.print("What is your current age? ");
            int currentAge = nInput.nextInt();
        System.out.print("At what age would you love to retire? ");
            int retireAge = nInput.nextInt();
            int yearsLeft = 2023 + retireAge;
        System.out.println("   ");

        System.out.println("It's 2023, so you can retire in " + yearsLeft + "!");
        System.out.println("Waiting til "+ yearsLeft + "to retire is such a long time!");
        System.out.println("   ");


    //6th problem answer
    //User input checklist
            String nameOfBuilding = cnsl.readLine("Building Name? ");
            String favoritePerson = cnsl.readLine("Who are you sending this to? ");
            String buildingAddress = cnsl.readLine("Shipping Address? ");
            String cityBL = cnsl.readLine("City? ");
            String stateBL = cnsl.readLine("State? ");
            String buildingZC = cnsl.readLine("Zip code? ");
        System.out.println("  ");

    //Shipping address output
        System.out.println("Shipping Address");
        System.out.println(nameOfBuilding);
        System.out.println("For " + favoritePerson);
        System.out.println(buildingAddress);
            System.out.println(cityBL + ", " + stateBL + " " + buildingZC);

    nInput.close();
    
    }

/*This comment will not be deleted, for as it is a placemarker for my laptop coding process
        Remember to always save and push on github so that you can have the same code ![(BOZO)]!
    */


}