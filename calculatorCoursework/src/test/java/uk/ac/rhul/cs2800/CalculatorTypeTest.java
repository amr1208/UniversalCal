package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * jUnit tests for the Type enum toString method.
 *
 * @author ayaan
 *
 */
class CalculatorTypeTest {
  // Test 1
  // aims to test that the toString is formatting the text correctly
  @Test
  void testingSymbolToString() {
    Type num = Type.STRING;
    assertEquals(num.toString(), "STRINGabcd", "Test to see if toString works");
  }

}
