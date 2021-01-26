package com.e.mydagger_person.dagger

import com.e.mydagger_person.MyInternet
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InternetModule {

    @Provides
    @Singleton
    fun provideInternet() = MyInternet()
}