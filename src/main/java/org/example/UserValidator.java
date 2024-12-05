package org.example;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.regex.Pattern;

public class UserValidator {



    public static void isValidFirstName(String firstName) throws InvalidFirstNameException {
        if (!firstName.matches("^[A-Z][a-z]{2,}$")) {
            throw new InvalidFirstNameException("Invalid First Name: Must start with a capital letter and have at least 3 characters.");

        }
     }

        public static void isValidLastName (String lastName) throws InvalidLastNameException{
            if (!lastName.matches("^[A-Z][a-z]{2,}$")) {
                throw new InvalidLastNameException("Invalid Last Name: Must start with a capital letter and have at least 3 characters.");
            }

        }


        public static void isValidEmail (String email) throws InvalidEmailException {
            if (!email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
                throw new InvalidEmailException("Invalid Email: Must be in a valid format (e.g., user@example.com).");


            }

        }
            public static void isValidMobile (String mobile) throws InvalidMobileException {
                if (!mobile.matches("^\\d{10}$")) {
                    throw new InvalidMobileException("Invalid Mobile Number: Must be a 10-digit number.");
                }
            }

            public static void isValidPassword (String password) throws InvalidPasswordException {
                    if (!password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$")) {
                        throw new InvalidPasswordException("Invalid Password: Must have at least 8 characters, one uppercase letter, one digit, and one special character.");
                    }

                }
        }
