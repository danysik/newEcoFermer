package com.example.newecofermer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);
       AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
       animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

    }

    public void home(View view) {

        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void registory(View view) {
        Intent intent = new Intent(this, registory.class);
        startActivity(intent);
    }


}