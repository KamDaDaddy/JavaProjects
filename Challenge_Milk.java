public class Challenge_Milk {
    public static void main(String[] args) {
        String lineDivider = "--------------------------------";

        for (int i = 99; i >= 0; i--){
            
            if (i == 1) {
                System.out.print(i + " bottle of milk on the wall, " + i + " bottle of milk. \nTake one down and pass it around, " + i + " bottle of milk on the wall.");
                System.out.println(" ");
                System.out.println(lineDivider);
                
            }
            else if (i == 0){
                System.out.print("No more bottles of milk on the wall, no more bottles of milk. \nGo to the store and buy some more, 99 bottles of milk on the wall.");
                System.out.println(" ");
            }
            else{
                System.out.print(i + " bottles of milk on the wall, " + i + " bottles of milk. \nTake one down and pass it around, " + i + " bottles of milk on the wall.");
                System.out.println(" ");
                System.out.println(lineDivider);
            }
    
        
    }
}
}
