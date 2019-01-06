package com.fpp.recycleviewdemo.base.ui;

import android.databinding.ViewDataBinding;
import android.view.View;

import com.chad.library.adapter.base.BaseViewHolder;

/**
 * @Description
 * @Author fpp
 * @Date 2019/1/6 0006 22:45
 */

public class BaseBindingViewHolder<Binding extends ViewDataBinding> extends BaseViewHolder {
    private Binding mBinding;

    public BaseBindingViewHolder(View view) {
        super(view);
    }

    public Binding getBinding() {
        return mBinding;
    }

    public void setBinding(Binding binding) {
        mBinding = binding;
    }
}
