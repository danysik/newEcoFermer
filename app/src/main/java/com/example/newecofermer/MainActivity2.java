package com.example.newecofermer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout1);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
    }


    public void odin(View view) {
        Toast.makeText(this, "Продукт добавлен в корзину", Toast.LENGTH_SHORT).show();
    }

    public void dva(View view) {
        Toast.makeText(this, "Продукт добавлен в корзину", Toast.LENGTH_SHORT).show();
    }

    public void tri(View view) {
        Toast.makeText(this, "Продукт добавлен в корзину", Toast.LENGTH_SHORT).show();
    }

    public void chetiri(View view) {
        Toast.makeText(this, "Продукт добавлен в корзину", Toast.LENGTH_SHORT).show();
    }

    public void pyatb(View view) {
        Toast.makeText(this, "Продукт добавлен в корзину", Toast.LENGTH_SHORT).show();
    }

    public void shest(View view) {
        Toast.makeText(this, "Продукт добавлен в корзину", Toast.LENGTH_SHORT).show();
    }
}