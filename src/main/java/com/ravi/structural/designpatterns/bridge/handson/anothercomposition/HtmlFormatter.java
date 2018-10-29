package com.ravi.structural.designpatterns.bridge.handson.anothercomposition;

import java.util.List;

public class HtmlFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<table>");
        stringBuilder.append("<th>").append("Geners").append("</th>").append("<th>").append(header).append("</th>");

        details.forEach(detail ->
                stringBuilder.append("<tr><td>").append(detail.getLabel()).append("</td><td>").append(detail.getValue()).append("</td></tr>")
        );
        stringBuilder.append("</table>");
        return stringBuilder.toString();
    }
}
