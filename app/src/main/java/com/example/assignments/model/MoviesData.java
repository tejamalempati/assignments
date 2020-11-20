package com.example.assignments.model;

public class MoviesData {
    String movieName;
    String movieRating;
    String movieDescription;
    Integer movieImage;

    public MoviesData(String movieName, String movieRating, String movieDescription, Integer movieImage) {

        this.movieName = movieName;
        this.movieRating = movieRating;
        this.movieDescription = movieDescription;
        this.movieImage = movieImage;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public Integer getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(Integer movieImage) {
        this.movieImage = movieImage;
    }
}
