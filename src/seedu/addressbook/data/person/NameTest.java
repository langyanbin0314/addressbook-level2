package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
	private Name name;
	
	@Before
	public void setup() throws IllegalValueException {
		name = new Name("asd");
	}
	
	@Test
	public void isSimilar_notSimilarWithNull_returnFalse() {
		assertFalse(name.isSimilar(null));
	}
	
	@Test
	public void isSimilar_SimilarWithSelf_returnTrue() {
		assertTrue(name.isSimilar(name));
	}
	
	@Test
	public void isSimilar_SimilarWithDifferentCases_returnTrue() throws IllegalValueException {
		Name newName = new Name("aSd");
		assertTrue(name.isSimilar(newName));
	}
	
	@Test
	public void isSimilar_notSimilarWithDifferentName_returnFalse() throws IllegalValueException {
		Name newName = new Name("sfw");
		assertFalse(name.isSimilar(newName));
	}

}
