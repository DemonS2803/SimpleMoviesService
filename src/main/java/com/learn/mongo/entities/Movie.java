package com.learn.mongo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("movies")
public class Movie {
    
    @Id
    private String id;
    private String title;
    private String description;
    private Integer year;
    private Double rating;

}
