import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String firstName = sc.nextLine();
        String regex = "^[A-Z]{1}[a-z]{3,}$";
        boolean result = firstName.matches(regex);
        if (result)
            System.out.println("First name is valid");
        else
            System.out.println("First name is Invalid");
    }
}
