package com.cursor.teben.patterns.builder;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class Movie {
    private final String name;
    private final List<MovieGenre> genre;
    private final String country;
    private final Integer duration;
    private final Calendar premiereDate;
    private final Integer ageRestrictions;
    private final String language;
    private final BigDecimal budget;

    Movie(final MovieBuilder movieBuilder) {
        this.name = movieBuilder.getName();
        this.genre = movieBuilder.getGenre();
        this.country = movieBuilder.getCountry();
        this.duration = movieBuilder.getDuration();
        this.premiereDate = movieBuilder.getPremiereDate();
        this.ageRestrictions = movieBuilder.getAgeRestrictions();
        this.language = movieBuilder.getLanguage();
        this.budget = movieBuilder.getBudget();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", country='" + country + '\'' +
                ", duration=" + duration + "min" +
                ", premiereDate=" + premiereDate.getTime() +
                ", ageRestrictions=" + ageRestrictions + "+" +
                ", language='" + language + '\'' +
                ", budget=" + budget + "million" +
                '}';
    }
}
