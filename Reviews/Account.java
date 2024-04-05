package Reviews;

public class Account {
    private String username;
    private String passwordString;
    final int accountNumber;

    //Initializes the citiAccount
    public Account(){
        this.accountNumber = 0;
        System.out.println("The Object Has Been Initialized");
    }

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
        System.out.println("The Object Has Been Initialized");
    }
    
    public Account(int accountNumber, String user){
        this.accountNumber = accountNumber;
        this.username = user;
    }

    //Initializes the password string to the parameter
    public void setPassword(String password){
        this.passwordString = password;
    }

    //Returns the value of the password string
    public String getPassword(){
        return passwordString;
    }
    
    //Returns account number
    public int getAccountNum(){
        return accountNumber;
    }

    public String getUsername(){
        return username;
    }
    
    
    
    public String toString(){
        return ("The " + accountNumber + " is for " + username + " and the password is " + passwordString);
    }
    



}
