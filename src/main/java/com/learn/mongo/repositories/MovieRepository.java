package com.learn.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.learn.mongo.entities.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, Long>{

    
    
}
