package com.ericthecoder.hiltpractice.di.module

import com.ericthecoder.hiltpractice.repository.DogsRepository
import com.ericthecoder.hiltpractice.repository.DogsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideDogsRepository(): DogsRepository = DogsRepositoryImpl()
}
