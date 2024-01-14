package com.lag.chefapplication.data.remote

import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val chefService: ChefApiService) {

    suspend fun getChefs() =
        chefService.getChef()
    suspend fun getRecipes() =
        chefService.getRecipes()

}