package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class UserValidatorTest {

    private final UserValidator validator = new UserValidator();


    @Test
    public void givenValidDetails_ShouldPassValidation() {
        Assertions.assertDoesNotThrow(() -> validator.validateUserDetails(
                "John", "Doe", "john.doe@example.com", "9876543210", "Password@123"));
    }

    @Test
    public void givenInvalidFirstName_ShouldThrowException() {
        Exception exception = Assertions.assertThrows(InvalidFirstNameException.class, () ->
                validator.validateUserDetails("jo", "Doe", "john.doe@example.com", "9876543210", "Password@123"));
        Assertions.assertEquals("Invalid First Name: Must start with a capital letter and have at least 3 characters.", exception.getMessage());
    }

    @Test
    public void givenInvalidEmail_ShouldThrowException() {
        Exception exception = Assertions.assertThrows(InvalidEmailException.class, () ->
                validator.validateUserDetails("John", "Doe", "invalid-email", "9876543210", "Password@123"));
        Assertions.assertEquals("Invalid Email: Must be in a valid format (e.g., user@example.com).", exception.getMessage());
    }

    @Test
    public void givenInvalidMobile_ShouldThrowException() {
        Exception exception = Assertions.assertThrows(InvalidMobileException.class, () ->
                validator.validateUserDetails("John", "Doe", "john.doe@example.com", "12345", "Password@123"));
        Assertions.assertEquals("Invalid Mobile Number: Must be a 10-digit number.", exception.getMessage());
    }

    @Test
    public void givenInvalidPassword_ShouldThrowException() {
        Exception exception = Assertions.assertThrows(InvalidPasswordException.class, () ->
                validator.validateUserDetails("John", "Doe", "john.doe@example.com", "9876543210", "password"));
        Assertions.assertEquals("Invalid Password: Must have at least 8 characters, one uppercase letter, one digit, and one special character.", exception.getMessage());
    }
}





