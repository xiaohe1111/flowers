package com.example.flower;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //打开新界面
    public void openThree(View btn){
        Log.i("open","openOne:");
        Intent config = new Intent(this,MainActivity2.class);
        startActivityForResult(config,5);
    }

    public void openTwo(View btn){
        Log.i("open","openOne:");
        Intent config = new Intent(this,MainActivity3.class);
        startActivityForResult(config,5);
    }




}