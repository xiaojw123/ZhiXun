package com.xiaojw.zhixun.ui.model;

import com.xiaojw.zhixun.bean.DoubanResponse;
import com.xiaojw.zhixun.net.Api;
import com.xiaojw.zhixun.net.ApiManager;
import com.xiaojw.zhixun.ui.contract.MoviceContract;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by xiaojw on 2018/3/20.
 */

public class MoviceModel implements MoviceContract.Model {

    @Inject
    public MoviceModel(){
    }
    @Override
    public Observable<DoubanResponse> getMoviceList() {
        return  ApiManager.getApi(Api.BASE_DOUBAN_URL).getMoviceTheaterList();
    }

    @Override
    public Observable<DoubanResponse> getMoviceSoonList() {
        return ApiManager.getApi(Api.BASE_DOUBAN_URL).getMoviceSoonList();
    }

    @Override
    public Observable<DoubanResponse> getMoviceTopList() {
        return ApiManager.getApi(Api.BASE_DOUBAN_URL).getMoviceTopList();
    }
}
