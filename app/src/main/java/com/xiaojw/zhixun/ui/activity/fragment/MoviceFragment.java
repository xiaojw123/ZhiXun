package com.xiaojw.zhixun.ui.activity.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.jcodecraeer.xrecyclerview.ProgressStyle;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.xiaojw.zhixun.R;
import com.xiaojw.zhixun.adpater.MoviceListAdapter;
import com.xiaojw.zhixun.base.BaseFragment;
import com.xiaojw.zhixun.bean.DoubanResponse;
import com.xiaojw.zhixun.bean.MoviceItem;
import com.xiaojw.zhixun.di.component.DaggerMoviceFragmentComponent;
import com.xiaojw.zhixun.net.ApiManager;
import com.xiaojw.zhixun.ui.contract.MoviceContract;
import com.xiaojw.zhixun.ui.model.MoviceModel;
import com.xiaojw.zhixun.ui.presenter.MovicePresenter;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by xiaojw on 2018/3/20.
 */

public class MoviceFragment extends BaseFragment implements MoviceContract.View, XRecyclerView.LoadingListener {
    @Inject
    MovicePresenter movicePresenter;
    @Inject
    MoviceModel moviceModel;
    XRecyclerView mRecyclerView;
    MoviceListAdapter mAdatper;


    @Override
    public void iniView(View parentView) {
        mRecyclerView=parentView.findViewById(R.id.movice_list_rlv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setPullRefreshEnabled(true);
        mRecyclerView.setLoadingMoreEnabled(false);
        mRecyclerView.setLoadingListener(this);
        DaggerMoviceFragmentComponent.create().inject(this);
        movicePresenter.setMV(moviceModel, this);
        movicePresenter.getMoviceList();

    }


    @Override
    public int getLayoutRes() {
        return R.layout.fragment_movice;
    }


    @Override
    public void updateView(List<MoviceItem> items) {
        mRecyclerView.refreshComplete();
        if (items!=null&&items.size()>0){
            if (mAdatper==null){
                mAdatper=new MoviceListAdapter(items);
                mRecyclerView.setAdapter(mAdatper);
            }else{
                mAdatper.updateItems(items);
            }
        }

    }

    @Override
    public void updateError() {
        mRecyclerView.refreshComplete();
    }

    @Override
    public void onRefresh() {
        movicePresenter.getMoviceList();
    }

    @Override
    public void onLoadMore() {


    }
}
