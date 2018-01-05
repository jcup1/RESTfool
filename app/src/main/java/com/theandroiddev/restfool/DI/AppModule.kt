package com.theandroiddev.restfool.DI

import android.content.Context
import com.theandroiddev.restfool.RestFoolApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by jakub on 04.01.18.
 */
@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(app: RestFoolApp): Context = app
}