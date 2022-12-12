package uk.ac.rhul.cs2800;

import java.util.Arrays;
import java.util.List;

/**
 * StandardCalc takes a user defined infix expression and produces the calculated value.
 *
 * @author ayaan
 *
 */
public class StandardCalc {

  StrStack numbers = new StrStack();
  OpStack values = new OpStack();
  private RpnCalculation rpn = new RpnCalculation();


  /**
   * Method takes user expression and converts it into reverse polish notation and then passes it
   * through RpnCalculation. Algorithm developed using
   * https://www.youtube.com/watch?v=WNV6-C3BKWY&ab_channel=EngageCS
   *
   * @param expression entered by user.
   * @return The result of the expression evaluated using infix notation.
   */
  public float evaluateInfix(String expression) {

    List<String> expressionInfix = Arrays.asList(expression.strip().split(" "));
    int size = expressionInfix.size(); // stores the size of the list

    // loop through list and determines whether entry is a number or an operator.
    for (int i = 0; i < size; i++) {
      String cur = expressionInfix.get(i);
      try {
        float number = Float.parseFloat(cur);
        this.numbers.push(cur); // pushes number onto numbers strstack
        continue;
      } catch (NumberFormatException exception) {
        // do nothing
      }
      if (cur.equals("(")) {
        values.push(Symbol.LEFT_BRACKET); // when cursor is "(", pushes this onto opStack
      } else if (cur.equals(")")) { // pops ")" onto stack
        Symbol currOperation = values.opPop();
        while (!currOperation.equals(Symbol.LEFT_BRACKET)) { // while loop pops values off opstack
          // until "(" is found.
          numbers.push(currOperation.toString()); // pushes popped off operators onto strStack
          if (values.isEmpty()) { // if opStack is empty, while loop is broken out
            break;
          }
          currOperation = values.opPop(); // stores poped values in variable for operations to be
          // done to it.

        }

      } else if (cur.equals("+")) {
        if (values.isEmpty() == true) {
          values.push(Symbol.PLUS); // push plus onto stack if cursor is + and stack is empty
        } else {
          Symbol currentOstack = values.opPop(); // If new element is higher priority than top of
          // opstack element, add element to stack
          if (!((operatorRank(cur)) <= (operatorRankSym(currentOstack)))) {
            values.push(currentOstack);
          } else { // push operators with low priority onto strstack.
            while ((operatorRank(cur)) <= (operatorRankSym(currentOstack))) {
              numbers.push(currentOstack.toString());
              if (values.isEmpty()) {
                break;
              }
              currentOstack = values.opPop(); // if curRank is higher push currentOstack onto
              // opStack Values.
              if (!((operatorRank(cur)) <= (operatorRankSym(currentOstack)))) {
                values.push(currentOstack);
              }
            }
          }
          values.push(Symbol.PLUS); // push plus onto opstack
        }
      } else if (cur.equals("-")) {
        if (values.isEmpty() == true) {
          values.push(Symbol.MINUS);
        } else {
          Symbol currentOstack = values.opPop();
          if (!((operatorRank(cur)) <= (operatorRankSym(currentOstack)))) {
            values.push(currentOstack);
          } else {
            while ((operatorRank(cur)) <= (operatorRankSym(currentOstack))) {
              numbers.push(currentOstack.toString());
              if (values.isEmpty()) {
                break;
              }
              currentOstack = values.opPop();
              if (!((operatorRank(cur)) <= (operatorRankSym(currentOstack)))) {
                values.push(currentOstack);
              }
            }
          }
          values.push(Symbol.MINUS);
        }


      } else if (cur.equals("/")) { // Division and Multiplication have highest priority so get
        // pushed immediately.
        values.push(Symbol.DIVIDE);
      } else if (cur.equals("*")) {
        values.push(Symbol.TIMES);
      }
    }
    // push all the values on opstack onto number strstack.
    while (!values.isEmpty()) {
      numbers.push(values.opPop().toString());
    }

    // Converts strStack contents into string as this will be passed into RPN method.
    String expressionRpn = "";
    while (!numbers.isEmpty()) {
      String s2 = numbers.strPop();
      expressionRpn += " ";
      expressionRpn += s2;
    }

    // Reverse expressionRPN since Stack is Last in First out data type.

    // ReverseString using StringBuilder.
    StringBuilder stringBuildervarible = new StringBuilder();
    stringBuildervarible.append(expressionRpn);
    // reverse is inbuilt method in StringBuilder to use reverse the string
    expressionRpn = stringBuildervarible.reverse().toString();

    return rpn.evaluate(expressionRpn);
  }

  // method to assign value to operator based on rank
  int operatorRank(String operator) {
    if ((operator.equals("(")) || (operator.equals(")"))) {
      return 0;
    } else if ((operator.equals("+"))) {
      return 1;
    } else if ((operator.equals("-"))) {
      return 2;
    } else {
      return 3;
    }
  }

  // method to assign value to operator based on rank.
  // originally minus and plus had the same priority. This caused issues with trying to
  // use negative numbers. Now I have provided a more robust priority scheme

  int operatorRankSym(Symbol operator) {
    if ((operator.equals(Symbol.LEFT_BRACKET)) || (operator.equals(Symbol.RIGHT_BRACKET))) {
      return 0;
    } else if ((operator.equals(Symbol.PLUS))) {
      return 1;
    } else if ((operator.equals(Symbol.MINUS))) {
      return 2;
    } else {
      return 3;
    }

  }
}
