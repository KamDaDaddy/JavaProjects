package OverloadedConstructors.Part_2;

public class InDate {
    
	public String month;
    public int day;

    public InDate()
    {
        String month;
        int day;
        int year;
    }

    public void displayDate(int month, int day, int year)
    {
        System.out.println(month + "/" + day + "/" + year);
    }

}
