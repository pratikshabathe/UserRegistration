package com.blz.day20;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();
	 @Test
	    public void givenFirstName_WhenValid_ShouldReturnsTrue() {
	        try {
	            Assert.assertTrue(userRegistration.validFirstName("Pratiksha"));
	            System.out.println("First name is valid");
	        }catch (InvalidFirstNameException e) {
	            System.out.println("Invalid First Name because :- " + e);
	        }
	    }

	    @Test
	    public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
	        try {
	            Assert.assertTrue(userRegistration.validFirstName("Pratiksha"));
	            System.out.println("First name is valid");
	        }catch (InvalidFirstNameException e) {
	            System.out.println("Invalid First Name because :- " + e);
	        }
	    }

	    @Test
	    public void givenLastName_WhenValid_ShouldReturnsTrue() {
	        try {
	            Assert.assertTrue(userRegistration.validLastName("Bathe"));
	            System.out.println("Last name is valid");
	        }catch (InvalidLastNameException e) {
	            System.out.println("Invalid Last Name because :- " + e);
	        }
	    }

	    @Test
	    public void givenLastName_WhenInValid_ShouldReturnsFalse() {
	        try {
	            Assert.assertTrue(userRegistration.validLastName("Bathe"));
	            System.out.println("Last name is valid");
	        }catch (InvalidLastNameException e) {
	            System.out.println("Invalid Last Name because :- " + e);
	        }
	    }

	    @Test
	    public void givenEmail_WhenValid_ShouldReturnsTrue() {
	        try {
	            Assert.assertTrue(userRegistration.validEmail("abc.xyz@bl.co.in"));
	            System.out.println("Email is valid");
	        }catch (InvalidEmailException e) {
	            System.out.println("Invalid Email because :- " + e);
	        }
	    }



	    @Test
	    public void givenEmail_WhenInValid_ShouldReturnsFalse() {
	        try {
	            Assert.assertTrue(userRegistration.validEmail("abc@bl.in@.in"));
	            System.out.println("Email is valid");
	        }catch (InvalidEmailException e) {
	            System.out.println("Invalid Email because :- " + e);
	        }
	    }

	    @Test
	    public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
	        try {
	            Assert.assertTrue(userRegistration.validMobileNumber("91 9965328901"));
	            System.out.println("Mobile Number is valid");
	        }catch (InvalidMobileNumberException e) {
	            System.out.println("Invalid Mobile Number because :- " + e);
	        }
	    }

	    @Test
	    public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
	        try {
	            Assert.assertTrue(userRegistration.validMobileNumber("919965328901"));
	            System.out.println("Mobile Number is valid");
	        }catch (InvalidMobileNumberException e) {
	            System.out.println("Invalid Mobile Number because :- " + e);
	        }
	    }

	    @Test
	    public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
	        try {
	            Assert.assertTrue(userRegistration.validPasswordRule1("Patuu045"));
	            System.out.println("Password Rule1 is valid");
	        }catch (InvalidPsswordRule1Exception e) {
	            System.out.println("Invalid Password Rule1 because :- " + e);
	        }
	    }

	    @Test
	    public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
	        try {
	            Assert.assertTrue(userRegistration.validPasswordRule1("Patuu04"));
	            System.out.println("Password Rule1 is valid");
	        }catch (InvalidPsswordRule1Exception e) {
	            System.out.println("Invalid Password Rule1 because :- " + e);
	        }
	    }

	    @Test
	    public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
	        try {
	            Assert.assertTrue(userRegistration.validPasswordRule2("Patuu.05"));
	            System.out.println("Password Rule2 is valid");
	        }catch (InvalidPasswordRule2Exception e) {
	            System.out.println("Invalid Password Rule2 because :- " + e);
	        }
	    }

	    @Test
	    public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
	        try {
	            Assert.assertTrue(userRegistration.validPasswordRule2("Patuu.05"));
	            System.out.println("Password Rule2 is valid");
	        }catch (InvalidPasswordRule2Exception e) {
	            System.out.println("Invalid Password Rule2 because :- " + e);
	        }
	    }

}
