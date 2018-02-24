package com.mylaunchmode.singleTop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mylaunchmode.R;

/**
 * launchmode ：singleTop
 * 当跳转activity存在栈顶时,不创建实例，直接使用；
 * 不存在栈顶，创建实例，并跳转
 */
public class Top2Activity extends Activity {

    private RelativeLayout activityTop2;
    private TextView tvId;
    private Button btnTop1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top2);
        initView();
    }

    private void initView() {
        activityTop2 = (RelativeLayout) findViewById(R.id.activity_top2);
        tvId = (TextView) findViewById(R.id.tv_id);
        btnTop1 = (Button) findViewById(R.id.btn_top1);
        tvId.setText("taskid="+this.getTaskId()+"---"+this.toString());
        btnTop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Top2Activity.this,Top1Activity.class);
                startActivity(intent);
            }
        });
    }
}
