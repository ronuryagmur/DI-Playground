package com.onur.diplayground

import android.util.Log
import retrofit2.Retrofit

class Repository() {
    companion object {
        const val TAG = "repository_class"
    }

    val retrofit = Retrofit.Builder().baseUrl("https://www.google.com").build()
    private val userDataFromLocal: UserDataFromLocal = UserDataFromLocal()
    private val userDataFromRemote: UserDataFromRemote = UserDataFromRemote(retrofit)
    fun getDataFromLocal() {
        Log.d(TAG, "data from local")
    }

    fun getDataFromRemote(): String {
        Log.d(TAG, "data from remote")
        return userDataFromRemote.getData()
    }
}