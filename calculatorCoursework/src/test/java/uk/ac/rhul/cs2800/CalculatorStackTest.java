package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * jUnit tests for each method in the stack class.
 *
 * @author ayaan
 * 
 *         This code was inspired by the TDD demonstration found on moodle.
 *
 */
class CalculatorStackTest {
  private Stack cs;

  @BeforeEach
  public void setup() {
    cs = new Stack();
  }

  // test 1
  // Test designed to initate a stack object and verify its size.
  @Test
  void objectSizetest() {
    Stack cs = new Stack();
    assertEquals(cs.size(), 0, "Test to determine size of stack is zero.");

  }

  // test 2
  // creating a test for push function to add items to the stack, tested using integers and then
  // once working using Entry object.
  @Test
  void testPush() {
    cs.push(new Entry(7));
    assertEquals(cs.size(), 1, "Test to determine size of stack is one.");

  }

  // test 3
  // test designed to check pop function and that exception is caught.
  @Test
  void emptyPopTest() {
    assertThrows(EmptyStackException.class, () -> cs.pop(), "You cannot pop from an empty stack");
  }

  // test 4
  // test designed to see if pop and push methods work in tamdem
  @Test
  void pushThenPopTest() {
    Entry e = new Entry(7);
    cs.push(e);
    assertEquals(cs.pop(), e, "Push a 7 and then popping should return a 7");
    assertEquals(cs.size(), 0, "Test to check whether stack is empty.");
    assertThrows(EmptyStackException.class, () -> cs.pop(), "You cannot pop from an empty stack");
  }

  // test 5
  // test for pushing multiple entries
  // test failed since non-expandable data structure was in use, therefore stack uses arraylist
  @Test
  void pushPushTest() {
    Entry e = new Entry(7);
    Entry e2 = new Entry(9);
    cs.push(e);
    cs.push(e2);
    assertEquals(cs.size(), 2,
        "Test to check whether stack is size two after popping two numbers on.");
    assertEquals(cs.pop(), e2, "Pushing a 7 and a 9 and then popping should return a 9");
    assertEquals(cs.pop(), e, "Popping at this point should return a 7");
    assertEquals(cs.size(), 0, "Test to check whether stack is empty after popping two numbers.");
    assertThrows(EmptyStackException.class, () -> cs.pop(), "You cannot pop from an empty stack");
  }


  // test 6
  // Test to see that multiple items can be pushed onto the stack.
  @Test
  void pushLots() {
    for (int i = 0; i < 200; i++) {
      cs.push(new Entry(i + 3));
    }
    assertEquals(cs.size(), 200, "Test to check whether stack is 200 items in length.");
  }

  // test 7
  // Test to see that both push and pop function can be used in tamdem on a large scale.
  @Test
  void pushPopLots() {
    for (int i = 0; i < 100; i++) {
      cs.push(new Entry(i + 3));
    }
    assertEquals(cs.size(), 100, "Test to check whether stack is 200 items in length.");
    for (int i = 0; i < 100; i++) {
      cs.pop();
    }
    assertEquals(cs.size(), 0, "Test to check whether stack is empty after popping two numbers.");
  }

  // test 8
  // Now that program supports multiple entries, top method is introduced. 
  @Test
  void testTop() {
    assertThrows(EmptyStackException.class, () -> cs.top(),
        "Empty stack therefore Top method should throw an exception.");
    Entry e = new Entry(2);
    Entry e2 = new Entry(3);
    cs.push(e);
    cs.push(e2);
    assertEquals(cs.top(), e2, "Test to check whether top method works.");
  }
}
