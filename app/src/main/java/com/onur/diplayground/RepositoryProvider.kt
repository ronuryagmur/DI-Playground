package com.onur.diplayground

import retrofit2.Retrofit

class RepositoryProvider {
    private val retrofit = Retrofit.Builder().baseUrl("https://www.google.com").build()
    private val userDataFromLocal = UserDataFromLocal()
    private val userDataFromRemote = UserDataFromRemote(retrofit)
    val repository = Repository(userDataFromLocal, userDataFromRemote)
}