package org.example.springbe.controller;

import org.example.springbe.dto.MovieDto;
import org.example.springbe.dto.MoviesDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= RequestMethod.GET)
public class MainController {
    @GetMapping("/")
    public MoviesDto hello() {
        MoviesDto movies = new MoviesDto();
        MovieDto movieDto = new
                MovieDto(1,"testMovie","https://54.180.79.104:8080/images/t1.png","summaryTest");
                List<MovieDto> moviesList = new ArrayList<>();
        moviesList.add(movieDto);
        movies.setMovies(moviesList);
        return movies;
    }
}