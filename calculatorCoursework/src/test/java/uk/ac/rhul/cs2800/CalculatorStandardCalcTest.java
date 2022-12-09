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


}
