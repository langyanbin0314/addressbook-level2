package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.*;


/**
 * Represents street name of a person's address
 * @author langyanbin0314
 *
 */
public class Street {
	
	public static final String EXAMPLE = "673 Bukit Timah Road";
	public static final String MESSAGE_STREET_CONSTRAINT = "Street name should be a string consisting of numbers and alphabets";
	public static final String STREET_VALIDATION_REGEX = "[\\w\\.]+";

	public final String value;
	private boolean isPrivate;
	
	/**
	 * Checks whether the given input is a valid street name
	 * @param input
	 * @return
	 */
	public static boolean isValidstreet(String input){
		return input.matches(STREET_VALIDATION_REGEX);
	}
	
	/**
	 * Construct a street object if the given street name is valid
	 * @param street
	 * @param isPrivate
	 * @throws IllegalValueException
	 */
	public Street(String street, boolean isPrivate) throws IllegalValueException{
		this.isPrivate = isPrivate;
		street = street.trim();
		if(!isValidstreet(street)){
			throw new IllegalValueException(MESSAGE_STREET_CONSTRAINT);
		}
		this.value = street;
		
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
				|| (other instanceof Street // instanceof handles nulls
				&& this.value.equals(((Street) other).value)); // state check
	}

}
