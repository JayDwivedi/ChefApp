package com.lag.chefapplication

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class ChefBookingApp:Application(){
    override fun onCreate() {
        super.onCreate()
    }
}