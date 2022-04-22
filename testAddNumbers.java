package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
//		storing sample result in value res.
		int res = jUnitFunctions.AddNumbers(10, 20);
//		validating obtained value.
		assertEquals(30, res);
	}

}
