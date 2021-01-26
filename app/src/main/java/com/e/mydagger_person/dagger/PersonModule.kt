package com.e.mydagger_person.dagger

import com.e.mydagger_person.Computer
import com.e.mydagger_person.IPerson
import com.e.mydagger_person.Person
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PersonModule {

    @Singleton
    @Provides
    fun providePerson (computer: Computer): IPerson = Person(computer)

}