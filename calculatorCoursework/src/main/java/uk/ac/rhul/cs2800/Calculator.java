package uk.ac.rhul.cs2800;

/**
 * Interface that describes a behavior that calculator classes must implement.
 *
 * @author ayaan
 */
public interface Calculator {
  /**
   *Method that throws an exception when an invalid input is provided.
   *
   * @param expression user defined
   * @return float result of expression
   * @throws Exception when there is an invalid input.
   */
  float evaluate(String expression) throws Exception;
}
