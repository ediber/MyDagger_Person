package com.e.mydagger_person.dagger

import com.e.mydagger_person.Computer
import com.e.mydagger_person.MyInternet
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ComputerModule {

    @Provides
    @Singleton
    fun provideComputer(internet: MyInternet) = Computer(internet)
}