package com.hpdeveloper.rxkotlinmvvm.di.module

import com.hpdeveloper.rxkotlinmvvm.api.GetAndroidOS
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by hirenpatel on 17/10/17.
 */
@Module
class GetAndroidOSModule @Inject constructor(){

    @Provides
    @Singleton
    internal fun getAndroidOS(retrofit: Retrofit): GetAndroidOS {
        return retrofit.create<GetAndroidOS>(GetAndroidOS::class.java)
    }

}