package uk.ac.rhul.cs2800;

/**
 * A list of the non-number tokens possible in an expression.
 *
 * @author ayaan
 *
 */
public enum Symbol {
  LEFT_BRACKET("("), RIGHT_BRACKET(")"), TIMES("*"), DIVIDE("/"), PLUS("+"), MINUS("-"), INVALID(
      "");


  private String symbol;

  // private enum constructor
  private Symbol(String s) {
    this.symbol = s;
  }

  /**
   * A toString method that provides a string representation of the Symbol enum.
   *
   * @return a string representation of the enum.
   */
  @Override
  public String toString() {
    return this.symbol;
  }

}
