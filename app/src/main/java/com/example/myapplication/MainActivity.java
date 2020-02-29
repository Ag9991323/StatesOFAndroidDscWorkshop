package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   Button btn1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);


            }
        });

        Log.d("error1","I am in on app1 create");
        Toast.makeText(getApplicationContext()," OnCreate",Toast.LENGTH_SHORT).show();
    }
        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d("error1","I am in on app1 restart");
            Toast.makeText(getApplicationContext()," Onrestart",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d("error1","I am in  app1 on start");
            Toast.makeText(getApplicationContext()," Onstart",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d("error1","I am in  app1 on destroy");
            Toast.makeText(getApplicationContext()," Ondestroy",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.d("error1","I am in app1  on pause");
            Toast.makeText(getApplicationContext()," Onpause",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.d("error1","I am in on app1 on stop");
            Toast.makeText(getApplicationContext()," Onstop",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.d("error1","I am in on  app1 resume");
            Toast.makeText(getApplicationContext()," OnResume",Toast.LENGTH_SHORT).show();
        }







}
