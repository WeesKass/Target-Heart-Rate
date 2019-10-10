package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class Controller {


    @FXML
    private Button calculateButton;

    @FXML
    private TextField ageTextField;

    @FXML
    private Label maxHeartRateLabel;

    @FXML
    private Label personHeartRateLabel;
    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try {
            Integer personAge = Integer.parseInt(ageTextField.getText());
            if (personAge < 0) {
                personHeartRateLabel.setText("Incorrect age. Try again");
            } else {
                Integer maximumHeartRate = 220 - personAge;
                Double personalInitialHeartRate = maximumHeartRate * 0.5;
                Double personalFinalHeartRate = maximumHeartRate * 0.85;

                maxHeartRateLabel.setText(maximumHeartRate.toString());
                personHeartRateLabel.setText(" From " + personalInitialHeartRate.toString() + " to " + personalFinalHeartRate.toString());
            }
        } catch (NumberFormatException ex) {
            ageTextField.setText("Incorrect. Try again");
            ageTextField.selectAll();
            ageTextField.requestFocus();
        }
    }



}