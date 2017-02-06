package com.jikexueyuan.apppermission;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CheckPermission extends AppCompatActivity {

    public static final String GET_PERMISSION = "com.jikexueyuan.apppermission.permission.GET_PERMISSION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_permission);
    }

    public static void checkPermission(Context context){
        int result = context.checkCallingOrSelfPermission(GET_PERMISSION);

//        检察权限
        if (result != PackageManager.PERMISSION_GRANTED){
            throw new SecurityException("未获得执行权限");
        } else{
            System.out.println("程序运行成功!");
        }
    }
}
