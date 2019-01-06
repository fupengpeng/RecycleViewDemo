package com.fpp.recycleviewdemo.base.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * @Description RecycleView BaseAdapter
 * @Author fpp
 * @Date 2019/1/6 0006 18:45
 */
public class RVAdapter extends RecyclerView.Adapter<VH> {


    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {

    }



    @Override
    public int getItemCount() {
        return 0;
    }
}
