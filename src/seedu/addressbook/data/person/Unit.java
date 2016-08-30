package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.*;
/**
 * Represents unit of a person's address
 * @author langyanbin0314
 *
 */

public class Unit {
	
	public static final String EXAMPLE = "#03-14";
	public static final String MESSAGE_UNIT_CONSTRAINT = "Unit could be any format";
	public static final String UNIT_VALIDATION_REGEX = ".*";
	
	public final String value;
	private boolean isPrivate;
	
	/**
	 * Checks whether the given input is a valid unit
	 * @param input
	 * @return
	 */
	public static boolean isValidUnit(String input){
		return input.matches(UNIT_VALIDATION_REGEX);
	}
	
	/**
	 * Construct a Unit object if the given unit is valid
	 * @param unit
	 * @param isPrivate
	 * @throws IllegalValueException
	 */
	public Unit(String unit, boolean isPrivate) throws IllegalValueException{
		this.isPrivate = isPrivate;
		unit = unit.trim();
		if(!isValidUnit(unit)){
			throw new IllegalValueException(MESSAGE_UNIT_CONSTRAINT);
		}
		this.value = unit;
		
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
				|| (other instanceof Unit // instanceof handles nulls
				&& this.value.equals(((Unit) other).value)); // state check
	}

}

