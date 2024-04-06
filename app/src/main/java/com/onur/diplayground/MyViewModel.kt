package com.onur.diplayground

import android.util.Log
import javax.inject.Inject

class MyViewModel @Inject constructor(private val repository: Repository) {
    fun print() {
        Log.d("onurTag",repository.getDataFromRemote())
    }
}