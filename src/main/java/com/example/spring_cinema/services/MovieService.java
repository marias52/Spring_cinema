package com.example.spring_cinema.services;

import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public MovieService() {

    }

    public Optional<Movie> getMovieById(long id) {
        return movieRepository.findById(id);
    }

    public List<Movie> retrieveList() {
//        returns the movie list ;
        return movieRepository.findAll();
    }

    public Movie addNewMovie(Movie movie) {
// adds the movies to the existing list
        movieRepository.save(movie);
        return movie;
    }
}
