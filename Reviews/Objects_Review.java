package Reviews;

public class Objects_Review {
    public static void main(String[] args) {
        //Initializes the user account
        Account citiAccount = new Account();
        System.out.println(citiAccount.toString());

        Account chaseAccount = new Account(57823489);
        System.out.println(chaseAccount.toString());


        Account tdAccount = new Account(57823489, "studentAccount");
        System.out.println(tdAccount.toString());
    
    
    }
}
