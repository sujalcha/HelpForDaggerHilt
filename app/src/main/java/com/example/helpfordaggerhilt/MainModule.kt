package com.example.helpfordaggerhilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    @ActivityScoped
    @Provides
    @Named("getValue1")
    fun provideValue1(
        @ApplicationContext context: Context,
        @Named("getValue2") getvalue2: String
    ) = "This is value 1 + $getvalue2 + ${context.getString(R.string.value3)}"
}