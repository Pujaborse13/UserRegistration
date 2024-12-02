import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration
{
    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9]+([._][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";
        return Pattern.matches(regex, email);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Git User Registration System!");

        System.out.print("Enter your Email Address: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Email is valid!");
        } else {
            System.out.println("Invalid Email. Please ensure it follows the format abc.xyz@bl.co.in with proper @ and . positions.");
        }

    }
}