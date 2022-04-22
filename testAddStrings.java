package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
//		storing sample result in value res.
		String res = jUnitFunctions.AddStrings("Siddharth " , "Yadav");
//		validating obtained value.
		assertEquals("Siddharth Yadav", res);
	}

}
