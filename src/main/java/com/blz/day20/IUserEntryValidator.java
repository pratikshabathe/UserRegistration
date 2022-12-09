package com.blz.day20;

@FunctionalInterface
public interface IUserEntryValidator {

	public boolean validate(String inpute) throws UserValidationException;
}
