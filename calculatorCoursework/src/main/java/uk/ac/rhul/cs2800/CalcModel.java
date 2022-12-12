package uk.ac.rhul.cs2800;

/**
 *Class inwhich actual calculation of expression occurs.
 *
 * @author ayaan
 */
public class CalcModel {
  private Calculator rpn;
  private Calculator sc;


  /**
   *Constructor for CalcModel class.
   */
  public CalcModel() {
    this.rpn = new RpnCalculation();
    this.sc = new StandardCalc();
  }

  /**
   *Method that calls StandardCalc and RpnCalculation.
   *
   * @param question user defined expression for calculation.
   * @param infix boolean value determining which method is used.
   * @return evaluated value.
   * @throws Exception thrown if invalid expression is given
   */
  public float evaluate(String question, boolean infix) throws Exception {
    if (infix) {
      return this.sc.evaluate(question);
    }
    return this.rpn.evaluate(question);
  }
}
