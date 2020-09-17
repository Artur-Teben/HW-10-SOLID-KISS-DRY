package com.cursor.teben.patterns.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

@AllArgsConstructor
@Getter
public class Movie {
    private final String name;
    private final List<MovieGenre> genre;
    private final String country;
    private final Integer duration;
    private final Calendar premiereDate;
    private final Integer ageRestrictions;
    private final String language;
    private final BigDecimal budget;

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

    @NoArgsConstructor
    public static class Builder {
        private String name;
        private List<MovieGenre> genre;
        private String country;
        private Integer duration;
        private Calendar premiereDate;
        private Integer ageRestrictions;
        private String language;
        private BigDecimal budget;

        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildGenre(List<MovieGenre> genre) {
            this.genre = genre;
            return this;
        }

        public Builder buildCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder buildDuration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public Builder buildPremiereDate(GregorianCalendar premiereDate) {
            this.premiereDate = premiereDate;
            return this;
        }

        public Builder buildAgeRestrictions(Integer ageRestrictions) {
            this.ageRestrictions = ageRestrictions;
            return this;
        }

        public Builder buildLanguage(String language) {
            this.language = language;
            return this;
        }

        public Builder buildBudget(BigDecimal budget) {
            this.budget = budget;
            return this;
        }

        public Movie build() {
            return new Movie(name, genre, country, duration, premiereDate, ageRestrictions, language, budget);
        }
    }
}
