package com.onur.diplayground

import android.app.Application
import com.onur.diplayground.di.AppComponent
import com.onur.diplayground.di.AppModule
import com.onur.diplayground.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}