package com.theandroiddev.restfool.main

import android.os.Bundle
import com.theandroiddev.restfool.R
import com.theandroiddev.restfool.base.BaseActivityImpl
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : BaseActivityImpl<MainView, MainPresenterImpl>(), MainView {

    override val layoutResId: Int?
        get() = R.layout.activity_main

    @Inject
    lateinit var mainPresenter: MainPresenterImpl

    override fun createPresenter(): MainPresenterImpl = mainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter.attachView(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        mainPresenter.detachView()
    }

    override fun displayList() {

    }

}
