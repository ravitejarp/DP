package com.ravi.structural.designpatterns.bridge.handson.anothercomposition;

import java.util.List;

public interface Formatter {
    String format(String header,List<Detail> details);
}
