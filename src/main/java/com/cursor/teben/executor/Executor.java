package com.cursor.teben.executor;

import com.cursor.teben.patterns.builder.Movie;
import com.cursor.teben.patterns.builder.MovieBuilder;
import com.cursor.teben.patterns.builder.MovieGenre;
import com.cursor.teben.patterns.singleton.SingletonExample;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Executor {
    public void run() {
        Movie movie = new MovieBuilder()
                .buildName("Jurassic park")
                .buildGenre(List.of(MovieGenre.ADVENTURE, MovieGenre.FANTASY))
                .buildCountry("United States")
                .buildDuration(126)
                .buildPremiereDate(new GregorianCalendar(1993, Calendar.JUNE, 9))
                .buildAgeRestrictions(6)
                .buildLanguage("English")
                .buildBudget(new BigDecimal("63"))
                .build();

        System.out.println("\t\t\tPATTERN BUILDER");
        System.out.println(movie);

        System.out.println("\n\t\t\tPATTERN SINGLETON");
        SingletonExample obj1 = SingletonExample.getInstance();
        obj1.showMessage();
        obj1.expandMessage(" in the entire world!");

        SingletonExample obj2 = SingletonExample.getInstance();
        obj2.showMessage();


    }
}
