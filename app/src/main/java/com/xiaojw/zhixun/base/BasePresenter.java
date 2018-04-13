package com.xiaojw.zhixun.base;

/**
 * Created by xiaojw on 2018/3/20.
 */

public abstract class BasePresenter<M,V> {
   public M mModel;
    public  V mView;
   public  void  setMV(M model,V view){
      mModel=model;
      mView=view;
    }

}
