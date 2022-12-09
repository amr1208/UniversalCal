package uk.ac.rhul.cs2800;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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
  @Test
  void testCalc() {
    StandardCalc sc = new StandardCalc();
    assertEquals(sc.evaluateInfix("( 5 * 6 + 7 ) - 2"), 35,
        "Evaluation of whether simple one bracket equation can be solved.");
  }




}
