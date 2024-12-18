package org.example;

public class UserValidator {

    private static final String VALID_NAME = "^[A-Z][a-z]{2,}$";
    private static final String VALID_EMAIL = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    private static final String VALID_MOBILE_NO = "^[0-9]{10}$";
    private static final String VALID_PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$";


    Validator<String> isValidFirstName = firstName -> firstName.matches(VALID_NAME);
    Validator<String> isValidLastName = lastName -> lastName.matches(VALID_NAME);
    Validator<String> isValidEmail = email -> email.matches(VALID_EMAIL);
    Validator<String> isValidMobile = mobile -> mobile.matches(UserValidator.VALID_MOBILE_NO);
    Validator<String> isValidPassword = password -> password.matches(UserValidator.VALID_PASSWORD);


        public void validateUserDetails(String firstName, String lastName, String email, String mobile, String password) {

            if (!isValidFirstName.validate(firstName)) {
                throw new InvalidFirstNameException("Invalid First Name: Must start with a capital letter and have at least 3 characters.");
            }
            if (!isValidLastName.validate(lastName)) {
                throw new InvalidLastNameException("Invalid Last Name: Must start with a capital letter and have at least 3 characters.");
            }
            if (!isValidEmail.validate(email)) {
                throw new InvalidEmailException("Invalid Email: Must be in a valid format (e.g., user@example.com).");
            }
            if (!isValidMobile.validate(mobile)) {
                throw new InvalidMobileException("Invalid Mobile Number: Must be a 10-digit number.");
            }
            if (!isValidPassword.validate(password)) {
                throw new InvalidPasswordException("Invalid Password: Must have at least 8 characters, one uppercase letter, one digit, and one special character.");
            }
        }

    }
