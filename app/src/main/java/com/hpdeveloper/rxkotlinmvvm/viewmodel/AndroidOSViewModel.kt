package com.hpdeveloper.rxkotlinmvvm.viewmodel

import com.hpdeveloper.rxkotlinmvvm.api.GetAndroidOS
import com.hpdeveloper.rxkotlinmvvm.model.AndroidOS
import io.reactivex.Observable

/**
 * Created by hirenpatel on 17/10/17.
 */
class AndroidOSViewModel (val getAndroidOS: GetAndroidOS){

    fun getAndroidOS(): Observable<List<AndroidOS>> {
        return getAndroidOS.getAndroidOS()
    }
}