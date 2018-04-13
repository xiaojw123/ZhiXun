package com.xiaojw.zhixun.base;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by xiaojw on 2018/3/20.
 */

public abstract class BaseFragment<P extends BasePresenter,M extends BaseModel> extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View parentView = inflater.inflate(getLayoutRes(), container, false);
        iniView(parentView);
        return parentView;
    }

    public abstract void iniView(View parentView);

    public abstract int getLayoutRes();


}
