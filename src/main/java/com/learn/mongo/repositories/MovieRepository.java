package com.learn.mongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.learn.mongo.entities.Movie;

public interface MovieRepository extends MongoRepository<Movie, String>{

    // @Query("{}")
    // List<Movie> findAllMovies();
 
    public long count();
}
