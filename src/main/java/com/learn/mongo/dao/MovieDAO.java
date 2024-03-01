package com.learn.mongo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.learn.mongo.entities.Movie;

@Component
public class MovieDAO {
    

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Movie> getAll() {
        return mongoTemplate.findAll(Movie.class);
    }

    public void saveNew(Movie movie) {
        mongoTemplate.save(movie);
    }
}
