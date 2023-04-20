package com.niteshcodes.Movie.services;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.niteshcodes.Movie.entities.Movie;
import com.niteshcodes.Movie.repository.MainRepository;



@Service
public class MovieService{
    private final RestTemplate restTemplate = new RestTemplate();

    // List<Movie> movies = new ArrayList<>(); 

    Movie movie;

    @Autowired
    private MainRepository repository;

    public Movie getMovieByName(String title) throws IOException{
        String requesturl = "https://www.omdbapi.com/?apikey=db4fd391&t="+title;
        ResponseEntity<String> response = restTemplate.getForEntity(requesturl, String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree(response.getBody());

        try{
            String movietitle = json.get("Title").asText();
            String releseYear = json.get("Released").asText();
            String posterUrl = json.get("Poster").asText();
            String rating = json.get("imdbRating").asText();
            String description = json.get("Plot").asText();
            String votes = json.get("imdbVotes").asText();
            String genre = json.get("Genre").asText();
            String director = json.get("Director").asText();
            String actor = json.get("Actors").asText();
            String language = json.get("Language").asText();
            if(posterUrl.equals("N/A")){
                posterUrl="https://img.freepik.com/free-vector/hand-drawn-404-error_23-2147735153.jpg?w=740&t=st=1674586610~exp=1674587210~hmac=9f51d9169e3b17739a0dea1e4726de76eef146ce6dbc5f37967ed3efcc9c5100";
            }
            movie = new Movie(movietitle, description, releseYear, posterUrl,rating, votes,genre,director,actor,language);
        }
        catch(Exception e){
            movie = new Movie("Not Found Please Enter Correct Keyword", "N/A", "N/A", "https://img.freepik.com/free-vector/hand-drawn-404-error_23-2147735153.jpg?w=740&t=st=1674586610~exp=1674587210~hmac=9f51d9169e3b17739a0dea1e4726de76eef146ce6dbc5f37967ed3efcc9c5100", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A");
        }

        return movie;
    }

    public Movie addFavourite(){
        Movie saved = repository.save(movie);
        return saved;
    }


    // extracting url from database

    public Set<Movie> extractingUrl(){
        Set<Movie> urls = new LinkedHashSet<>();
        for(Movie movie : repository.findAll()){
            urls.add(movie);
        }
        return urls;
    }

}
