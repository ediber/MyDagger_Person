package com.e.mydagger_person

import android.app.Application
import com.e.mydagger_person.dagger.AppComponent
import com.e.mydagger_person.dagger.AppModule
import com.e.mydagger_person.dagger.DaggerAppComponent


class MyApplication: Application() {

    lateinit var myComponent: AppComponent


    override fun onCreate() {
        super.onCreate()
        myComponent = initDagger(this)
    }

    private fun initDagger(app: MyApplication): AppComponent =
        DaggerAppComponent.builder()
            .appModule(AppModule(app))
            .build()
}