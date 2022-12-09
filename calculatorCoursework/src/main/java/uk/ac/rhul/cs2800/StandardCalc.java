package uk.ac.rhul.cs2800;

//import java.util.Arrays;
//import java.util.List;

/**
 * StandardCalc takes a user defined infix expression and produces the calculated value.
 *
 * @author ayaan
 *
 */
public class StandardCalc {

  StrStack numbers = new StrStack();
  OpStack values = new OpStack();

  // method to assign value to operator based on rank
  int operatorRank(String operator) {
    if ((operator.equals("(")) || (operator.equals(")"))) {
      return 0;
    } else if ((operator.equals("+")) || (operator.equals("-"))) {
      return 1;
    } else {
      return 2;
    }
  }

  //// method to assign value to operator based on rank
  int operatorRankSym(Symbol operator) {
    if ((operator.equals(Symbol.LEFT_BRACKET)) || (operator.equals(Symbol.RIGHT_BRACKET))) {
      return 0;
    } else if ((operator.equals(Symbol.PLUS)) || (operator.equals(Symbol.MINUS))) {
      return 1;
    } else {
      return 2;
    }

  }
}
