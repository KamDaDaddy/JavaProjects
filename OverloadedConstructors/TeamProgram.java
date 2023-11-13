package OverloadedConstructors;

public class TeamProgram {
    public static void main(String[] args, String name) {
        Team team1 = new Team("NYJets", "NYC");
        team1.name = "NYJets";
        team1.homeState = "NYC";
        String homeState;
        System.out.println("Class created with the properties" + name + " and " + homeState + ".");
        
    }
}
