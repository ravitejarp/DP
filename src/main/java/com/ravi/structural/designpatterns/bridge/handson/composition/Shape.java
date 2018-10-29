package com.ravi.structural.designpatterns.bridge.handson.composition;

public abstract class Shape {
    Color color;

    Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();

}
