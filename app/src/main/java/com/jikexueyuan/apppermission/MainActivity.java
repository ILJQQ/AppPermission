package com.jikexueyuan.apppermission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSwap = (Button) findViewById(R.id.btnSwap);
        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                显式Intent跳转
                startActivity(new Intent(MainActivity.this,CheckPermission.class));
//                调用权限检查
                CheckPermission.checkPermission(MainActivity.this);
            }
        });
    }
}
