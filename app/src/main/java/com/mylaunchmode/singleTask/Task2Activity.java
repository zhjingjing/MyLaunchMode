package com.mylaunchmode.singleTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mylaunchmode.MainActivity;
import com.mylaunchmode.R;

/**
 * launchmode:singletask
 * 栈中有activity就直接调用，
 * */
public class Task2Activity extends Activity {

    private RelativeLayout activityTask2;
    private TextView tvId;
    private Button btnTask1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
        initView();
    }

    private void initView() {
        activityTask2 = (RelativeLayout) findViewById(R.id.activity_task2);
        tvId = (TextView) findViewById(R.id.tv_id);
        btnTask1 = (Button) findViewById(R.id.btn_task1);
        tvId.setText("taskid="+this.getTaskId()+"---"+this.toString());
        btnTask1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Task2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
