package com.e.mydagger_person.dagger

import com.e.mydagger_person.MainActivity
import com.e.mydagger_person.MainActivity2
import dagger.Component
import javax.inject.Singleton


    @Singleton
    @Component(modules = [
        InternetModule::class,
    ComputerModule::class,
    PersonModule::class,
    AppModule::class,
    PhoneModule::class
       ])

    interface AppComponent{
        fun inject(target: MainActivity)

        fun inject(target: MainActivity2)

    }
