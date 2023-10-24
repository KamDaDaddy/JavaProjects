//import java.io.Console;
public class BookClass {
    static String title = "To Kill a Mockingbird";
    static String author = "Harper Lee";
    static int ISBN = 978006093;
    static int price = 30;

    public BookClass(String string, String string2, int i, int p) {
    }

    public void Book(String title, String author, int ISBN, int price)
    {
        BookClass.title = title;
        BookClass.author = author;
        BookClass.ISBN = ISBN;
        BookClass.price = price;
    }

    public static String getTitle()
    {
        return title;
    }

    public static String getAuthor()
    {
        return author;
    }

    public static int getPrice()
    {
        return price;
    }

    public static int getISBN()
    {
        return ISBN;
    }

    public static String getConsole()
    {
        return "The ISBN is " + ISBN + ". The price is $" + price + ". The author of " + title + " is " + author;
    }

public class Main 
{
    public static void main(String[] args)
    {
        //BookClass wompBookClass = new BookClass("To Kill a Mockingbird", "Harper Lee", 978006093, 30);
    
        System.out.println(BookClass.getConsole());
    
    }
}

}
