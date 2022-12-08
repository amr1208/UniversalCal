package uk.ac.rhul.cs2800;

import java.lang.IllegalArgumentException;
import java.util.Objects;

/**
 * Class to organise values stored in a Stack.
 *
 * @author ayaan
 *
 */
public class Entry {
  float number;
  Symbol other;
  String str;
  Type type;


  /**
   * Constructor for float entry.
   *
   * @param value a number used in the calculation
   */
  public Entry(float value) {
    this.number = value;
    this.str = Float.toString(value);
    this.type = Type.NUMBER;
  }

  /**
   * Constructor for symbol entry.
   *
   * @param s variable that stores symbol character
   */
  public Entry(Symbol s) {
    this.other = s;
    this.str = String.valueOf(s);
    this.type = Type.SYMBOL;
  }
  
  /**
   * Constructor for String Entry.
   *
   * @paramString Value entered by user
   */
  public Entry(String s) {
    this.number = 0f;
    this.str = s;
    this.type = Type.STRING;
  }

  // Getters
  /**
   * Getter method to acquire type attribute from entry.
   *
   * @return type enum
   */
  public Type getType() {
    return type;
  }

  /**
   * Method to acquire string attribute from entry.
   *
   * @return str
   * @throws IllegalArgumentException if method is used inappropriately.
   */
  public String getString() throws IllegalArgumentException {
    if (!(str instanceof String)) {
      throw new IllegalArgumentException("Method used on incorrect object");
    }
    return str;
  }

  /**
   * Method to acquire Symbol attribute from entry.
   *
   * @return symbol other
   * @throws IllegalArgumentException if method is used inappropriately.
   */
  public Symbol getSymbol() throws IllegalArgumentException {

    if (!(other instanceof Symbol)) {
      throw new IllegalArgumentException("Method used on incorrect object");
    }
    return other;
  }

  /**
   * Method to acquire number/value attribute from Entry.
   *
   * @return the number attribute.
   * @throws IllegalArgumentException to catch a bad type.
   */
  public float getValue() throws IllegalArgumentException {

    if (number != (float) number) {
      throw new IllegalArgumentException("Method used on incorrect object");
    }

    return number;
  }

  /**
   * Return string representation of an entry.
   *
   * @return String describing the entry.
   */
  @Override
  public String toString() {
    if (this.other == null) {
      return this.number + " " + this.type;
    }
    return this.other + " " + this.type;
  }

  /**
   *method that generates a hashcode for the object. Auto-generated code.
   *
   *@return a hash code value for the object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(number, other, str, type);
  }



  /**
   * Indicates whether some other object is "equal to" this one. Auto-generated code.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {

      return true;
    }
    if (obj == null) {

      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Entry other = (Entry) obj;
    return Float.floatToIntBits(number) == Float.floatToIntBits(other.number)
        && this.other == other.other && Objects.equals(str, other.str) && type == other.type;
  }

}
