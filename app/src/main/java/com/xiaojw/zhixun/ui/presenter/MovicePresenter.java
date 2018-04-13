package com.xiaojw.zhixun.ui.presenter;

import com.common.baseframe.rx.RxTransformer;
import com.xiaojw.zhixun.bean.DoubanResponse;
import com.xiaojw.zhixun.bean.MoviceItem;
import com.xiaojw.zhixun.ui.contract.MoviceContract;
import com.xiaojw.zhixun.ui.model.MoviceModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by xiaojw on 2018/3/20.
 */

public class MovicePresenter extends MoviceContract.Prsenter {

   @Inject
   public  MovicePresenter(){

   }

    @Override
    public void getMoviceList() {
        final List<MoviceItem> itemList=new ArrayList<>();
      mModel.getMoviceList().flatMap(new Func1<DoubanResponse, Observable<DoubanResponse>>() {
          @Override
          public Observable<DoubanResponse> call(DoubanResponse response) {
              List<MoviceItem> theaterList=response.getSubjects();
              if (theaterList!=null&&theaterList.size()>0){
                  MoviceItem  item= theaterList.get(0);
                  item.setCategory("正在上映");
                  itemList.addAll(response.getSubjects());
              }
              return mModel.getMoviceSoonList();
          }
      }).flatMap(new Func1<DoubanResponse, Observable<DoubanResponse>>() {
          @Override
          public Observable<DoubanResponse> call(DoubanResponse response) {
              List<MoviceItem> soonList=response.getSubjects();
              if (soonList!=null&&soonList.size()>0){
                   MoviceItem item=soonList.get(0);
                   item.setCategory("即將上映");
                  itemList.addAll(soonList);
              }
              return mModel.getMoviceTopList();
          }
      }).compose(RxTransformer.<DoubanResponse>applySchedulers()).subscribe(new Observer<DoubanResponse>() {
          @Override
          public void onCompleted() {

          }

          @Override
          public void onError(Throwable e) {
              mView.updateError();

          }

          @Override
          public void onNext(DoubanResponse doubanResponse) {
              List<MoviceItem> topList=doubanResponse.getSubjects();
              if (topList!=null&&topList.size()>0){
                  MoviceItem item=topList.get(0);
                  item.setCategory("豆瓣高分");
                 itemList.addAll(topList);
              }
              mView.updateView(itemList);
          }
      });
    }



}
