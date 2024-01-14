package com.lag.myapplication.data.remote

import com.lag.myapplication.model.ChefResponse
import com.lag.myapplication.model.Recipe
import com.lag.myapplication.utils.Constants
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.GET

interface ChefApiService {
    @GET("recipes")
    suspend fun getRecipes(): List<Recipe> // Replace Recipe with your data model
    @GET(Constants.RANDOM_URL)
    suspend fun getChef(): Response<ChefResponse>

}