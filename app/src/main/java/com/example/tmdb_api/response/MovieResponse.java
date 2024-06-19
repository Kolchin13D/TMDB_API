package com.example.tmdb_api.response;

import com.example.tmdb_api.models.Movie;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MovieResponse {

    // finding movie object
    @SerializedName("results")
    @Expose()
    private Movie movie;

    public Movie getMovieModel(){
        return movie;
    }

    @Override
    public String toString() {
        return "MovieResponse{" +
                "movie=" + movie +
                '}';
    }
}
