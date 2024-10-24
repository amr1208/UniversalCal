package uk.ac.rhul.cs2800;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorStrStackTest {
  private StrStack strS;

  @BeforeEach
  void test() {
    strS = new StrStack();
  }

  // test 1
  // Test designed to initate a stack object and verify its size.
  @Test
  void objectSizetest() {
    Stack strS = new Stack();
    assertEquals(strS.size(), 0, "Test to determine size of stack is zero.");

  }

  // test 2
  // check to see whether stack is empty or not.
  @Test
  void testEmpty() {
    assertEquals(strS.isEmpty(), true, "Test to determine strStack is empty.");
  }

  // test 3
  // test to see whether string can be pushed onto the stack.
  // Push function uses entry but there was no constructor for string
  // in my original push function, created a constructor to fix this
  @Test
  void testPush() {
    strS.push("Hello World");
    assertEquals(strS.isEmpty(), false, "Test to determine strStack is not empty.");
  }

  // test 4
  // test to sure program doesn't break when trying to pop off an empty stack
  @Test
  void emptyPopTest() {
    assertThrows(EmptyStackException.class, () -> strS.strPop(),
        "You cannot pop from an empty stack");
  }

  // test 5
  // test designed to see if pop and push methods work in tamdem
  // code modified from numstack, but getValue has been switched to getString.
  @Test
  void pushThenPopTest() {
    strS.push("dell");
    assertEquals(strS.strPop(), "dell", "Pushed dell so popping should return a dell");
    assertEquals(strS.isEmpty(), true, "Test to check whether stack is empty.");
    assertThrows(EmptyStackException.class, () -> strS.strPop(),
        "You cannot pop from an empty stack");
  }

}
