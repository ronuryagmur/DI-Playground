package com.onur.diplayground.di

import com.onur.diplayground.MyViewModel
import com.onur.diplayground.Repository
import com.onur.diplayground.UserDataFromLocal
import com.onur.diplayground.UserDataFromRemote
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    fun provideMyViewModel(repository: Repository): MyViewModel {
        return MyViewModel(repository)
    }

    @Provides
    fun provideRepository(userDataFromLocal: UserDataFromLocal, userDataFromRemote: UserDataFromRemote): Repository {
        return Repository(userDataFromLocal, userDataFromRemote)
    }

    @Provides
    fun provideUserDataFromRemote(retrofit: Retrofit): UserDataFromRemote {
        return UserDataFromRemote(retrofit)
    }

    @Provides
    fun provideUserDataFromLocal(): UserDataFromLocal {
        return UserDataFromLocal()
    }

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://www.google.com").build()
    }
}