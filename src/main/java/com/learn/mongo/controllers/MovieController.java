package com.learn.mongo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.mongo.entities.Movie;
import com.learn.mongo.services.MovieService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/movies")
public class MovieController {
  
    @Autowired
    private MovieService movieService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllMovies() {
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<?> addMovie(@RequestBody @Validated Movie movie) {
        movieService.saveMovie(movie);
        return new ResponseEntity(HttpStatus.OK);
    }
}
