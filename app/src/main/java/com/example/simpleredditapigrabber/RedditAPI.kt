package com.example.simpleredditapigrabber

import retrofit2.Call
import retrofit2.http.GET

interface RedditAPI {

    companion object {
        val url = "https://www.reddit.com/"
    }

    //@Headers("Content-Type: application/json")
    @GET(".json")
    fun getData(): Call<Feed>
}