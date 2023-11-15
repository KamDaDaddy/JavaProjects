package OverloadedConstructors.Part_2;
//import java.io.Console;

public class InTime {

    public InTime()
    {
        //silly emptyness
        int hour;
        int minute;
        int seconds;
    }
    
    public void displayTime(int hour, int minute, int seconds)
    {
        System.out.println(hour + ":" + minute + "::" + seconds);
    }

    public static void main(String[] args) {
        
        System.out.println("Debug.Log could never do this :D");
    }
}
