package com.currency.converter.currencyconverter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CurrencyConverterController {
    @FXML
    TextField amountField;

    @FXML
    Label outputLavel;

    @FXML
    public void converter(){
        double usdAmount = Double.parseDouble(amountField.getText());
        double bdAmount = usdAmount * 110;
        outputLavel.setText(usdAmount+" USD = "+bdAmount+" BDT");
    }
}
// ........