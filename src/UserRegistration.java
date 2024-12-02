import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration
{
    public static boolean isValidMobileNumber(String mobile) {
        String regex = "^[0-9]{1,3}\\s[0-9]{10}$";
        return Pattern.matches(regex, mobile);

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Git User Registration System!");

        System.out.print("Enter your Mobile Number: ");
        String mobile = scanner.nextLine();

        if (isValidMobileNumber(mobile)) {
            System.out.println("Mobile Number is valid!");
        } else {
            System.out.println("Invalid Mobile Number. Please ensure it follows the format '91 9919819801' with a country code and 10 digits.");
        }


    }
}