package com.example.shapesannimation;

import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public AnchorPane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Rectangle rectangle1 = new Rectangle(100,50);
        rectangle1.setX(100);
        rectangle1.setY(50);
        rectangle1.setArcHeight(20);
        rectangle1.setArcWidth(20);
        rectangle1.setFill(Paint.valueOf("#5c7eb5"));





        rootPane.getChildren().add(rectangle1);
    }
}
