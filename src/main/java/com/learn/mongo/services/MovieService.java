package com.learn.mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.learn.mongo.dao.MovieDAO;
import com.learn.mongo.entities.Movie;
import com.learn.mongo.repositories.MovieRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MovieService {
    
    @Autowired
    private MovieDAO movieDAO;

    public List<Movie> getAllMovies() {
        log.info("got all movies");
        return movieDAO.getAll();
    }

    public void saveMovie(Movie movie) {
        try {
            movieDAO.saveNew(movie);
            log.info("success saving movie ");
        } catch (Exception e) {
            log.error("error saving movie ", e);
            throw e;
        }
    }


}
