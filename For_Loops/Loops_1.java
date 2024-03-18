package For_Loops;

public class Loops_1 {
    
    //Question 1
    
    public static void Numbers(){
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    
    
    public static void main(String[] args){

        //Question 1
        System.out.println("Question 1 \n Create a loop that counts from 1 to 10: ");
        Numbers();
        System.out.println(" ");

        //Question 2
        System.out.println("Question 2 \n Create a loop that counts from 50 to 30: ");
        for(int start = 50; start >= 30; start--){
            System.out.print(start + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        //Question 3
        System.out.println("Question 3 \n Create a loop that counts from 50 to 30 by 2's: ");
        for(int s = 50; s >= 30; s -= 2){
            System.out.print(s + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        //Question 4
        System.out.println("Question 4 \n Create a loop that counts from 1 to 100 but only prints numbers divisible by 5: ");
        for(int count = 5; count <= 100; count += 5){
            System.out.print(count + " ");
        }

    }

}   

