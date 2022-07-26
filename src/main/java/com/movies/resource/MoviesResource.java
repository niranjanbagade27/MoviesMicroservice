package com.movies.resource;

import com.movies.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MoviesResource {

    @RequestMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") String movieId){
        return new Movie(movieId,"movieName");
    }

}
