package com.example.simpleredditapigrabber

import com.example.simpleredditapigrabber.model.Children
import com.google.gson.annotations.SerializedName

class Data(@SerializedName("modhash") var modhash: String, @SerializedName("children") var children: ArrayList<Children>) {
}