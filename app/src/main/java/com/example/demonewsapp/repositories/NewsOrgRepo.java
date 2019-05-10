package com.example.demonewsapp.repositories;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.demonewsapp.OnServerCallbackResponse;
import com.example.demonewsapp.RetrofitConfiguration;
import com.example.demonewsapp.models.TopHeadLinesBaseModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsOrgRepo {

    private NewsOrgApi newsOrgApi = RetrofitConfiguration.getClient().create(NewsOrgApi.class);

    public void getHeadlines(String country, String apiKey, final OnServerCallbackResponse callbackResponse) {
        Call<TopHeadLinesBaseModel> call = newsOrgApi.getTopHeadlines(country, apiKey);
        call.enqueue(new Callback<TopHeadLinesBaseModel>() {
            @Override
            public void onResponse(@NonNull Call<TopHeadLinesBaseModel> call, @NonNull Response<TopHeadLinesBaseModel> response) {
                callbackResponse.onSuccess(response);
            }

            @Override
            public void onFailure(@NonNull Call<TopHeadLinesBaseModel> call, @NonNull Throwable t) {
                callbackResponse.onFailure(t.getMessage());
                Log.d("NewsRepoError: ", t.getMessage());
            }
        });
    }

}
