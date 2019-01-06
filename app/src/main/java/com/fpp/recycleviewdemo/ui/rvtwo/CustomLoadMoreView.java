package com.fpp.recycleviewdemo.ui.rvtwo;

import com.chad.library.adapter.base.loadmore.LoadMoreView;
import com.fpp.recycleviewdemo.R;

/**
 * @Description
 * @Author fpp
 * @Date 2019/1/6 0006 22:45
 */
public final class CustomLoadMoreView extends LoadMoreView {

    @Override public int getLayoutId() {
        return R.layout.view_load_more;
    }

    @Override protected int getLoadingViewId() {
        return R.id.load_more_loading_view;
    }

    @Override protected int getLoadFailViewId() {
        return R.id.load_more_load_fail_view;
    }

    @Override protected int getLoadEndViewId() {
        return R.id.load_more_load_end_view;
    }
}
