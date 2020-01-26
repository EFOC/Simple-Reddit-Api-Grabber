package com.example.simpleredditapigrabber

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.simpleredditapigrabber.model.Children
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://www.reddit.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val apiCall: RedditAPI = retrofit.create(RedditAPI::class.java)
        val call: Call<Feed> = apiCall.getData()
        call.enqueue(object: Callback<Feed> {
            override fun onFailure(call: Call<Feed>?, t: Throwable?) {
                Log.d("TEST", "error: " + t.toString())
            }

            override fun onResponse(call: Call<Feed>?, response: Response<Feed>?) {
                Log.d("TEST", "Success: " + response?.body().toString())
                val childList: ArrayList<Children> = response!!.body().data.children
                for(child in childList) {
                    Log.d("TEST", child.data.subreddit)
                }
            }
        })
    }
}