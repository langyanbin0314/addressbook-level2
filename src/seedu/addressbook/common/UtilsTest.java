package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;


import org.junit.Test;

/**
 * 
 * JUnit tests for the Utils class
 *
 */


public class UtilsTest {

	@Test
	public void isAnyNUll_hasNull_returnTrue() {
		Object o1 = null;
		Object o2 = new Object();
		
		assertTrue(Utils.isAnyNull(o1, o2));

	}
	
	@Test
	public void isAnyNull_noNull_returnFalse() {
		Object o1 = new Object();
		Object o2 = new Object();
		
		assertFalse(Utils.isAnyNull(o1, o2));
	}
	
	
	@Test
	public void areElementsUnique_unique_returnTrue() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		assertTrue(Utils.elementsAreUnique(list));
		
	}
	
	@Test
	public void areElementsUnique_notUnique_returnFalse() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		assertFalse(Utils.elementsAreUnique(list));
		
	}
	

}
