package com.onur.diplayground

import retrofit2.Retrofit

class UserDataFromRemote(private val retrofit: Retrofit) {
    fun getData(): String {
        retrofit.callFactory()
        return "HELLOOOOO"
    }
}