package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * This class provides a facade for an operation stack.
 *
 * @author ayaan
 * 
 */
public class OpStack {
  private Stack opStack;

  /**
   * method to iniate opStack object.
   */
  public OpStack() {
    opStack = new Stack();
  }

  /**
   * Method to check whether stack is empty or not.
   *
   * @return boolean value representative of whether the stack is empty
   */
  public boolean isEmpty() {
    if (opStack.size == 0) {
      return true;
    }
    return false;
  }

  /**
   * method to add symbol enum by push.
   *
   * @param i is an operation symbol (type enum symbol) which is added to the stack
   */
  public void push(Symbol i) {
    Entry operator = new Entry(i);
    opStack.push(operator);

  }

  /**
   * Pops off the item on the top of the OpStack and returns it.
   *
   * @return symbol currently on stack
   */
  public float opPop() {
    if (opStack.size == 0) {
      throw new EmptyStackException();
    }
    float result = opStack.pop().getValue();
    return result;
  }

}
