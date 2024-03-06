// package While_Loops;

public class Loop_3 {
    
    public static void Method1(int start, int end){
        
        while (start < end){
            System.out.println(end);

            end++;
        }
    }

    public static void main(String[] args) {
        int currentNum = 0;
        int endNum = 100;
        
         
        Method1(1, 5);
        // Method(200, 250);
        // Method(500, 550);
        
    /* 
        while (currentNum < endNum) {
            if (currentNum % 2 == 1) {
                System.out.println(currentNum + ", ");

                currentNum += 3;
            
                if(currentNum > 100){
                    break;
                }

            }
         
        }
    */




    
    }


}
