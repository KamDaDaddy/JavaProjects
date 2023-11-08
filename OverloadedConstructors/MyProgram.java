package OverloadedConstructors;

public class MyProgram {
    public static void main(String[] args) {
        Teacher pelzTeacher = new Teacher();
        pelzTeacher.name = "Mr. Pelzer";
        pelzTeacher.subject = "AP Computer Science A";
        pelzTeacher.floor = 3;
        pelzTeacher.room = 300;
    
            System.out.print(pelzTeacher.name + " teaches ");
            System.out.print(pelzTeacher.subject + " on the " + pelzTeacher.floor + "rd floor");
            System.out.print(" in room " + pelzTeacher.room + ".");
    
        Teacher shams = new Teacher();
        shams.name = "Mr. Shams";
        shams.subject = "Game Design";
        shams.floor = 3;
        shams.room = 300;
            System.out.println("   ");
            System.out.print(shams.name + " teaches ");
            System.out.print(shams.subject + " on the " + shams.floor + "rd floor");
            System.out.print(" in room " + shams.room + ".");
    
    }

}
