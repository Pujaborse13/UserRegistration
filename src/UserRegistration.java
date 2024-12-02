import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration
{
    public static boolean isValidFirstName(String firstName)
    {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, firstName);
    }

    public static boolean isValidLastName(String lastName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, lastName);
    }



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Git User Registration System!");
        System.out.print("Enter your First Name: ");
        String firstName = scanner.nextLine();

        if (isValidFirstName(firstName)) {
            System.out.println("First Name is valid!");
        }

        else {
            System.out.println("Invalid First Name. Please ensure it starts with a capital letter and has at least 3 characters.");

        }


        System.out.print("Enter your Last Name: ");
        String lastName = scanner.nextLine();

        if (isValidLastName(lastName)) {
            System.out.println("Last Name is valid!");
        } else {
            System.out.println("Invalid Last Name. Please ensure it starts with a capital letter and has at least 3 characters.");
        }


    }
}