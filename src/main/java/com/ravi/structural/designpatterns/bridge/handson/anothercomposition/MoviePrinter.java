package com.ravi.structural.designpatterns.bridge.handson.anothercomposition;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

    private Movie movie;

    MoviePrinter(Movie movie) {
        this.movie = movie;
    }


    @Override
    protected String getHeader() {
        return movie.getGeners();
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> detailsList = new ArrayList<>();
        detailsList.add(new Detail("TITLE", movie.getTitle()));
        detailsList.add(new Detail("YEAR", movie.getYear()));
        detailsList.add(new Detail("RUNTIME", movie.getRuntime()));
        return detailsList;
    }
}
