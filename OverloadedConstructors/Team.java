package OverloadedConstructors;

public class Team {
    private String owner;
    String name;
    String homeState;
    Boolean activeStatus;

    public Team(String n, String homeS) {
        name = n;
        homeState = homeS;
        System.out.println("Debug.Log :)");
    }

    public Team(String n, String homeS, boolean aS)
    {
        name = n;
        homeState = homeS;
        activeStatus = aS;
    }

}
