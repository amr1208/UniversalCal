package uk.ac.rhul.cs2800;

/**
 * This class provides a facade for StrStack.
 *
 * @author ayaan
 *
 */
public class StrStack {
  private Stack strStack;

  /**
   * Initiate Numstack object using stack.
   *
   */
  public StrStack() {
    strStack = new Stack();
  }

  /**
   * Method to check whether stack is empty or not.
   *
   * @return boolean value
   */
  public boolean isEmpty() {
    if (strStack.size() == 0) {
      return true;
    }
    return false;
  }

  /**
   *Method faciliates strings to be pushed onto the stack.
   *
   * @paramString i is a string
   */
  public void push(String i) {
    Entry str = new Entry(i);
    strStack.push(str);

  }
}
