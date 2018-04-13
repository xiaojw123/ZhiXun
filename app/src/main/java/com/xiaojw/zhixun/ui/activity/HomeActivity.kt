package com.xiaojw.zhixun.ui.activity

import android.app.FragmentManager
import android.app.FragmentTransaction
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.xiaojw.zhixun.R
import com.xiaojw.zhixun.base.BaseActivity
import com.xiaojw.zhixun.net.ApiManager
import com.xiaojw.zhixun.ui.activity.fragment.MoviceFragment
import org.w3c.dom.Text

class HomeActivity : BaseActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLayoutResouresId(): Int {
        return R.layout.activity_home
    }

    override fun init() {
        moviceTv=findViewById(R.id.home_movice_tv)
        fashionTv=findViewById(R.id.home_fashion_tv)
        otherTv=findViewById(R.id.home_other_tv)
        moviceTv.setOnClickListener(this)
        fashionTv.setOnClickListener(this)
        otherTv.setOnClickListener(this)
        showFragment(moviceTv)

    }


    lateinit var moviceTv:TextView
    lateinit var fashionTv:TextView
    lateinit var otherTv:TextView

    var moviceFragment:MoviceFragment?=null



    fun showFragment(titleTv: TextView){
        titleTv.isSelected=true
        val ft=fragmentManager.beginTransaction();
        if (moviceFragment==null){
            moviceFragment= MoviceFragment();
            ft.add(R.id.home_fragment_container,moviceFragment)
        }else{
            ft.show(moviceFragment)
        }
        ft.commit()
    }



}
