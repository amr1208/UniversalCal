package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * jUnit tests for each method in entry class.
 *
 * @author ayaan
 *
 */
class CalculatorEntryTest {

  // private Entry ent;
  Entry entry = new Entry(10);
  Entry entry1 = new Entry(Symbol.LEFT_BRACKET);


  // Test 1
  @Test
  void testEntryAttribute() {
    assertEquals(entry.number, 10, "Test to see if the entry number attribute can be accessed.");
  }

  // Test 2
  @Test
  void testGetString() {
    assertEquals(entry.getString(), "10.0", "Tests if the String is retrieved");
  }

  // Test 3
  @Test
  void testgetValue() {
    assertEquals(entry.getValue(), 10.0, "Tests if the Value is retrieved");
  }

  // Test 4
  @Test
  void testGetSymbol() {
    assertEquals(entry1.getSymbol(), Symbol.LEFT_BRACKET,
        "Tests if the Symbol is appropriately retrieved");
  }

  // Test 5
  @Test
  void testGetType() {
    assertEquals(entry1.getType(), Type.SYMBOL, "Tests if the Type is appropriately retrieved");
  }

  // Test 6
  @Test
  void testToString() {
    assertEquals(entry.toString(), "10.0 NUMBER1234",
        "Tests if the toString() representation works");
  }

  // Test 7
  @Test
  void testEqualsMethod() {
    assertEquals(entry.equals(entry), true, "Tests to determine if the equals method works");
  }

  // Test 8
  /**
   * Test modified from junit videos.
   */
  @Test
  void testThrowException() {
    IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
      entry.getSymbol();
    });
    assertEquals(e.getMessage(), "Method used on incorrect object");
  }



}


