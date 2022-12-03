package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorNumStackTest {
	private NumStack numS;

	@BeforeEach
	void test() {
		numS = new NumStack();
	}

	// test 1
	// test to see if numStack is empty
	// isEmpty function is set to return true regardless
	@Test
	void testEmpty() {
		assertEquals(numS.isEmpty(), true, "Test to determine numStack is empty.");
	}

	// test 2
	// creating a test for push function to add items to the stack, tested using
	// float and isEmpty function.
	// isEmpty now must be functional
	@Test
	void testPush() {
		numS.push(69);
		assertEquals(numS.isEmpty(), false, "Test to determine numStack is not empty.");
	}

	// test 3
	// test designed to check pop function and that exception is caught.
	@Test
	void emptyPopTest() {
		assertThrows(EmptyStackException.class, () -> numS.numPop(), "You cannot pop from an empty stack");
	}

	// test 4
	// test designed to see if pop and push methods work in tamdem
	// pop was hard coded to return 0, now pop function returns value.
	@Test
	void pushThenPopTest() {
		numS.push(99);
		assertEquals(numS.numPop(), 99.0, "Pushed 99 so popping should return a 99");
		assertEquals(numS.isEmpty(), true, "Test to check whether stack is empty.");
		assertThrows(EmptyStackException.class, () -> numS.numPop(), "You cannot pop from an empty stack");
	}

	// test 5
	// test for pushing multiple entries
	@Test
	void pushPushTest() {
		numS.push(7);
		numS.push(9);
		assertEquals(numS.isEmpty(), false, "Test to determine numStack is not empty.");
		assertEquals(numS.numPop(), 9 , "Pushing a 7 and a 9 and then popping should return a 9");
		assertEquals(numS.numPop(), 7, "Popping at this point should return a 7");
		assertEquals(numS.isEmpty(), true, "Test to determine numStack is not empty.");
		assertThrows(EmptyStackException.class, () -> numS.numPop(), "You cannot pop from an empty stack");
	}

}
