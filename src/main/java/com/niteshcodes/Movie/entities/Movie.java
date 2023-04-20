package com.niteshcodes.Movie.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@ToString
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String rating;
    private String overview;
    private String releaseYear;
    private String posterUrl;
    private String votes; 
    private String genre;
    private String actor;
    private String director;
    private String language;



    // Constructor
    public Movie(String title, String overview, String releaseYear, String posterUrl,String rating, String votes, String genre, String director, String actor, String language) {
        this.title = title;
        this.overview = overview;
        this.releaseYear = releaseYear;
        this.posterUrl = posterUrl;
        this.rating = rating;
        this.votes = votes;
        this.genre = genre;
        this.director = director;
        this.actor = actor;
        this.language = language;
    }

}
