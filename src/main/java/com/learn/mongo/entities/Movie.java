package com.learn.mongo.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Data;

@Data
@Document
public class Movie {
    
    @Id
    private Long id;
    private String title;
    private String description;
    private Integer year;
    private Double rating;

}
