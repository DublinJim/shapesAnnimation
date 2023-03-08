package com.example.shapesannimation;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public AnchorPane rootPane;

    private static Circle getCircle() {
        Circle circle = new Circle(10.0, Paint.valueOf("#93291b"));
        circle.setStroke(Color.BLACK);
        circle.setLayoutX(150);
        circle.setLayoutY(100);
        return circle;
    }

    private static void rectAngleWidthBigger(Rectangle rectangle1) {
        ScaleTransition scaler = new ScaleTransition(Duration.seconds(2), rectangle1);

        double xfactor = scaler.getByX();
        double yfactor = scaler.getByY();


        scaler.setByX(2);
        scaler.setByY(2);

        scaler.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        Rectangle rectangle1 = new Rectangle(100, 50);
        rectangle1.setX(100);
        rectangle1.setY(50);
        rectangle1.setArcHeight(20);
        rectangle1.setArcWidth(20);
        rectangle1.setFill(Paint.valueOf("#5c7eb5"));


        Circle circle = getCircle();
        Circle circle2 = getCircle();

        circle2.setLayoutY(300);
        circle2.setFill(Color.AQUA);

        Circle circle1 = new Circle(10.0, Paint.valueOf("#93291b"));
        circle1.setLayoutX(250);
        circle1.setLayoutY(200);


        Circle newSphere = new Circle(50);

        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setNode(newSphere);
        translateTransition.setByX(300);
        translateTransition.setByY(200);
        translateTransition.setDuration(Duration.millis(2000));
        translateTransition.play();


        rootPane.getChildren().addAll(rectangle1, circle1, circle, circle2, newSphere);

        Button btn1 = new Button("Scale Rectangle");
        btn1.setLayoutX(100);
        btn1.setLayoutY(145);

        btn1.setOnAction(e -> rectAngleWidthBigger(rectangle1));
        rootPane.getChildren().addAll(btn1);


    }
}
