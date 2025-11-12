package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btnMove, btnBlink, btnFade, btnClockwise, btnZoom, btnSlide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        btnMove = findViewById(R.id.btnMove);
        btnBlink = findViewById(R.id.btnBlink);
        btnFade = findViewById(R.id.btnFade);
        btnClockwise = findViewById(R.id.btnClockwise);
        btnZoom = findViewById(R.id.btnZoom);
        btnSlide = findViewById(R.id.btnSlide);

        btnMove.setOnClickListener(v -> startAnimation(R.anim.move));
        btnBlink.setOnClickListener(v -> startAnimation(R.anim.blink));
        btnFade.setOnClickListener(v -> startAnimation(R.anim.fade));
        btnClockwise.setOnClickListener(v -> startAnimation(R.anim.clockwise));
        btnZoom.setOnClickListener(v -> startAnimation(R.anim.zoom));
        btnSlide.setOnClickListener(v -> startAnimation(R.anim.slide));
    }

    private void startAnimation(int animResId) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), animResId);
        imageView.startAnimation(animation);
    }
}
