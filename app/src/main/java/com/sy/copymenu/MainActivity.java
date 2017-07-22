package com.sy.copymenu;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MenuView mMenuView;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        setContentView(R.layout.activity_main);
        mMenuView = (MenuView) findViewById(R.id.menu_view);
        mMenuView.setOnTouchBlockListener(new MenuView.OnTouchBlockListener() {
            @Override
            public void onTop() {
                ToastUtils.showToast(mContext, "top");
            }

            @Override
            public void onBottom() {
                ToastUtils.showToast(mContext, "onBottom");
            }

            @Override
            public void onLeft() {
                ToastUtils.showToast(mContext, "onLeft");
            }

            @Override
            public void onRight() {
                ToastUtils.showToast(mContext, "onRight");
            }

            @Override
            public void onCenter() {
                ToastUtils.showToast(mContext, "onCenter");
            }
        });
    }
}
