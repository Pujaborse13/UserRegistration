package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {


    @Test
    public void givenValidFirstName_HappyCase(){
        assertTrue(UserValidator.isValidFirstName("John"));
    }

    @Test
    public void givenInvalidFirstName_SadCase() {
        assertFalse(UserValidator.isValidFirstName("jo"));
        assertFalse(UserValidator.isValidFirstName("john"));
        assertFalse(UserValidator.isValidFirstName("J"));
    }


    @Test
    public void givenValidLastName_HappyCase() {
        assertTrue(UserValidator.isValidLastName("Doe"));
    }

    @Test
    public void givenInvalidLastName_SadCase() {
        assertFalse(UserValidator.isValidLastName("do"));
        assertFalse(UserValidator.isValidLastName("DOE"));
        assertFalse(UserValidator.isValidLastName("D"));
    }


    @Test
    public void givenValidEmail_HappyCase() {
        assertTrue(UserValidator.isValidEmail("abc.xyz@bl.co.in"));
        assertTrue(UserValidator.isValidEmail("abc@bl.co"));
    }

    @Test
    public void givenInvalidEmail_SadCase() {
        assertFalse(UserValidator.isValidEmail("abc@bl"));
        assertFalse(UserValidator.isValidEmail("abc.xyz@.com"));
        assertFalse(UserValidator.isValidEmail("abc.xyz@bl@co.in"));
    }


    @Test
    public void givenValidMobile_HappyCase() {
        assertTrue(UserValidator.isValidMobile("91 9919819801"));
    }

    @Test
    public void givenInvalidMobile_SadCase() {
        assertFalse(UserValidator.isValidMobile("919919819801"));
        assertFalse(UserValidator.isValidMobile("91-9919819801"));
        assertFalse(UserValidator.isValidMobile("91 99198"));
    }


    @Test
    public void givenValidPassword_HappyCase() {
        assertTrue(UserValidator.isValidPassword("Password1@"));
    }

    @Test
    public void givenInvalidPassword_SadCase() {
        assertFalse(UserValidator.isValidPassword("password1@"));
        assertFalse(UserValidator.isValidPassword("Password@"));
        assertFalse(UserValidator.isValidPassword("Password1"));
        assertFalse(UserValidator.isValidPassword("Pass1@"));
    }
}
