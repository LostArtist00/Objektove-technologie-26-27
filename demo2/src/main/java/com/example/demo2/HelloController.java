package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private TextField hodnota;
    @FXML private ComboBox<String> jednotka1;
    @FXML private ComboBox<String> jednotka2;
    @FXML private Label vysledok;

    @FXML private void initialize() {
        jednotka1.getItems().addAll("mg", "g", "kg", "t");
        jednotka2.getItems().addAll("mg", "g", "kg", "t");

        jednotka1.setValue("kg");
        jednotka2.setValue("g");
    }

    @FXML protected void preved() {
        double input = Double.parseDouble(hodnota.getText());
        double gramy = input;

        if (jednotka1.getValue().equals("mg")) {
            gramy = input / 1000;
        } else if (jednotka1.getValue().equals("kg")) {
            gramy = input * 1000;
        } else if (jednotka1.getValue().equals("t")) {
            gramy = input * 1000000;
        }
        double vysledokHodnota = gramy;

        if (jednotka2.getValue().equals("mg")) {
            vysledokHodnota = gramy * 1000;
        } else if (jednotka2.getValue().equals("kg")) {
            vysledokHodnota = gramy / 1000;
        } else if (jednotka2.getValue().equals("t")) {
            vysledokHodnota = gramy / 1000000;
        }
        vysledok.setText(String.format("%.2f %s", vysledokHodnota, jednotka2.getValue()));
    }
}