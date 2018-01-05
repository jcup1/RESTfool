package com.theandroiddev.restfool.base

import android.app.Fragment
import android.os.Bundle
import android.support.annotation.LayoutRes
import com.hannesdorfmann.mosby3.mvp.MvpActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

/**
 * Created by jakub on 1/5/18.
 */
abstract class BaseActivityImpl<V : BaseView, P : BasePresenterImpl<V>> : MvpActivity<V, P>(),
        HasFragmentInjector,
        HasSupportFragmentInjector,
        BaseView {

    @get:LayoutRes
    protected abstract val layoutResId: Int?
    @Inject
    lateinit var supportFragmentInjector: DispatchingAndroidInjector<android.support.v4.app.Fragment>
    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<android.app.Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        if (layoutResId != null) {
            setContentView(layoutResId as Int)
        }

    }

    override fun fragmentInjector(): AndroidInjector<Fragment> = fragmentInjector

    override fun supportFragmentInjector(): AndroidInjector<android.support.v4.app.Fragment> = supportFragmentInjector

}