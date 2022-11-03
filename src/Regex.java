import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String firstName = sc.nextLine();
        String regex1 = "^[A-Z]{1}[a-z]{3,}$";
        boolean result1 = firstName.matches(regex1);
        if (result1) {
            System.out.println("First name is valid");
        }
        else {
            System.out.println("First name is Invalid");
        }
        System.out.println("Enter the Last Name");
        String lastName = sc.nextLine();
        String regex2 = "^[A-Z]{1}[a-z]{2,}$";
        boolean result2 = lastName.matches(regex2);
        if (result2) {
            System.out.println("Last name is valid");
        }
        else {
            System.out.println("Last name is Invalid");
        }
        System.out.println("Enter the Email ID");
        String emailID = sc.nextLine();
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        boolean result = emailID.matches(regex);
        if (result)
            System.out.println("Email ID is valid");
        else
            System.out.println("Email ID is Invalid");
    }
}
