module com.example.shapesannimation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shapesannimation to javafx.fxml;
    exports com.example.shapesannimation;
}