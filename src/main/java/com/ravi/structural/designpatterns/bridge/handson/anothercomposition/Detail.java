package com.ravi.structural.designpatterns.bridge.handson.anothercomposition;

public class Detail {
    private String label;
    private String value;

    Detail(String label, String value) {
        this.label = label;
        this.value = value;
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
