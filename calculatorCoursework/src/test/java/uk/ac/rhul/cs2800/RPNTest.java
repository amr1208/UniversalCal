package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RPNTest {
  private RpnCalculation RPN;

  @BeforeEach
  void test() {
    RPN = new RpnCalculation();
  }
  
  @Test
  // test to see if RPNCalculation splits string into a list correctly
  void testlistLen() {
    assertEquals(RPN.evaluate("  1 2 + "), 3, "Test length of expression using size method");
  }
  
  
  
  
}
