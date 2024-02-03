package Conditionals;

public class Conditionals_2 {
    public static String status;

    public static String checkAgeForPermit(int age){
        if(age <= 13){
            return "Invalid";
        }
        else if(age >= 16){
            return "Valid";
        }
        else {
            return "Some other status";
        }
    }

    public static String checkAgeAndSalaryForLoan(int age, double salary){
        if(age < 18 && salary < 39000){
            return "Invalid (age and salary do not fulfill the requirements)";
        }
        else if(age < 18 && salary >= 39000){
            return "Pending (age does not fufill the requirement)";
        }
        else if(age >= 18 && salary < 39000){
            return "Pending (salary does not fufill the requirement)";
        }
        else {
            return "Valid (age and salary requirements met)";
        }
    }

    public static void main(String[] args) {
        int age = 13;
        status = checkAgeForPermit(age);
        System.out.println("User is " + status);

        age = 16;
        status = checkAgeForPermit(age);
        System.out.println("User is " + status);

        age = 17;
        double salary = 36000;
        status = checkAgeAndSalaryForLoan(age, salary);
        System.out.println("User is " + status + " for loan.");

        age = 18;
        salary = 42000;
        status = checkAgeAndSalaryForLoan(age, salary);
        System.out.println("User is " + status + " for loan.");
    }
    
}

