package uk.ac.rhul.cs2800;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * jUnit tests for each method in the OpStack class.
 *
 * @author ayaan
 * 
 *         This code was inspired by the TDD demonstration found on moodle.
 *
 */

class OpStackTest {
  private OpStack opS;

  @BeforeEach
  void test() {
    opS = new OpStack();
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

  // test 3
  // test designed to see if pop and push methods work in tamdem
  // code modified from numStack
  @Test
  void pushThenPopTest() {
    opS.push(Symbol.MINUS);
    assertEquals(opS.opPop(), Symbol.MINUS, "Pushed Symbol.MINUS so popping should return a -");
    assertEquals(opS.isEmpty(), true, "Test to check whether stack is empty.");
    assertThrows(EmptyStackException.class, () -> opS.opPop(),
        "You cannot pop from an empty stack");
  }

}
