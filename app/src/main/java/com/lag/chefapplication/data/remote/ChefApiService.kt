package com.lag.chefapplication.data.remote

import com.lag.chefapplication.model.ChefResponse
import com.lag.chefapplication.model.Recipe
import com.lag.chefapplication.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface ChefApiService {
    @GET("recipes")
    suspend fun getRecipes(): List<Recipe> // Replace Recipe with your data model
    @GET(Constants.RANDOM_URL)
    suspend fun getChef(): Response<ChefResponse>

}