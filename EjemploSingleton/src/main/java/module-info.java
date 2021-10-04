module com.example.singleton {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens com.example.singleton to javafx.fxml;
    exports com.example.singleton;
}