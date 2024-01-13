package com.lag.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ChefViewModel @Inject constructor(
    // Inject dependencies here
) : ViewModel() {
    // Your ViewModel logic here
}