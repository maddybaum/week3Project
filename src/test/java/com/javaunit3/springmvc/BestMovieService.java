package com.javaunit3.springmvc;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bestMovieService")
public class BestMovieService {

    private Movie movie;

    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie)
    {
        this.movie = movie;
    }

    public Movie getBestMovie() {
        return movie;
    }
}
