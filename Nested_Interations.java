public class Nested_Interations {
    public static void main(String[] args) {
        
        //A. 
        /*
        for(int line = 0; line < 4; line++){
            System.out.println(" ");
            
            for(int star = 0; star <= 10; star++){
                System.out.print("*");
            }
        }
        */
    
        //B. 
        String asterisks = "*******";

        
        
        for(int stair = 0; stair < 7; stair++){
            System.out.println("");

            for(int n = 7; n >= 1; n--){
                System.out.print(asterisks.substring(1));
            }
        }
    
    
    
    }
}
