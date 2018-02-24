package com.mylaunchmode.singleInstance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mylaunchmode.R;
/**
 * launchmode:singleInstance
 *
 *  当mainactivity跳转 instance1activity 新建栈。栈中之有instance1activity；
 *  instance1activity跳转instance1activity，直接用
 *  instance1activity跳转instance2activity，新建栈，栈中之有instance2activity
 *  instance2activity跳转mainactivity（standard），在起始栈中添加mainactivity，然后回退到mainactivity，在回退到instance2activity，在会退到instance1activity，退出
 * */
public class Instance1Activity extends Activity {

    private RelativeLayout activityInstance1;
    private TextView tvId;
    private Button btnInstance1;
    private Button btnInstance2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instance1);
        initView();
    }

    private void initView() {
        activityInstance1 = (RelativeLayout) findViewById(R.id.activity_instance1);
        tvId = (TextView) findViewById(R.id.tv_id);
        btnInstance1 = (Button) findViewById(R.id.btn_instance1);
        btnInstance2 = (Button) findViewById(R.id.btn_instance2);
        tvId.setText("taskid="+this.getTaskId()+"---"+ this.toString());

        btnInstance1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Instance1Activity.this,Instance1Activity.class);
                startActivity(intent);
            }
        });
        btnInstance2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Instance1Activity.this,Instance2Activity.class);
                startActivity(intent);
            }
        });
    }
}
