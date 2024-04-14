package com.onur.diplayground.di

import com.onur.diplayground.MainActivity
import com.onur.diplayground.MainActivity2
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity
    @ContributesAndroidInjector(modules = [SubModule::class])
    abstract fun mainActivity2(): MainActivity2
}