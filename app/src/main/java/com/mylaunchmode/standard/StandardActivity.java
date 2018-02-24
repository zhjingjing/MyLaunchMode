package com.mylaunchmode.standard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mylaunchmode.R;

/**
 * 启动模式 standard
 *  不管存在实例不存在，都重新创建activity
 * */
public class StandardActivity extends Activity {

    private RelativeLayout activityStandard;
    private Button btnStandard;
    private TextView tvId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
        initView();
    }

    private void initView() {
        tvId = (TextView) findViewById(R.id.tv_id);
        activityStandard = (RelativeLayout) findViewById(R.id.activity_standard);
        tvId.setText("taskid="+this.getTaskId()+"---"+this.toString());
        btnStandard = (Button) findViewById(R.id.btn_standard);

        btnStandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StandardActivity.this, StandardActivity.class);
                startActivity(intent);
            }
        });

    }
}
