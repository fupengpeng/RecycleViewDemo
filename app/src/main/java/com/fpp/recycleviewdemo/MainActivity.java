package com.fpp.recycleviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.fpp.recycleviewdemo.listview.XListViewActivity;
import com.fpp.recycleviewdemo.recycleview.RecyclerViewActivity;
import com.fpp.recycleviewdemo.ui.rvone.RVOneActivity;
import com.fpp.recycleviewdemo.ui.rvtwo.RVTwoActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.iv_title_activity_left)
    ImageView ivTitleActivityLeft;
    @BindView(R.id.tv_title_activity_left)
    TextView tvTitleActivityLeft;
    @BindView(R.id.tv_title_activity_title)
    TextView tvTitleActivityTitle;
    @BindView(R.id.tv_title_activity_right)
    TextView tvTitleActivityRight;
    @BindView(R.id.iv_title_activity_right)
    ImageView ivTitleActivityRight;
    @BindView(R.id.btn_aty_main_one)
    Button btnAtyMainOne;
    @BindView(R.id.btn_aty_main_two)
    Button btnAtyMainTwo;
    @BindView(R.id.btn_aty_main_three)
    Button btnAtyMainThree;
    @BindView(R.id.btn_aty_main_four)
    Button btnAtyMainFour;
    @BindView(R.id.btn_aty_main_five)
    Button btnAtyMainFive;
    @BindView(R.id.btn_aty_main_six)
    Button btnAtyMainSix;
    @BindView(R.id.btn_aty_main_seven)
    Button btnAtyMainSeven;
    @BindView(R.id.btn_aty_main_eight)
    Button btnAtyMainEight;
    @BindView(R.id.btn_aty_main_nine)
    Button btnAtyMainNine;
    @BindView(R.id.btn_aty_main_ten)
    Button btnAtyMainTen;
    @BindView(R.id.btn_aty_main_eleven)
    Button btnAtyMainEleven;
    @BindView(R.id.btn_aty_main_twelve)
    Button btnAtyMainTwelve;
    @BindView(R.id.btn_aty_main_thirteen)
    Button btnAtyMainThirteen;
    @BindView(R.id.btn_aty_main_fourteen)
    Button btnAtyMainFourteen;
    @BindView(R.id.btn_aty_main_fifteen)
    Button btnAtyMainFifteen;
    @BindView(R.id.btn_aty_main_sixteen)
    Button btnAtyMainSixteen;
    @BindView(R.id.btn_aty_main_seventeen)
    Button btnAtyMainSeventeen;
    @BindView(R.id.btn_aty_main_eighteen)
    Button btnAtyMainEighteen;
    @BindView(R.id.btn_aty_main_nineteen)
    Button btnAtyMainNineteen;
    @BindView(R.id.btn_aty_main_twenty)
    Button btnAtyMainTwenty;
    @BindView(R.id.btn_aty_main_twenty_one)
    Button btnAtyMainTwentyOne;
    @BindView(R.id.btn_aty_main_twenty_two)
    Button btnAtyMainTwentyTwo;
    @BindView(R.id.btn_aty_main_twenty_three)
    Button btnAtyMainTwentyThree;
    @BindView(R.id.btn_aty_main_twenty_four)
    Button btnAtyMainTwentyFour;
    @BindView(R.id.btn_aty_main_twenty_five)
    Button btnAtyMainTwentyFive;
    @BindView(R.id.btn_aty_main_twenty_six)
    Button btnAtyMainTwentySix;
    @BindView(R.id.btn_aty_main_twenty_seven)
    Button btnAtyMainTwentySeven;
    @BindView(R.id.btn_aty_main_twenty_eight)
    Button btnAtyMainTwentyEight;
    @BindView(R.id.btn_aty_main_twenty_nine)
    Button btnAtyMainTwentyNine;


    Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_title_activity_left, R.id.tv_title_activity_left
            , R.id.tv_title_activity_title
            , R.id.tv_title_activity_right, R.id.iv_title_activity_right
            , R.id.btn_aty_main_one, R.id.btn_aty_main_two, R.id.btn_aty_main_three
            , R.id.btn_aty_main_four, R.id.btn_aty_main_five, R.id.btn_aty_main_six
            , R.id.btn_aty_main_seven, R.id.btn_aty_main_eight, R.id.btn_aty_main_nine
            , R.id.btn_aty_main_ten, R.id.btn_aty_main_eleven, R.id.btn_aty_main_twelve
            , R.id.btn_aty_main_thirteen, R.id.btn_aty_main_fourteen, R.id.btn_aty_main_fifteen
            , R.id.btn_aty_main_sixteen, R.id.btn_aty_main_seventeen, R.id.btn_aty_main_eighteen
            , R.id.btn_aty_main_nineteen, R.id.btn_aty_main_twenty, R.id.btn_aty_main_twenty_one
            , R.id.btn_aty_main_twenty_two, R.id.btn_aty_main_twenty_three, R.id.btn_aty_main_twenty_four
            , R.id.btn_aty_main_twenty_five, R.id.btn_aty_main_twenty_six, R.id.btn_aty_main_twenty_seven
            , R.id.btn_aty_main_twenty_eight, R.id.btn_aty_main_twenty_nine})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_title_activity_left:

                mIntent = new Intent(this, RecyclerViewActivity.class);
                startActivity(mIntent);


                break;
            case R.id.tv_title_activity_left:
                break;
            case R.id.tv_title_activity_title:
                break;
            case R.id.tv_title_activity_right:
                break;
            case R.id.iv_title_activity_right:
                break;
            case R.id.btn_aty_main_one:

                mIntent = new Intent(this, RecyclerViewActivity.class);
                startActivity(mIntent);

                break;
            case R.id.btn_aty_main_two:
                mIntent = new Intent(this, RVOneActivity.class);
                startActivity(mIntent);
                break;
            case R.id.btn_aty_main_three:
                mIntent = new Intent(this, RVTwoActivity.class);
                startActivity(mIntent);
                break;
            case R.id.btn_aty_main_four:
                mIntent = new Intent(this, XListViewActivity.class);
                startActivity(mIntent);
                break;
            case R.id.btn_aty_main_five:
                break;
            case R.id.btn_aty_main_six:
                break;
            case R.id.btn_aty_main_seven:
                break;
            case R.id.btn_aty_main_eight:
                break;
            case R.id.btn_aty_main_nine:
                break;
            case R.id.btn_aty_main_ten:
                break;
            case R.id.btn_aty_main_eleven:
                break;
            case R.id.btn_aty_main_twelve:
                break;
            case R.id.btn_aty_main_thirteen:
                break;
            case R.id.btn_aty_main_fourteen:
                break;
            case R.id.btn_aty_main_fifteen:
                break;
            case R.id.btn_aty_main_sixteen:
                break;
            case R.id.btn_aty_main_seventeen:
                break;
            case R.id.btn_aty_main_eighteen:
                break;
            case R.id.btn_aty_main_nineteen:
                break;
            case R.id.btn_aty_main_twenty:
                break;
            case R.id.btn_aty_main_twenty_one:
                break;
            case R.id.btn_aty_main_twenty_two:
                break;
            case R.id.btn_aty_main_twenty_three:
                break;
            case R.id.btn_aty_main_twenty_four:
                break;
            case R.id.btn_aty_main_twenty_five:
                break;
            case R.id.btn_aty_main_twenty_six:
                break;
            case R.id.btn_aty_main_twenty_seven:
                break;
            case R.id.btn_aty_main_twenty_eight:
                break;
            case R.id.btn_aty_main_twenty_nine:
                break;
        }
    }
}
