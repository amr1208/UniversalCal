package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class opStackTest {
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
		assertEquals(opS.isEmpty(), true, "Test to determine opStack is empty.");
	}
	// test 2
	// test to see if push method works
	// code modified from numStack
	@Test
	void testPush() {
		opS.push(Symbol.PLUS);
		assertEquals(opS.isEmpty(), false, "Test to determine opStack is not empty.");
	}

}
