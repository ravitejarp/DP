package com.ravi.structural.designpatterns.bridge.handson.anothercomposition;

import java.util.List;

public class PrintFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(header);
        stringBuilder.append("\n");
        details.forEach(detail ->
                stringBuilder.append(detail.getLabel()).append(":").append(detail.getValue()).append("\n")
        );
        return stringBuilder.toString();
    }
}
