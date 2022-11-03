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
        String regex3 = "^[A-Za-z0-9+_.-]+@(.+)$";
        boolean result3 = emailID.matches(regex3);
        if (result3) {
            System.out.println("Email ID is valid");
        }
        else {
            System.out.println("Email ID is Invalid");
        }
        System.out.println("Enter the Mobile number");
        String mobileNumber = sc.nextLine();
        String regex4 = "[91]{2} [0-9]{10}";
        boolean result4 = mobileNumber.matches(regex4);
        if (result4) System.out.println("Phone Number is valid");
        else System.out.println("Phone Number is Invalid");
    }
}
