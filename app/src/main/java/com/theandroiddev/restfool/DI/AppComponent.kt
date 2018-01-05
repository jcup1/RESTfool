package com.theandroiddev.restfool.DI

import com.theandroiddev.restfool.RestFoolApp
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by jakub on 04.01.18.
 */
@Singleton
@Component(modules = [(AppModule::class), (AndroidSupportInjectionModule::class), (ActivityBuilder::class)])
interface AppComponent : AndroidInjector<RestFoolApp> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<RestFoolApp>()
}