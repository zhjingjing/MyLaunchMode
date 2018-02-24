package com.mylaunchmode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mylaunchmode.singleInstance.Instance1Activity;
import com.mylaunchmode.singleTask.Task1Activity;
import com.mylaunchmode.singleTop.Top1Activity;
import com.mylaunchmode.standard.StandardActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    private LinearLayout activityMain;
    private Button mode1;
    private Button mode2;
    private Button mode3;
    private Button mode4;
    private TextView tvId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        activityMain = (LinearLayout) findViewById(R.id.activity_main);
        mode1 = (Button) findViewById(R.id.mode1);
        mode2 = (Button) findViewById(R.id.mode2);
        mode3 = (Button) findViewById(R.id.mode3);
        mode4 = (Button) findViewById(R.id.mode4);

        mode1.setOnClickListener(this);
        mode2.setOnClickListener(this);
        mode3.setOnClickListener(this);
        mode4.setOnClickListener(this);

        tvId = (TextView) findViewById(R.id.tv_id);
        tvId.setText("taskid="+this.getTaskId()+"---"+this.toString());
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.mode1:
                intent = new Intent(MainActivity.this, StandardActivity.class);
                startActivity(intent);
                break;
            case R.id.mode2:
                intent = new Intent(MainActivity.this, Top1Activity.class);
                startActivity(intent);
                break;
            case R.id.mode3:
                intent = new Intent(MainActivity.this, Task1Activity.class);
                startActivity(intent);
                break;
            case R.id.mode4:
                intent = new Intent(MainActivity.this, Instance1Activity.class);
                startActivity(intent);
                break;


        }
    }
}
