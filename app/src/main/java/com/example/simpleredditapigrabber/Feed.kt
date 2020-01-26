package com.example.simpleredditapigrabber

import com.google.gson.annotations.SerializedName

class Feed(@SerializedName("kind") var kind: String, @SerializedName("data") var data: Data) {
    override fun toString(): String {
        return "Feed(kind='$kind')\nData: $data"
    }
}