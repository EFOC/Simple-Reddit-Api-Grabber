package com.example.simpleredditapigrabber.model

import com.google.gson.annotations.SerializedName

class Data(@SerializedName("subreddit") var subreddit: String)