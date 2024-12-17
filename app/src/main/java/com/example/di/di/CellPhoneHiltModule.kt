package com.example.di.di

import com.example.di.cellphone.Memory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
class CellPhoneHiltModule {

    @ActivityScoped
    @Provides
    fun providesMemory(): Memory {
        return Memory()
    }

}