package com.example.demonewsapp.repositories;

import com.example.demonewsapp.models.TopHeadLinesBaseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsOrgApi {

    @GET("v2/top-headlines")
    Call<TopHeadLinesBaseModel> getTopHeadlines(@Query("country") String country, @Query("apiKey") String apiKey);
}
