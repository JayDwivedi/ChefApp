package com.lag.chefapplication.model

import com.google.gson.annotations.SerializedName

data class ChefResponse(
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: String
)
