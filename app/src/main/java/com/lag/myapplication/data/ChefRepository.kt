package com.lag.myapplication.data

import com.lag.myapplication.data.remote.RemoteDataSource
import com.lag.myapplication.model.BaseApiResponse
import com.lag.myapplication.model.ChefResponse
import com.lag.myapplication.model.Recipe
import com.lag.myapplication.utils.NetworkResult
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

@ActivityRetainedScoped
class ChefRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseApiResponse() {

    suspend fun getChefs(): Flow<NetworkResult<ChefResponse>> {
        return flow<NetworkResult<ChefResponse>> {
            emit(safeApiCall { remoteDataSource.getChefs() })
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getRecipes(): Flow<List<Recipe>> {
        return flow<List<Recipe>> {  emit(remoteDataSource.getRecipes()) }
        .flowOn(Dispatchers.IO)
    }

}