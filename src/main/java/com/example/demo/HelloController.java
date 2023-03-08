package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController {
    public CheckBox checkID;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("vhwvijer!");
        welcomeText.setVisible(checkID.isSelected());

    }

    public void onFakeButton() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Я ЗВОНЮ В ПОЛИЦИЮ ГРЯЗНЫЙ ИЗВРАЩЕНЕЦ");
        alert.show();
        alert.setTitle("GJY");
        alert.setHeaderText("А ГДЕ ЙУПИ ЙО");
    }


}