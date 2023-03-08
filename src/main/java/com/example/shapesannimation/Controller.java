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
        Rectangle rectangle = new Rectangle(100,50,Paint.valueOf("#5c7eb5"));
        rectangle.setX(100);
        rectangle.setY(50);
        rectangle.setArcHeight(20);
        rectangle.setArcWidth(20);
        rootPane.getChildren().add(rectangle);
    }
}
