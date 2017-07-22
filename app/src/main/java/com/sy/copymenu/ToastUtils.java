package com.sy.copymenu;

import android.content.Context;
import android.widget.Toast;

/**
 * Package:com.sy.customplanel
 *
 * User: Mr Cai  mail:965571656@qq.com
 * Desc: TODO
 * Date: 2017-07-16 12:08
 */
public class ToastUtils {
    private static Toast mToast;
    public static void showToast(Context context, String msg) {
        if (mToast == null) {
            mToast = Toast.makeText(context.getApplicationContext(), msg, Toast.LENGTH_SHORT);
        }
        mToast.setText(msg);
        mToast.show();
    }
}
