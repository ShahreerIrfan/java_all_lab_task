package bd.edu.seu.productmanagement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField idField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField priceField;

    @FXML
    private Label outputLabel;

    @FXML
    public void saveToFile() throws IOException {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        double price = Double.parseDouble(priceField.getText());

        Product product = new Product(id, name, price);
        product.writeToFile();
        
        idField.setText("");
        nameField.setText("");
        priceField.setText("");

        double priceAverage = product.getPriceAverage();

        outputLabel.setText("Successfully Saved! Price Average: " + priceAverage);
    }

}