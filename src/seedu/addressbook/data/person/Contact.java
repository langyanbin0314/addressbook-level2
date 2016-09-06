package seedu.addressbook.data.person;
import seedu.addressbook.data.exception.*;
public class Contact {
    public String value;
    private boolean isPrivate;
    
    
    /**
     * constructor
     * @param contact
     * @param isPrivate
     * @throws IllegalValueException
     */
    
    public Contact(String contact, boolean isPrivate) throws IllegalValueException {
    	this.value = contact;
    	this.isPrivate = isPrivate;
	}

	/**
     * 
     * @param test string
     * @param validationRegex string
     * @return true if test string matches validationRegex format
     */
    public static boolean isValidContact(String test, String validationRegex) {
        return test.matches(validationRegex);
    }
    
    @Override
    public String toString() {
        return value;
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

}
