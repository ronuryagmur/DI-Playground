package com.onur.diplayground

import android.app.Application

class App: Application() {
    val provider = RepositoryProvider()

    val viewModelFactory = ViewModelFactory(provider.repository)
}

interface Factory<T> {
    fun create(): T
}

class ViewModelFactory(private val repository: Repository): Factory<MyViewModel> {
    override fun create(): MyViewModel {
        return MyViewModel(repository)
    }
}