package com.onur.diplayground

import android.util.Log

class Repository(private val userDataFromLocal: UserDataFromLocal,
                    private val userDataFromRemote: UserDataFromRemote) {
    companion object {
        const val TAG = "repository_class"
    }
    fun getDataFromLocal() {
        Log.d(TAG, "data from local")
    }

    fun getDataFromRemote(): String {
        Log.d(TAG, "data from remote")
        return userDataFromRemote.getData()
    }
}