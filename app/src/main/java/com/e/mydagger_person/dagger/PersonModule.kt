package com.e.mydagger_person.dagger

import com.e.mydagger_person.*
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PersonModule {

    @Singleton
    @Provides
    fun providePerson (computer: Computer, phone: MyPhone): IPerson = Person(computer, phone)

}