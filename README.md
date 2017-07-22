#title
 仿遥控器圆盘菜单
 #show
![](https://github.com/caixingcun/CopyMenu/blob/master/copymenu.gif)  

#how to use
 拷贝 values 下  attrs 到你的项目下
 拷贝  GeometryUtil.java  Menu.java 到你的文件夹下
 
  xml 
     <com.sy.copymenu.MenuView
        android:id="@+id/menu_view"
        android:layout_width="200dp"
        android:layout_height="200dp"
        android:layout_centerInParent="true"
        android:background="@android:color/transparent"

        menuview:arrowChoseColor="@android:color/white"
        menuview:arrowColor="@android:color/holo_red_dark"
        menuview:choseColor="@android:color/black"
        menuview:lineColor="@android:color/black"
        menuview:mtext="OK"
        menuview:mtextSize="20sp"
    />

 src
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
 














