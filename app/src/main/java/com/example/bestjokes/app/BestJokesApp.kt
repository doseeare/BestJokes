package com.example.bestjokes.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BestJokesApp : Application() {
	
	override fun onCreate() {
		super.onCreate()
	}
	
}