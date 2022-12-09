package uk.ac.rhul.cs2800;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
// I was clumspy with commits and completely developed the feature without commiting anything to
// gitLab.
// Only error correctly is that error occurs with functions such as -5+10.

class CalculatorStandardCalcTest {

  @Test
  // test 1
  // test to see whether program can determine which operator holds a higher priority
  // as this function is critical for the conversion of infix to post fix
  // feature was first hardcoded and now works fully
  void testPriorityCalc() {
    StandardCalc sc = new StandardCalc();

    assertEquals((!((sc.operatorRank("+")) <= (sc.operatorRankSym(Symbol.LEFT_BRACKET)))), true,
        "Testing whether symbol rank is functional");
  }

  // test2
  // Test to see whether simple equation with one operator can be evaluated.
  @Test
  void testSimpleCalc() {
    StandardCalc sc = new StandardCalc();
    assertEquals(sc.evaluateInfix("5 + 6"), 11,
        "Evaluation of whether simple equation can be solved.");
  }

  // test3
  // Test to see whether string with one set of brackets could be evaluated properly.
  // Test first was aimed to see whether String was being read in and then outputted
  // correctly and then moved towards solving a simple equation.
  @Test
  void testCalc() {
    StandardCalc sc = new StandardCalc();
    assertEquals(sc.evaluateInfix("( 5 * 6 + 7 ) - 2"), 35,
        "Evaluation of whether simple one bracket equation can be solved.");
  }

  // test4
  // Test to see whether string with no operator runs.
  // test does run and pop's value at top of stack, so 5 in this case
  @Test
  void testnoOpCalc() {
    StandardCalc sc = new StandardCalc();
    assertEquals(sc.evaluateInfix("4 5"), 5, "Evaluation to test program doesn't crash");
  }

  // test5
  // Test to see whether string with just zeros crashes the program.
  // it will not as method pops stack value
  @Test
  void testZero() {
    StandardCalc sc = new StandardCalc();
    assertEquals(sc.evaluateInfix("0 0"), 0, "Test to see if 0 causes an error ");
  }

  // test6
  // test to see whether high priority operations execute as expected with others
  @Test
  void testCalcDiv() {
    StandardCalc name = new StandardCalc();
    assertEquals(name.evaluateInfix("( 5 * 6 + 6 ) / 2"), 18, "Complex equation test");
  }

  // test7
  // testing out whether equation on spec can be correctly calculated
  // this caused issues since there were two sets of brackets.
  // EmptyStackexception happened a lot which suggested I was popping too much.
  // After refactoring and using the debugger I was able to bring full functionality to feature.
  @Test
  void testCalcFinal() {
    StandardCalc name = new StandardCalc();
    assertEquals(name.evaluateInfix("( 5 * ( 6 + 7 ) ) - 2"), 63, "Complex equation test");
  }
}


