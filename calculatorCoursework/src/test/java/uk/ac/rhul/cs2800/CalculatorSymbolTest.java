package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * jUnit tests for the Symbol enum toString method.
 *
 * @author ayaan
 *
 */
class CalculatorSymbolTest {
  // test 1
  // Test to check whether toString method is producing the information in the correct format.
  @Test
  void testingSymbolToString() {
    Symbol leftBrac = Symbol.LEFT_BRACKET;
    assertEquals(leftBrac.toString(), "(", "Test to see if toString works");
  }

}
