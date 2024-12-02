import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration
{
    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[A-Z]).{8,}$";

        return Pattern.matches(regex, password);


    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Git User Registration System!");

        System.out.print("Enter your Password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Invalid Password. Please ensure it has a minimum of 8 characters.");
        }


    }
}