package com.xiaojw.zhixun.ui.contract;

import com.xiaojw.zhixun.base.BaseModel;
import com.xiaojw.zhixun.base.BasePresenter;
import com.xiaojw.zhixun.base.BaseView;
import com.xiaojw.zhixun.bean.DoubanResponse;
import com.xiaojw.zhixun.bean.MoviceItem;

import java.util.List;

import rx.Observable;

/**
 * Created by xiaojw on 2018/3/20.
 */

public interface MoviceContract {

    interface  Model extends BaseModel{

        Observable<DoubanResponse> getMoviceList();
        Observable<DoubanResponse> getMoviceSoonList();
        Observable<DoubanResponse>  getMoviceTopList();

    }
    interface  View extends BaseView{

        void updateView(List<MoviceItem> items);
        void updateError();


    }
    abstract class Prsenter extends BasePresenter<MoviceContract.Model,MoviceContract.View> {

        public abstract void getMoviceList();

    }

}
