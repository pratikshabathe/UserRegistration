package com.blz.day20;

import com.blz.day20.UserValidationException.ExceptionType;

public class UserValidation {
	  UserRegistration usrReg = new UserRegistration();

	  public IUserEntryValidator validateName = (String userInput) -> {
	    try {
	      if (userInput.length() == 0)
	        throw new UserValidationException(ExceptionType.IS_EMPTY, "name cannot be empty. enter a valid name.");
	      return usrReg.validFirstName(userInput);
	    } catch (NullPointerException e) {
	      throw new UserValidationException(ExceptionType.IS_NULL, "name cannot be null. enter a valid name.");
	    }
	  };

	  public IUserEntryValidator validateEmail = (String userInput) -> {
	    try {
	      if (userInput.length() == 0)
	        throw new UserValidationException(ExceptionType.IS_EMPTY, "email cannot be left empty. enter a valid email.");
	      return usrReg.validEmail(userInput);
	    } catch (NullPointerException e) {
	      throw new UserValidationException(ExceptionType.IS_NULL, "email cannot be null. enter a valid email.");
	    }
	  };

	  public IUserEntryValidator validatePassword = (String userInput) -> {
	    try {
	      if (userInput.length() == 0) throw new UserValidationException(ExceptionType.IS_EMPTY,
	        "password cannot be left empty. enter a valid password.");
	      return usrReg. validPasswordRule4(userInput);
	    } catch (NullPointerException e) {
	      throw new UserValidationException(ExceptionType.IS_NULL, "password cannot be null. enter a valid password.");
	    }
	  };

	  public IUserEntryValidator validateMobileNumber = (String userInput) -> {
	    try {
	      if (userInput.length() == 0) throw new UserValidationException(ExceptionType.IS_EMPTY,
	        "phone number cannot be left empty. enter a valid phone number.");
	      return usrReg.validMobileNumber(userInput);
	    } catch (NullPointerException e) {
	      throw new UserValidationException(ExceptionType.IS_NULL,
	        "phone number cannot be null. enter a valid phone number.");
	    }
	  };
}
