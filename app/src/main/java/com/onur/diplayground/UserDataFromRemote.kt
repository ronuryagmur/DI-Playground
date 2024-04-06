package com.onur.diplayground

import retrofit2.Retrofit

class UserDataFromRemote(private val retrofit: Retrofit) {
    fun getData() {
        retrofit.callFactory()
    }
}