package com.hpdeveloper.rxkotlinmvvm.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.hpdeveloper.rxkotlinmvvm.MyApplication
import com.hpdeveloper.rxkotlinmvvm.R
import com.hpdeveloper.rxkotlinmvvm.api.GetAndroidOS
import com.hpdeveloper.rxkotlinmvvm.model.AndroidOS
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

//    val androidOSViewModel = MyApplication.injectAndroidOSModule()

    val subscriptions = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyApplication.appComponent.inject(this)

        subscriptions.add(getAndroidOSModule.getAndroidOS().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe({
            displayAndroidOSOnUI(it)
        }, {
            Toast.makeText(this, "Error occured", Toast.LENGTH_SHORT).show()
        }))

    }

    @Inject lateinit var getAndroidOSModule: GetAndroidOS

    private fun displayAndroidOSOnUI(it: List<AndroidOS>) {
        for (androidOS in it) {
            Log.e("OS Name", androidOS.name)
        }
    }


    override fun onStop() {
        super.onStop()
        subscriptions.clear()
    }
}
