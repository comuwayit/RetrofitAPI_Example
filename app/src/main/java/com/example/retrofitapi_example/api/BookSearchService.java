package com.example.retrofitapi_example.api;

import com.example.retrofitapi_example.models.VolumesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public abstract class BookSearchService {
    @GET("/books/v1/volumes")
    public abstract Call<VolumesResponse> searchVolumes(
            @Query("q") String query,
            @Query("inauthor") String author
    );
}
