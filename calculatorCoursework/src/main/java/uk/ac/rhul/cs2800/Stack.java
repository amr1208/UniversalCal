package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * This class represents a Stack of Entry values.
 *
 * @author ayaan
 *
 */
public class Stack {
  int size = 0;
  ArrayList<Entry> value = new ArrayList<Entry>();

  /**
   * Returns the number of elements in the stack.
   *
   * @return the size of the stack.
   */
  public int size() {
    return size;
  }

  /**
   * Adds items onto the stack by pushing.
   *
   * @param i is an entry supplied by the user to be added to the stack.
   */
  public void push(Entry i) {
    value.add(i);
    size = size + 1;
  }

  /**
   * Pops off the item on the top of the stack and returns it.
   *
   * @return the item at the top of the stack and removes it.
   */
  public Entry pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    size = size - 1;
    return value.remove(size);
  }

  /**
   * Displays the item on the top of the stack.
   *
   * @return the entry on the top of the stack. It is just returned and not removed.
   */
  public Entry top() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    return value.get(size - 1);
  }

}
