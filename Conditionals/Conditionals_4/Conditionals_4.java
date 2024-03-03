package Conditionals_4;

public class Conditionals_4 {
    public static void main(String[] args) {
        Character PParker = new Character("Peter", "Parker", "Enhanced Abilities");
        Character GStacy = new Character("Gwendolyne", "Stacy", "Enhanced Abilities");
        Character HBrown = new Character("Hobart", "Brown", "Enhanced Abilities");

        Character Extra1 = PParker;
        Character Extra2 = GStacy;
    
        
        //Problem one using ==:
        if(PParker == Extra1){
            System.out.println("Both Spideers are from the same universe");
        }
        else {
            System.out.println("Spideers are from a different universe");
        }
    
        //Problem one using .equals:
        if (PParker.equals(Extra1)) {
            System.out.println("Spideers are from the same universe");
        }
        else {
            System.out.println("Spideers are from a different universe");
        }
        
        //----------------------------------------------

        //Problem two using ==:
        if (HBrown == PParker) {
            System.out.println("Spideers are from the same universe");
        }
        else {
            System.out.println("Spideers are from a different universe");
        }
    
        //Problem two using .equals:
        if (HBrown.equals(PParker)) {
            System.out.println("Spideers are from the same universe");
        }
        else {
            System.out.println("Spideers are from a different universe");
        }
    
        //-----------------------------------------------
    
        //Problem three using ==:
        if (GStacy == PParker) {
            System.out.println("Spideers are from the same universe");
        }
        else {
            System.out.println("Spideers are from a different universe");
        }
    
        //Problem three using .equals
        if (GStacy.equals(PParker)) {
            System.out.println("Spideers are from the same universe");
        }
        else {
            System.out.println("Spideers are from a different universe");
        }
    }
    
    
}
