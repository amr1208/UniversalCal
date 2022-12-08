package uk.ac.rhul.cs2800;

import java.util.Arrays;
import java.util.List;


/**
 * Class to implement Reverse Polish function for calculator. Evaluates a given expression using RPN
 *
 * @author ayaan
 *
 */
public class RpnCalculation {
  private NumStack values;

  /**
   * Constructor for reverse Polish notation.
   * 
   */
  public RpnCalculation() {
    this.values = new NumStack();
  }



  /**
   * Method to evaluate given RPN expression.
   *
   * @param expression given by user.
   * @return Evaluated result of expression.
   */
  public float evaluate(String expression) {
    List<String> elemts = Arrays.asList(expression.strip().split(" ")); // stores user string in a
    // list, seperating each entry on white space.
    int size = elemts.size(); // stores the size of the list

    // loop through list and determines whether entry is a number or an operator
    for (int i = 0; i < size; i++) {
      String cur = elemts.get(i);
      try {
        float number = Float.parseFloat(cur);
        this.values.push(number);
        continue;
      } catch (NumberFormatException exception) {
        // do nothing
      }
      if (cur.equals("+")) {
        float resultAdd = Float.sum(this.values.numPop(), this.values.numPop());
        this.values.push(resultAdd);
      } else if (cur.equals("-")) {
        float fnum = this.values.numPop();
        float snum = this.values.numPop();
        this.values.push(snum - fnum);
      } else if (cur.equals("/")) {
        float fnum = this.values.numPop();
        float snum = this.values.numPop();
        this.values.push(snum / fnum);
      } else if (cur.equals("*")) {
        this.values.push(this.values.numPop() * this.values.numPop());
      }


    }
    return this.values.numPop();

  }


}
