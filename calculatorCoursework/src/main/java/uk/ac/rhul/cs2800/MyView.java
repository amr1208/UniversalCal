package uk.ac.rhul.cs2800;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * Controller class for calculator Coursework Code generated via scenebuilder.
 *
 * @author ayaan
 *
 */
public class MyView {
  private CalcModel calc = new CalcModel();
  @FXML
  private Button calcButton;

  @FXML
  private TextField fieldExpression;

  @FXML
  private TextField fieldResult;

  @FXML
  private ToggleGroup radio;

  @FXML
  private RadioButton radioInfix;

  @FXML
  private RadioButton radioRp;

  @FXML
  void isPressed(ActionEvent event) {
    String expression = fieldExpression.getText();
    String output = "";
    try {
      Float result = calc.evaluate(expression, radioInfix.isSelected());
      output = result.toString();
    } catch (Exception e) {
      output = "Invalid expression! Try again";
    }
    fieldResult.setText(output);
  }

  @FXML
  void isSelectedInfix(ActionEvent event) {

  }

  @FXML
  void isSelectedRpn(ActionEvent event) {

  }

}
