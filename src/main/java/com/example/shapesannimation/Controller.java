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
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private static boolean isScaled;
    private static Button btn1;
    public AnchorPane rootPane;

    ////////////////////////////////////methods////////////////////////////////////
    private static Circle getCircle() {
        Circle circle = new Circle(10.0, Paint.valueOf("#93291b"));
        circle.setStroke(Color.BLACK);
        Random random = new Random();
        int newPos = random.nextInt(400);
        circle.setLayoutX(newPos);
        circle.setLayoutY(newPos);
        return circle;

    }

    private static void rectAngleWidthBigger(Rectangle rectangle1) {
        ScaleTransition scaler = new ScaleTransition(Duration.seconds(2), rectangle1);

        if (!isScaled) {//if scaled is NOT true
            scaler.setByX(2);
            scaler.setByY(2);
        }

        scaler.play();
        isScaled = true;
        btn1.setText("Change color");

        btn1.setOnAction(e -> {
            rectangle1.setFill(Color.CORAL);
            btn1.setDisable(true);
        });
    }

    private static void moveCircle(Circle newSphere) {
        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setNode(newSphere);
        translateTransition.setByX(450);
        translateTransition.setByY(500);
        translateTransition.setDuration(Duration.millis(2000));

        translateTransition.play();
    }

    ////////////////////////////////////methods end////////////////////////////////////
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn1 = new Button("Scale");
        btn1.setPrefWidth(150.0);

        Rectangle rectangle1 = new Rectangle(100, 50);
        rectangle1.setX(100);
        rectangle1.setY(50);
        rectangle1.setArcHeight(20);
        rectangle1.setArcWidth(20);
        rectangle1.setFill(Paint.valueOf("#5c7eb5"));
        rectangle1.setStroke(Color.BLACK);


        Circle circleInRectangle = getCircle();
        Circle circle2 = getCircle();

        circle2.setLayoutY(300);
        circle2.setFill(Color.AQUA);

        Circle circle1 = new Circle(10.0, Paint.valueOf("#93291b"));
        circle1.setLayoutX(250);
        circle1.setLayoutY(200);


        Circle newSphere = new Circle(50);

        moveCircle(newSphere);

        newSphere.setFill(Color.CORNSILK);
        newSphere.setStroke(Color.BLACK);


        rootPane.getChildren().addAll(rectangle1, circle1, circleInRectangle, circle2, newSphere);


        btn1.setText("Scale Rectangle");
        btn1.setLayoutX(60);
        btn1.setLayoutY(200);

        btn1.setOnAction(e -> rectAngleWidthBigger(rectangle1));
        rootPane.getChildren().addAll(btn1);


    }
}
