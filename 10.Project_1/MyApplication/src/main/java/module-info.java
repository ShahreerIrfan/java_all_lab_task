module com.msisoftwares.myapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.msisoftwares.myapplication to javafx.fxml;
    exports com.msisoftwares.myapplication;
}