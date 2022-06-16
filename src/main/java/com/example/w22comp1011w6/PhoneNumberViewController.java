package com.example.w22comp1011w6;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PhoneNumberViewController implements Initializable {

    @FXML
    private Label areaCodeLabel;

    @FXML
    private Label cityCodeLabel;

    @FXML
    private Label phoneNumLabel;

    @FXML
    private TextField phoneNumTextField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        phoneNumTextField.textProperty().addListener((obs, oldValue, phoneNum) -> {
            if (phoneNum.matches("\\(?[2-9]\\d{2}\\)?[-\\s]?[2-9]\\d{2}[-\\s]?\\d{4}"))
            {
                phoneNumLabel.setText("Valid phone number");
                phoneNum = phoneNum.replaceAll("[^0-9]*", "");
                areaCodeLabel.setText("area code: " + phoneNum.substring(0,3));
                cityCodeLabel.setText("city code: "+ phoneNum.substring(3,6));
            }
            else
            {
                phoneNumLabel.setText("Invalid phone number");
                areaCodeLabel.setText("");
                cityCodeLabel.setText("");
            }



        });
    }
}
