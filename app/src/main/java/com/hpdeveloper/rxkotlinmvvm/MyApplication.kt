package com.hpdeveloper.rxkotlinmvvm

import android.app.Application
import com.hpdeveloper.rxkotlinmvvm.di.component.AppComponent
import com.hpdeveloper.rxkotlinmvvm.di.component.DaggerAppComponent

/**
 * Created by hirenpatel on 17/10/17.
 */
class MyApplication : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

//    companion object {
////        private lateinit var retrofit: Retrofit
////        private lateinit var androidOSViewModel: AndroidOSViewModel
////        private lateinit var getAndroidOS: GetAndroidOS
////
////        fun injectAndroidOSModule() = androidOSViewModel
//        private lateinit var appComponent: AppComponent
//        fun injectAppComponent() = appComponent
//    }


    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
                .build()

//        retrofit = Retrofit.Builder()
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .baseUrl("https://api.learn2crack.com/")
//                .build()
//
//        getAndroidOS = retrofit.create(GetAndroidOS::class.java)
//
//        androidOSViewModel = AndroidOSViewModel(getAndroidOS);
    }

}