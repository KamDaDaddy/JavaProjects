public class Basic_Classes {
    String name = " ";
    int age;

    public Basic_Classes(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int ageDifference(Basic_Classes other)
    {
        return Math.abs(this.age - other.age);
    }
    public static void main(String[] args) {
        Basic_Classes jean = new Basic_Classes("Jean Black", 27);
        Basic_Classes logan = new Basic_Classes("Logan Ramirez", 40);

        System.out.println("The age difference between " + jean.getName() + " and " + logan.getName() + " is " + jean.ageDifference(logan) + " years.");
    }
}
