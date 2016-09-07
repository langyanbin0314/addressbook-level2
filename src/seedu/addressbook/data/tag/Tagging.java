package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.*;

/**
 * Association class
 * 
 *
 */

public class Tagging {
	
	private boolean isAdded = false;
	private Tag tag;
	private Name name;
	private String result = "";
	
	public Tagging(Person person, Tag tag, boolean isAdded) {
		this.isAdded = isAdded;
		this.tag = tag;
		this.name = person.getName();
		this.createString();
	}
	
	public void createString() {
		if(isAdded) {
			result += "+ " + name.toString() + " [" + tag.toString() + "]\n";
		} else {
			result += "- " + name.toString() + " [" + tag.toString() + "]\n";
		}
	}
	
	public String getResultString() {
		return result;
	}

}
