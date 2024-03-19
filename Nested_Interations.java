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
        for(int stair = 0; stair < 7; stair++){
            System.out.println("");

            for(int asterisks = 7; asterisks >= 1; asterisks--){
                System.out.print("*");
            
            }
            
        }
    
    
    
    }
}
