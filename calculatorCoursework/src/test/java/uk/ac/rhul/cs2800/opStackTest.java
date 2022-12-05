package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatoropStackTest {
	private opStack opS;

	@BeforeEach
	void test() {
		opS = new opStack();
	}

	// test 1
	// test to see if opStack is empty
	// code modified from numStack

	@Test
	void testEmpty() {
		assertEquals(opS.isEmpty(), true, "Test to determine numStack is empty.");
	}


}
