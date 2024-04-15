package com.onur.diplayground

import android.util.Log

class MyViewModel() {

    private val repository = Repository()
    fun print() {
        Log.d("onurTag",repository.getDataFromRemote())
    }
}