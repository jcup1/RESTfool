package com.theandroiddev.restfool.main

import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import java.util.*

/**
 * Created by jakub on 1/5/18.
 */
class MainPresenterImplTest {

    @Mock
    lateinit var mockView: MainView

    lateinit var mainPresenter: MainPresenterImpl


    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        mainPresenter = MainPresenterImpl()

    }

    @Test
    fun testMainView() {

        mainPresenter.attachView(mockView)
        mainPresenter.loadList(Collections.EMPTY_LIST)
        Mockito.verify(mockView).displayList()

    }


}