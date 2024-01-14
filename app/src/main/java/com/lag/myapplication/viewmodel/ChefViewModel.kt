package com.lag.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lag.myapplication.data.ChefRepository
import com.lag.myapplication.data.remote.ChefApiService
import com.lag.myapplication.model.ChefResponse
import com.lag.myapplication.model.Recipe
import com.lag.myapplication.utils.NetworkResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ChefViewModel @Inject constructor(
    private val repository: ChefRepository
) : ViewModel() {

    private val _recipes = MutableLiveData<List<Recipe>>()
    val recipes: LiveData<List<Recipe>> get() = _recipes

    private val _chefResponse: MutableLiveData<NetworkResult<ChefResponse>> = MutableLiveData()
    val chefResponse: LiveData<NetworkResult<ChefResponse>> = _chefResponse
    fun loadRecipes()
    {
        // Load recipes when ViewModel is created
//        viewModelScope.launch {
//            try {
//                val recipes = chefApiService.getRecipes()
//                _recipes.value = recipes
//            } catch (e: Exception) {
//                // Handle error
//            }
//        }
    }
    fun fetchChefResponse() = viewModelScope.launch {
        repository.getChefs().collect { values ->
            _chefResponse.value = values
        }
    }
}
