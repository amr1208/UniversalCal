package uk.ac.rhul.cs2800;

import java.util.Arrays;
import java.util.List;

public class RpnCalculation {
  private NumStack values = new NumStack();
  

  
  public float evaluate(String expression) {
    List<String> elemts = Arrays.asList(expression.strip().split(" "));
    float size = elemts.size();
    return size;   
    
  }
  

}   
