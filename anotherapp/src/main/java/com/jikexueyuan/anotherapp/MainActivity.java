package com.jikexueyuan.anotherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btnStartAnotherApp;
    public static final String ACTION = "com.jikexueyuan.apppermission.intent.action.CheckPermission";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartAnotherApp = (Button) findViewById(R.id.btnStartAnotherApp);
        btnStartAnotherApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                使用隐式Intent跳转到另一个应用中的Activity
                startActivity(new Intent(ACTION));
            }
        });
    }
}
