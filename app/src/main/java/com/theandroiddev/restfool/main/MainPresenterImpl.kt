package com.theandroiddev.restfool.main

import com.theandroiddev.restfool.DI.ActivityScope
import com.theandroiddev.restfool.base.BasePresenterImpl
import javax.inject.Inject

/**
 * Created by jakub on 04.01.18.
 */
@ActivityScope
class MainPresenterImpl @Inject constructor() : BasePresenterImpl<MainView>()