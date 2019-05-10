package com.example.demonewsapp;

public interface OnServerCallbackResponse<T> {
    void onSuccess(T response);

    void onFailure(String throwableStringMessage);
}

