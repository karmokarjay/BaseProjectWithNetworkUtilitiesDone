package com.example.demonewsapp.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.demonewsapp.Constants;
import com.example.demonewsapp.OnServerCallbackResponse;
import com.example.demonewsapp.R;
import com.example.demonewsapp.repositories.NewsOrgRepo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getHeadlines("us", Constants.API_KEY);

    }


    public void getHeadlines(String country, String apiKey) {
        NewsOrgRepo newsOrgRepo = new NewsOrgRepo();
        newsOrgRepo.getHeadlines(country, apiKey, new OnServerCallbackResponse() {
            @Override
            public void onSuccess(Object response) {

            }

            @Override
            public void onFailure(String throwableStringMessage) {

            }
        });
    }
}
