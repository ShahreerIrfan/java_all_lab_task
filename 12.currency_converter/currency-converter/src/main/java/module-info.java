module com.currency.converter.currencyconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.currency.converter.currencyconverter to javafx.fxml;
    exports com.currency.converter.currencyconverter;
}