package com.e.mydagger_person.dagger

import com.e.mydagger_person.Gmail
import com.e.mydagger_person.MyInternet
import com.e.mydagger_person.MyPhone
import com.e.mydagger_person.SimCard
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PhoneModule {

    @Singleton
    @Provides
    fun provideSimCard() = SimCard()

    @Singleton
    @Provides
    fun provideGmail() = Gmail()

    @Singleton
    @Provides
    fun providePhone(simCard: SimCard, gmail: Gmail, internet: MyInternet) =
            MyPhone(simCard, gmail, internet)
}