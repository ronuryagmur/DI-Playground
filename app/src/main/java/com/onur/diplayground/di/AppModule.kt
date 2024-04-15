package com.onur.diplayground.di

import com.onur.diplayground.MyViewModel
import com.onur.diplayground.Repository
import com.onur.diplayground.UserDataFromLocal
import com.onur.diplayground.UserDataFromRemote
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideMyViewModel(repository: Repository): MyViewModel {
        return MyViewModel(repository)
    }

    @Provides
    @Singleton
    fun provideRepository(userDataFromLocal: UserDataFromLocal, userDataFromRemote: UserDataFromRemote): Repository {
        return Repository(userDataFromLocal, userDataFromRemote)
    }

    @Provides
    @Singleton
    fun provideUserDataFromRemote(retrofit: Retrofit): UserDataFromRemote {
        return UserDataFromRemote(retrofit)
    }

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://www.google.com").build()
    }
}