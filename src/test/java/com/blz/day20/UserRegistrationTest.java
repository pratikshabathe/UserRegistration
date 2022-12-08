package com.blz.day20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validFirstName("Pratikshs");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validFirstName("pratiksha");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validLastName("Bathe");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validLastName("bathe");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validEmail("abc@bl.in@.in");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validMobileNumber("91 9916519802");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validMobileNumber("919916519802");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule1("Patuu005");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule1("Patuu04");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule2("Patuu.05");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule2("Patuu.45");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule3("Patuu@105");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule3("Patuu@#$%");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule4("Patuu@55");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule4("Patu555");
        Assertions.assertFalse(result);
    }
}