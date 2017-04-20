package com.example.quoctuan.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyCheKhuatToanBo(View view) {

        Intent intent = new Intent  (MainActivity.this,
                                    ManHinh2Activity.class);

        startActivity(intent);

    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(MainActivity.this,
                "onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(MainActivity.this,
                "onResume",
                Toast.LENGTH_LONG).
                show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(MainActivity.this,
                "OnPause",
                Toast.LENGTH_LONG).
                show();
    }
    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(MainActivity.this,
                "onStop",Toast.LENGTH_LONG).show();

    }
    
    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(MainActivity.this,
                "onRestart",
                Toast.LENGTH_LONG).
                show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(MainActivity.this,
                "onDestroy",
                Toast.LENGTH_LONG).
                show();
    }


    public void xuLyCheKhuatMotPhan(View view) {

        Intent intent = new Intent  (MainActivity.this,
                ManHinh3Activity.class);

        startActivity(intent);

    }
}
