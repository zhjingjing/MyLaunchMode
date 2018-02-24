package com.mylaunchmode.singleInstance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mylaunchmode.MainActivity;
import com.mylaunchmode.R;

public class Instance2Activity extends Activity {

    private RelativeLayout activityInstance2;
    private TextView tvId;
    private Button btnInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instance2);
        initView();
    }

    private void initView() {
        activityInstance2 = (RelativeLayout) findViewById(R.id.activity_instance2);
        tvId = (TextView) findViewById(R.id.tv_id);
        btnInstance = (Button) findViewById(R.id.btn_instance);

        tvId.setText("taskid="+this.getTaskId()+"---"+this.toString());
        btnInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Instance2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
