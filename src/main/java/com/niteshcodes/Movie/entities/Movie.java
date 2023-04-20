package com.niteshcodes.Movie.entities;

public class Movie {
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

    @Override
    public String toString() {
        return "Movie [title=" + title + ", rating=" + rating + ", overview=" + overview + ", releaseYear="
                + releaseYear + ", posterUrl=" + posterUrl + ", votes=" + votes + ", genre=" + genre + ", actor="
                + actor + ", director=" + director + ", language=" + language + "]";
    }


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


    // Getters and Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getOverview() {
        return overview;
    }
    public void setOverview(String overview) {
        this.overview = overview;
    }
    public String getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String getPosterUrl() {
        return posterUrl;
    }
    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }   
    public String getVotes() {
        return votes;
    }
    public void setVotes(String votes) {
        this.votes = votes;
    }

    public String getActor() {
        return actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
}
