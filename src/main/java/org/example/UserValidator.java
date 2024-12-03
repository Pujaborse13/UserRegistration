package org.example;
import java.util.regex.Pattern;

public class UserValidator {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$";;

    public static boolean isValidFirstName(String firstName) {
        String regex = "^[A-Z][a-z]{2,}$";
        return Pattern.matches(regex, firstName);
    }

    public static boolean isValidLastName(String lastName) {
        String regex = "^[A-Z][a-z]{2,}$";
        return Pattern.matches(regex, lastName);
    }


    public static boolean isValidEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }

    public static boolean isValidMobile(String mobile) {
        String regex = "^[0-9]{1,3} [0-9]{10}$";
        return Pattern.matches(regex, mobile);
    }

    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>])[a-zA-Z0-9!@#$%^&*(),.?\":{}|<>]{8,}$";
        return Pattern.matches(regex, password);
    }




}
