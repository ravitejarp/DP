package com.ravi.structural.designpatterns.bridge.handson.anothercomposition;

public class BridgeDemo {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setGeners("Horror");
        movie.setYear("2017");
        movie.setRuntime("2:22:12");
        movie.setTitle("Ghost in you");

        Formatter prinrFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        System.out.println(moviePrinter.print(prinrFormatter));
        Formatter htmlFormatter = new HtmlFormatter();
        System.out.println(moviePrinter.print(htmlFormatter));
    }

}
