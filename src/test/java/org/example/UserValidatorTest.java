package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


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


    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "Abc+100@gmail.com"
    })
    void testValidEmails(String email) {
        assertTrue(UserValidator.isValidEmail(email), "Email should be valid: " + email);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a"
    })
    void testInvalidEmails(String email) {
        assertFalse(UserValidator.isValidEmail(email), "Email should be invalid: " + email);
    }
    }





