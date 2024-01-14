package com.lag.myapplication.model

import com.google.gson.annotations.SerializedName

data class ChefResponse(
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: String
)
