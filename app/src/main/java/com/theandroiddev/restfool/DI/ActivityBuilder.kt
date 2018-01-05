package com.theandroiddev.restfool.DI

import com.theandroiddev.restfool.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by jakub on 04.01.18.
 */
@Module
abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

}