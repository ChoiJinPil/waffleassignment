package com.example.wafflerecruitingcjp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void introduction (View view) {
        Intent intent = new Intent(this, introduction.class);
        startActivity(intent);


    }
    public void why (View view) {
        Intent intent = new Intent(this, why.class);
        startActivity(intent);


    }
    public void horse (View view) {
        Intent intent = new Intent(this, horse.class);
        startActivity(intent);

    }
}
