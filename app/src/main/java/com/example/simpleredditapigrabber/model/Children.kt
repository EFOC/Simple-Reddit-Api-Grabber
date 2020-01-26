package com.example.simpleredditapigrabber.model

import com.google.gson.annotations.SerializedName

class Children(@SerializedName("kind") var kind: String, @SerializedName("data") var data: Data) {
}