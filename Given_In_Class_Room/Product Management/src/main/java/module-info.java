module bd.edu.seu.productmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens bd.edu.seu.productmanagement to javafx.fxml;
    exports bd.edu.seu.productmanagement;
}