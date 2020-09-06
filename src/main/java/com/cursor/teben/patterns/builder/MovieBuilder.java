package com.cursor.teben.patterns.builder;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

@Getter
public class MovieBuilder {
    private String name;
    private List<MovieGenre> genre;
    private String country;
    private Integer duration;
    private Calendar premiereDate;
    private Integer ageRestrictions;
    private String language;
    private BigDecimal budget;

    public MovieBuilder buildName(final String name) {
        this.name = name;
        return this;
    }

    public MovieBuilder buildGenre(final List<MovieGenre> genre) {
        this.genre = genre;
        return this;
    }

    public MovieBuilder buildCountry(final String country) {
        this.country = country;
        return this;
    }

    public MovieBuilder buildDuration(final Integer duration) {
        this.duration = duration;
        return this;
    }

    public MovieBuilder buildPremiereDate(final GregorianCalendar premiereDate) {
        this.premiereDate = premiereDate;
        return this;
    }

    public MovieBuilder buildAgeRestrictions(final Integer ageRestrictions) {
        this.ageRestrictions = ageRestrictions;
        return this;
    }

    public MovieBuilder buildLanguage(final String language) {
        this.language = language;
        return this;
    }

    public MovieBuilder buildBudget(final BigDecimal budget) {
        this.budget = budget;
        return this;
    }

    public Movie build() {
        return new Movie(this);
    }
}
