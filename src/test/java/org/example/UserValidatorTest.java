package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class UserValidatorTest {

    private final UserValidator validator = new UserValidator();


    @Test
    public void testInvalidFirstName() {
        Exception exception = assertThrows(InvalidFirstNameException.class, () ->
        {
            UserValidator.isValidFirstName("puja");
        });
        assertEquals("Invalid First Name: Must start with a capital letter and have at least 3 characters.", exception.getMessage());

    }


    @Test
    public void testInvalidLastName() {
        Exception exception = assertThrows(InvalidLastNameException.class, () -> {
            UserValidator.isValidLastName("borse");

        });

        assertEquals("Invalid Last Name: Must start with a capital letter and have at least 3 characters.", exception.getMessage());

    }


    @Test
    public void testInvalidEmail() {
        Exception exception = assertThrows(InvalidEmailException.class, () -> {
            UserValidator.isValidEmail("Inavalid mail");
        });
        assertEquals("Invalid Email: Must be in a valid format (e.g., user@example.com).", exception.getMessage());
    }


    @Test
    public void testInvalidMobile() {
        Exception exception = assertThrows(InvalidMobileException.class, () -> {
            UserValidator.isValidMobile("1234");
        });
        assertEquals("Invalid Mobile Number: Must be a 10-digit number.", exception.getMessage());
    }


    @Test
    public void testInvalidPassword() {
        Exception exception = assertThrows(InvalidPasswordException.class, () -> {
            UserValidator.isValidPassword("puja1123");
        });
        assertEquals("Invalid Password: Must have at least 8 characters, one uppercase letter, one digit, and one special character.", exception.getMessage());
    }




}


