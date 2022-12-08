package uk.ac.rhul.cs2800;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RpnTest {
  private RpnCalculation rpn;

  @BeforeEach
  void test() {
    rpn = new RpnCalculation();
  }

  @Test
  // test to see if RPNCalculation splits string into a list correctly
  // function was originally set to return the length of the list
  void testlistLen() {
    assertEquals(rpn.evaluate(" 1 2 + "), 3, "Test length of expression using size method");
  }

  @Test
  // test to see if RPNCalculation splits string into a list correctly
  // even if there are spaces within the operands, the method still computes correctly!
  void testSpace() {
    assertEquals(rpn.evaluate(" 1   2      + "), 3, "Test length of expression using size method");
  }

  @Test
  // test to see if RPNCalculation addition works
  void testAdd() {
    assertEquals(rpn.evaluate("4 5 +"), 9, "Testing adding two numbers");
  }

  @Test
  // test to see the effect of adding 0 to a number
  public void testPlusZero() {
    assertEquals(rpn.evaluate("9 0 +"), 9, "Test to see effect of adding zero");
  }

  @Test
  // test to see if list split method works for values with two digits
  public void testPlusDoubleDigits() {
    assertEquals(rpn.evaluate("90 10 +"), 100, "Test to see double digits sum");
  }

  @Test
  // test to see if list split method works for one float and one whole number
  // test fails since java requires a value accurate to a large decimal place
  public void testPlusFloats() {
    assertEquals(rpn.evaluate("9.5 10 +"), 19.5, "Test to see floats sum");
  }



}
