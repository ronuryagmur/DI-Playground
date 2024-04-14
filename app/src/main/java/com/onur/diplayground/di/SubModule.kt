package com.onur.diplayground.di

import com.onur.diplayground.Foo
import dagger.Module
import dagger.Provides

@Module
class SubModule {

    @Provides
    fun provideFoo(): Foo {
        return Foo()
    }
}