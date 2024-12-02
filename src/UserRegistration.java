import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration
{
    public static boolean isValidFirstName(String firstName)
    {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, firstName);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Git User Registration System!");
        System.out.print("Enter your First Name: ");
        String firstName = scanner.nextLine();

        if (isValidFirstName(firstName)) {
            System.out.println("First Name is valid!");
        } else {
            System.out.println("Invalid First Name. Please ensure it starts with a capital letter and has at least 3 characters.");
        }

        scanner.close();
    }
}