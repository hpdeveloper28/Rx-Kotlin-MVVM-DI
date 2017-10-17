package com.hpdeveloper.rxkotlinmvvm.api

import com.hpdeveloper.rxkotlinmvvm.model.AndroidOS
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by hirenpatel on 17/10/17.
 */
interface GetAndroidOS {

    @GET("android/jsonarray")
    fun getAndroidOS() : Observable<List<AndroidOS>>
}