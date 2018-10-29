package com.ravi.structural.designpatterns.bridge.handson.composition;

public class BridgeDemoCheck {
    public static void main(String[] args) {
        Color blue = new Blue();
        Shape square = new Square(blue);
        square.applyColor();

        Color green = new Green();
        Shape circle = new Circle(green);

        circle.applyColor();
    }

}
