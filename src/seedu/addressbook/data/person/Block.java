package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.*;
/**
 * Represents block number of a person's address
 * @author langyanbin0314
 *
 */

public class Block {
	
	public static final String EXAMPLE = "17";
	public static final String MESSAGE_BLOCK_CONSTRAINT = "Block number should be a positive integer";
	public static final String BLOCK_VALIDATION_REGEX = "\\d+";
	
	public final String value;
	private boolean isPrivate;
	
	/**
	 * Checks whether the given input is a valid block number
	 * @param input
	 * @return
	 */
	public static boolean isValidBlock(String input){
		return input.matches(BLOCK_VALIDATION_REGEX);
	}
	
	/**
	 * Construct a Block object if the given block number is valid
	 * @param block
	 * @param isPrivate
	 * @throws IllegalValueException
	 */
	public Block(String block, boolean isPrivate) throws IllegalValueException{
		this.isPrivate = isPrivate;
		block = block.trim();
		if(!isValidBlock(block)){
			throw new IllegalValueException(MESSAGE_BLOCK_CONSTRAINT);
		}
		this.value = block;
		
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
				|| (other instanceof Block // instanceof handles nulls
				&& this.value.equals(((Block) other).value)); // state check
	}

}
