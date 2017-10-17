package com.hpdeveloper.rxkotlinmvvm.di.component

import com.hpdeveloper.rxkotlinmvvm.activity.MainActivity
import com.hpdeveloper.rxkotlinmvvm.di.module.GetAndroidOSModule
import com.hpdeveloper.rxkotlinmvvm.di.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by hirenpatel on 17/10/17.
 */
@Singleton
@Component(modules = arrayOf(GetAndroidOSModule::class, NetworkModule::class))
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}