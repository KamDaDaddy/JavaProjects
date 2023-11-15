package OverloadedConstructors;

public class TeamProgram {
    public static void main(String[] args, String name) {
        Team team1 = new Team("NYJets", "NYC");
        
        System.out.println("Class created with the properties" + team1.name + " and " + team1.homeState + ".");
        
        /*
        team1.name = "NYJets";
        team1.homeState = "NYC";
        String homeState;
        */
    }
}
