package com.mylaunchmode.singleTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mylaunchmode.R;

/**
 * launchmode:singletask
 * main跳转task1  时栈中没有，新建
 * task1跳转task1时，存在，直接用
 * task1跳转task2时，task2不存在，创建
 * task2跳转mainactivity，在重新跳转task1，直接应用task1，并清空栈中其他activity，使得task1成为栈顶，
 * */
public class Task1Activity extends Activity {

    private RelativeLayout activityTask1;
    private TextView tvId;
    private Button btnTask1;
    private Button btnTask2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        initView();
    }

    private void initView() {
        activityTask1 = (RelativeLayout) findViewById(R.id.activity_task1);
        tvId = (TextView) findViewById(R.id.tv_id);
        tvId.setText("taskid="+this.getTaskId()+"---"+ this.toString());

        btnTask1 = (Button) findViewById(R.id.btn_task1);
        btnTask2 = (Button) findViewById(R.id.btn_task2);

        btnTask1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Task1Activity.this,Task1Activity.class);
                startActivity(intent);
            }
        });

        btnTask2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Task1Activity.this,Task2Activity.class);
                startActivity(intent);
            }
        });

    }
}
