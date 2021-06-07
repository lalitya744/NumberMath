
package com.sample.sparktest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumbersMathTest {

	@Test
	public void test1() {
		double output = new NumbersMath().getComputedData("src/test/resources/input/inputFile");
		assertEquals(112.25417586887359, output);
	}
	
	@Test
	public void test2() {
		double output = new NumbersMath().getComputedData("src/test/resources/input/inputFile2");
		assertEquals(550.0918105189351, output);
	}
}
