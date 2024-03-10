package While_Loops;

public class Loop_3 {
    
    public static void Method1(int start, int end){
        
        while (start <= end){
            System.out.print(start + " ");
            System.out.println(" ");
            start++;
        }
    }

    public static void division(){
        int i = 0;
        
        while (i <= 100) {
            /*
            They all work individually but definitely not together lol!
            I separated them by comments so that you could take them out one by one and test every snipet of code,
            individually.
            */
            
            /*
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
            */
            
            /*
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
            */
            
            /*
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
            */
            
            
        
            i++;
        }
    }

    
    
    public static void main(String[] args) {
        //These are also commented because they're long af
        //Comment these when you run the second program :)

        
        Method1(1, 5);
        System.out.println("----------------------");
        Method1(200, 250);
        System.out.println("----------------------");
        Method1(500, 550);
        System.out.println("----------------------");
        
    
        division();




    
    }


}
