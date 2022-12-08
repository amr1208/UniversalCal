package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * This class provides a facade for the numStack stack.
 *
 * @author ayaan
 *
 */
public class NumStack {
  private Stack numStack;

  /**
   * Initiate Numstack object using stack.
   */
  public NumStack() {
    numStack = new Stack();
  }

  /**
   *Method faciliates floats to be pushed onto the stack.
   *
   * @param i is a float 
   */
  public void push(float i) {
    Entry number = new Entry(i);
    numStack.push(number);

  }

  /**
   * Pops off the item on the top of the stack and returns the float.
   *
   * @return item at the top of stack
   */
  public float numPop() {
    if (numStack.size() == 0) {
      throw new EmptyStackException();
    }
    float result = numStack.pop().getValue();
    return result;
  }

  /**
   * Method to check whether the stack is empty.
   *
   * @return boolean value representing whether stack has entries or not.
   */
  public boolean isEmpty() {
    if (numStack.size == 0) {
      return true;
    }
    return false;
  }
}
