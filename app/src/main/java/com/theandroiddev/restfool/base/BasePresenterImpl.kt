package com.theandroiddev.restfool.base

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter
import com.hannesdorfmann.mosby3.mvp.MvpView

/**
 * Created by jakub on 04.01.18.
 */
abstract class BasePresenterImpl<V : MvpView> : MvpBasePresenter<V>()