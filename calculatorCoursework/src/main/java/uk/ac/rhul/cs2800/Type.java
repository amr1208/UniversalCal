package uk.ac.rhul.cs2800;

/**
 * A list of the types of value an Entry can represent.
 *
 * @author ayaan
 * 
 */

public enum Type {
  NUMBER("1234"), STRING("abcd"), SYMBOL("+-/*"), INVALID("?");

  private String type;

  private Type(String string) { // constructor for enum
    this.type = string;
  }

  /**
   * A toString method that provides a string representation of the type enum.
   *
   * @return a string containing the name of the enum as well as some example data.
   */
  public String toString() {
    return name() + type;
  }

}
