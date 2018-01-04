package com.theandroiddev.restfool

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import timber.log.Timber

/**
 * Created by jakub on 04.01.18.
 */
open class RestFoolApp : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant()

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return
        }
        LeakCanary.install(this)

    }
}