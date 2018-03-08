package com.example.leesnriud.mylistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bt_one;
    private Button bt_two;
    private Button bt_three;
    private Button bt_four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_one = findViewById(R.id.bt_one);
        bt_two = findViewById(R.id.bt_two);
        bt_three = findViewById(R.id.bt_three);
        bt_four = findViewById(R.id.bt_four);

        bt_four.setOnClickListener(this);

        //匿名内部类实现
        bt_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"通过匿名内部类实现点击监听",Toast.LENGTH_SHORT).show();
            }
        });

        //内部类实现
        bt_two.setOnClickListener(new BtnClickListener());

        //外部类实现
        bt_three.setOnClickListener(new MybtnClickListener(MainActivity.this));


    }

    //activity实现监听
    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this,"通过activity实现监听",Toast.LENGTH_SHORT).show();
    }


    //内部类
    class BtnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,"通过内部类实现点击监听",Toast.LENGTH_SHORT).show();
        }
    }

    //绑定标签
    public void myClick(View view){
        Toast.makeText(MainActivity.this,"通过绑定标签实现点击监听",Toast.LENGTH_SHORT).show();
    }
}
