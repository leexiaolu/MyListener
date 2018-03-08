package com.example.leesnriud.mylistener;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by lee.snriud on 2018/3/8.
 */

public class MybtnClickListener implements View.OnClickListener{

    private Context mContext;

    public MybtnClickListener(Context context){
        this.mContext = context;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(mContext,"通过外部类实现点击监听",Toast.LENGTH_SHORT).show();
    }
}
