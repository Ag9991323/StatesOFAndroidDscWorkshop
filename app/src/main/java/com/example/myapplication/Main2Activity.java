package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("error1","I am in app2 on create");
        Toast.makeText(getApplicationContext()," Oncreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("error1","I am in on app2 restart");
        Toast.makeText(getApplicationContext()," Onrestart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("error1","I am in  app2 on start");
        Toast.makeText(getApplicationContext()," Onstart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("error1","I am in  app2 on destroy");
        Toast.makeText(getApplicationContext()," Ondestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("error1","I am in app2  on pause");
        Toast.makeText(getApplicationContext()," Onpause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("error1","I am in on app2 on stop");
        Toast.makeText(getApplicationContext()," Onstop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("error1","I am in on  app2 resume");
        Toast.makeText(getApplicationContext()," OnResume",Toast.LENGTH_SHORT).show();
    }
}
