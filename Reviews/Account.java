package Reviews;

public class Account {
    private String username;
    private String passwordString;

    //Initializes the citiAccount
    public Account(){
        System.out.println("The Object Has Been Initialized");
    }

    //Initializes the password string to the parameter
    public void setPassword(String password){
        this.passwordString = password;
    }

    //Returns the value of the password string
    public String getPassword(){
        return passwordString;
    }

    public String toString(){
        return ("Password is: " + passwordString);
    }
}
