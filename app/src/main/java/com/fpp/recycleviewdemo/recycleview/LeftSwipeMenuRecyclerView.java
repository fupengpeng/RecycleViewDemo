package com.fpp.recycleviewdemo.recycleview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;


/**
 * Created by Administrator on 2017/6/16.
 */

public class LeftSwipeMenuRecyclerView extends RecyclerView {

    //置顶按钮
    private TextView tvTop;
    //删除按钮
    private TextView tvDelete;
    //item相应的布局
    private LinearLayout mItemLayout;
    //菜单的最大宽度
    private int mMaxLength;

    //上一次触摸行为的x坐标
    private int mLastX;
    //上一次触摸行为的y坐标
    private int mLastY;

    //当前触摸的item的位置
    private int mPosition;

    //是否在垂直滑动列表
    private boolean isDragging;
    //item是在否跟随手指移动
    private boolean isItemMoving;
    //item是否开始自动滑动
    private boolean isStartScroll;

    //左滑菜单状态   0：关闭 1：将要关闭 2：将要打开 3：打开
    private int mMenuState;
    private static int MENU_CLOSED = 0;
    private static int MENU_WILL_CLOSED = 1;
    private static int MENU_OPEN = 2;
    private static int MENU_WILL_OPEN = 3;
    //实现弹性滑动，恢复
    private Scroller mScroller;
    //item的事件监听
    private IOnItemActionListener mListener;

    public LeftSwipeMenuRecyclerView(Context context) {
        this(context, null);
    }

    public LeftSwipeMenuRecyclerView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LeftSwipeMenuRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mScroller = new Scroller(context, new LinearInterpolator());
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        int x = (int) e.getX();
        int y = (int) e.getY();
        switch (e.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if (mMenuState == MENU_CLOSED) {
                    //根据坐标获得view
                    View view = findChildViewUnder(x, y);
                    if (view == null) {
                        return false;
                    }
                    //获得这个view的ViewHolder

                    Log.e("-----------------", "------------------------------------");
                    RVAdapter.Holder holder = (RVAdapter.Holder) getChildViewHolder(view);
//                    MyViewHolder holder= (MyViewHolder) getChildViewHolder(view);
                    //获得这个view的position
                    mPosition = holder.getAdapterPosition();
                    //获得这个view的整个布局
                    mItemLayout = holder.llLayout;
                    Log.e("-----sssssssss", "" + mItemLayout);
                    //获得这个view的加入购物车按钮
                    tvDelete = holder.txt_addCart;
                    //这个view的收藏按钮
                    tvTop = holder.txt_collect;
                    //两个按钮的宽度
                    mMaxLength = tvDelete.getWidth() + tvTop.getWidth();

                    //设置加入购物车按钮点击监听
                    tvDelete.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
//                            mItemLayout.scrollTo(0, 0);
                            mMenuState = MENU_CLOSED;
                            mListener.AddCart(mPosition);
                            close();
                        }
                    });
                    //设置收藏按钮点击监听
                    tvTop.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
//                            mItemLayout.scrollTo(0, 0);
                            mMenuState = MENU_CLOSED;
                            mListener.OnCollect(mPosition);
                            close();
                        }
                    });
                    //如果是打开状态，点击其他就把当前menu关闭掉
                } else if (mMenuState == MENU_OPEN) {
//                    mScroller.startScroll(mItemLayout.getScrollX(), 0, -mMaxLength, 0, 200);
//                    invalidate();
//                    mMenuState = MENU_CLOSED;
                    close();
                    //该点击无效
                    return false;
                } else {
                    return false;
                }
                break;
            case MotionEvent.ACTION_MOVE:
                //计算偏移量
                int dx = mLastX - x;
                int dy = mLastY - y;
                Log.e("-----mItemLayout.getScrollX()", "" + mItemLayout);
                //当前滑动的x
                int scrollx = mItemLayout.getScrollX();
                Log.e("-------scrollx", "" + scrollx);

                if (Math.abs(dx) > Math.abs(dy)) {

                    isItemMoving = true;
                    //超出左边界则始终保持不动
                    if (scrollx + dx <= 0) {
                        mItemLayout.scrollTo(0, 0);
                        //滑动无效
                        return false;
                        //超出右边界则始终保持不动
                    } else if (scrollx + dx >= mMaxLength) {
                        mItemLayout.scrollTo(mMaxLength, 0);
                        //滑动无效
                        return false;
                    }
                    //菜单随着手指移动
                    mItemLayout.scrollBy(dx, 0);
                    //如果水平移动距离大于30像素的话，recyclerView不会上下滑动
                } else if (Math.abs(dx) > 30) {
                    return true;
                }
                //如果菜单正在打开就不能上下滑动
                if (isItemMoving) {
                    mLastX = x;
                    mLastY = y;
                    return true;
                }
                break;
            case MotionEvent.ACTION_UP:
                boolean ss = mListener != null;
                //手指抬起时判断是否点击,静止且有Listener才能点击
                if (!isItemMoving && !isDragging && mListener != null) {
                    mListener.OnItemClick(mPosition);
                }
                isItemMoving = false;

                //等一下要移动的距离
                int deltaX = 0;
                int upScrollx = mItemLayout.getScrollX();
                //滑动距离大于1/2menu长度就自动展开，否则就关掉
                if (upScrollx >= mMaxLength / 2) {
                    deltaX = mMaxLength - upScrollx;
                    mMenuState = MENU_WILL_OPEN;
                } else if (upScrollx < mMaxLength / 2) {
                    deltaX = -upScrollx;
                    mMenuState = MENU_WILL_CLOSED;
                }
                //知道我们为什么不直接把mMenuState赋值为MENU_OPEN或者MENU_CLOSED吗？因为滑动时有时间的，我们可以在滑动完成时才把状态改为已经完成
                mScroller.startScroll(upScrollx, 0, deltaX, 0, 200);
                isStartScroll = true;
                //刷新界面
                invalidate();
                break;
        }
        //只有更新mLastX，mLastY数据才会准确
        mLastX = x;
        mLastY = y;
        return super.onTouchEvent(e);
    }

    public void close() {
        mScroller.startScroll(mItemLayout.getScrollX(), 0, -mMaxLength, 0, 200);
        invalidate();
        mMenuState = MENU_CLOSED;
    }

    @Override
    public void computeScroll() {
        //判断scroller是否完成滑动
        if (mScroller.computeScrollOffset()) {
            mItemLayout.scrollTo(mScroller.getCurrX(), mScroller.getCurrY());
            //这个很重要
            invalidate();
            //如果已经完成就改变状态
        } else if (isStartScroll) {
            isStartScroll = false;
            if (mMenuState == MENU_WILL_CLOSED) {
                mMenuState = MENU_CLOSED;
            }
            if (mMenuState == MENU_WILL_OPEN) {
                mMenuState = MENU_OPEN;
            }
        }
    }

    @Override
    public void onScrollStateChanged(int state) {
        super.onScrollStateChanged(state);
        //是否在上下滑动
        isDragging = state == SCROLL_STATE_DRAGGING;
    }

    //设置Listener
    public void setOnItemActionListener(IOnItemActionListener onItemActionListener) {
        this.mListener = onItemActionListener;
    }


}
