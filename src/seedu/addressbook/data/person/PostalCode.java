package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.*;
/**
 * Represents postal code number of a person's address
 * @author langyanbin0314
 *
 */

public class PostalCode {
	
	public static final String EXAMPLE = "123456";
	public static final String MESSAGE_POSTAL_CODE_CONSTRAINT = "Postal code should be a positive integer";
	public static final String POSTAL_CODE_VALIDATION_REGEX = "\\d+";
	
	public final String value;
	private boolean isPrivate;
	
	/**
	 * Checks whether the given input is a valid postal code
	 * @param input
	 * @return
	 */
	public static boolean isValidPostalCode(String input){
		return input.matches(POSTAL_CODE_VALIDATION_REGEX);
	}
	
	/**
	 * Construct a PostalCode object if the given postalCode number is valid
	 * @param postalCode
	 * @param isPrivate
	 * @throws IllegalValueException
	 */
	public PostalCode(String postalCode, boolean isPrivate) throws IllegalValueException{
		this.isPrivate = isPrivate;
		postalCode = postalCode.trim();
		if(!isValidPostalCode(postalCode)){
			throw new IllegalValueException(MESSAGE_POSTAL_CODE_CONSTRAINT);
		}
		this.value = postalCode;
		
	}
	
	public boolean isPrivate(){
		return this.isPrivate;
	}
	
	@Override
	public String toString(){
		return this.value;
	}
	
	@Override
	public int hashCode(){
		return this.value.hashCode();
	}
	
	@Override
	public boolean equals(Object other){
		return other == this // short circuit if same object
				|| (other instanceof PostalCode // instanceof handles nulls
				&& this.value.equals(((PostalCode) other).value)); // state check
	}

}
