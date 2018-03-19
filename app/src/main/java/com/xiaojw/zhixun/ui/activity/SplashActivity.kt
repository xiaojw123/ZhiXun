package com.xiaojw.zhixun.ui.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message
import com.xiaojw.zhixun.R

class SplashActivity : BaseActivity(), Handler.Callback {
    private var MSG_GO_HOME = 0x11
    override fun handleMessage(msg: Message?): Boolean {
        var intent = Intent(this, HomeActivity::class.java);
        startActivity(intent)
        finish()
        return false;
    }

    var DELAY_TIME = 2000L
    lateinit var mHandler: Handler;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        mHandler = Handler(this)
        mHandler.sendEmptyMessageDelayed(MSG_GO_HOME, DELAY_TIME);
    }
}
