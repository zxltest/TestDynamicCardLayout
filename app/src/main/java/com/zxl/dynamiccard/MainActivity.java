package com.zxl.dynamiccard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.zxl.dynamiccard.test.ui.SecondAct;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvTest1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        mTvTest1 = (TextView) findViewById(R.id.tv_test1);
        mTvTest1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_test1:
                clickTv1();
                break;
        }
    }

    public void clickTv1() {
        startActivity(new Intent(this, SecondAct.class));
    }
}
