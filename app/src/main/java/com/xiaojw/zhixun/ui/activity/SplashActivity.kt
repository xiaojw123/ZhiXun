package com.xiaojw.zhixun.ui.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message
import com.xiaojw.zhixun.R
import com.xiaojw.zhixun.base.BaseActivity

class SplashActivity : BaseActivity(), Handler.Callback {
    override fun init() {
        mHandler = Handler(this)
        mHandler.sendEmptyMessageDelayed(MSG_GO_HOME, DELAY_TIME);
    }

    override fun getLayoutResouresId(): Int {
        return R.layout.activity_splash;
    }

    private var MSG_GO_HOME = 0x11
    override fun handleMessage(msg: Message?): Boolean {
        var intent = Intent(this, HomeActivity::class.java);
        startActivity(intent)
        finish()
        return false;
    }
    var DELAY_TIME = 2000L
    lateinit var mHandler: Handler;
}
