package com.fpp.recycleviewdemo.listview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.fpp.recycleviewdemo.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ClassifyActivity extends AppCompatActivity {

    @BindView(R.id.lv_aty_classify_content)
    ListView lvAtyClassifyContent;
    @BindView(R.id.ll_aty_classify_lv_one)
    LinearLayout llAtyClassifyLvOne;
    @BindView(R.id.ll_aty_classify_lv_two)
    LinearLayout llAtyClassifyLvTwo;
    @BindView(R.id.ll_aty_classify_lv_three)
    LinearLayout llAtyClassifyLvThree;
    @BindView(R.id.ll_aty_classify_lv_four)
    LinearLayout llAtyClassifyLvFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classify);
        ButterKnife.bind(this);


    }


    class LvAdapter extends BaseAdapter {

        Context context;
        List<String> list;
        int selectItem;

        public LvAdapter(Context context, List<String> list) {
            this.context = context;
            this.list = list;
        }

        public int getSelectItem() {
            return selectItem;
        }

        public void setSelectItem(int selectItem) {
            this.selectItem = selectItem;
        }

        @Override
        public int getCount() {
            return list.size() > 0 ? list.size() : 0;
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder viewHolder = null;
            if (convertView == null) {
                convertView = View.inflate(context, R.layout.item_xlist_view, null);
                viewHolder = new ViewHolder(convertView);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }







            return convertView;
        }


        class ViewHolder {
            @BindView(R.id.list_item_textview)
            TextView listItemTextview;

            ViewHolder(View view) {
                ButterKnife.bind(this, view);
            }
        }
    }
}
