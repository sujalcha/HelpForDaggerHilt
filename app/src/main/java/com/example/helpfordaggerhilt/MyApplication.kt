package com.example.helpfordaggerhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//creating annotation for hiltandroidapp for starting dependency injection
//this also helps to get context for views and activities
//created activity should be included in manifest

@HiltAndroidApp
class MyApplication : Application()