package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
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

}
