package com.onur.diplayground

import retrofit2.Retrofit
import javax.inject.Inject

class UserDataFromRemote @Inject constructor(private val retrofit: Retrofit) {
    fun getData(): String {
        retrofit.callFactory()
        return "HELLOOOOO"
    }
}