package com.example.tmdb_api.units;

import com.example.tmdb_api.models.Movie;
import com.example.tmdb_api.response.MovieSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApi {

    //  search movies
    @GET("movie/popular")
    Call<MovieSearchResponse> searchMovie(

            @Query("key") String key,
            @Query("language") String language,
            @Query("page") int page,
            @Query("region") String region

    );

}
