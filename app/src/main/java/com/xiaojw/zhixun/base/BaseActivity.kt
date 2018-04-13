package com.xiaojw.zhixun.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResouresId())
        init()
    }

    abstract fun getLayoutResouresId():Int;

    abstract fun  init()

}
