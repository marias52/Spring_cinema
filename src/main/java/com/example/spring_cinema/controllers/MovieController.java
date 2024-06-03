package com.example.spring_cinema.controllers;

import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Movie> getMovie(@PathVariable long id) {
//
//        Optional<Movie> movies = movieService.getMovieById(id);
//
//        if (movies.isEmpty()) {
//           return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
//        } else return new ResponseEntity<>(movies.get(), HttpStatus.OK);
//
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Movie>> getMovieList() {
//        List<Movie> movies = movieService.retrieveList();
//        return new ResponseEntity<>(movies, HttpStatus.CREATED);
//    }
//
//    @PostMapping
//    public ResponseEntity<Movie> newMovie(@RequestBody Movie newMovie) {
//        Movie movie = movieService.addNewMovie(newMovie);
//        return new ResponseEntity<>(movie, HttpStatus.CREATED);
//    }



//    Add functionality to update a movie in the database
    @PatchMapping
    public ResponseEntity<Movie>updateAMovie(@RequestBody Movie updatedMovie, @PathVariable long id){
        Optional<Movie> existingMovie = movieService.getMovieById(id);
            existingMovie.setDuration(movie.getDuration());
            existingMovie.setRating(movie.getRating());
            Movie upDatedMovie = movieService.save(existingMovie);
            return new ResponseEntity<>(upDatedMovie, HttpStatus.OK);
        }
    }

//    Add functionality to delete a movie from the database
    @DeleteMapping
    public ResponseEntity<Movie>updateAMovie(@RequestBody Movie movie, @PathVariable long id){

    }
}