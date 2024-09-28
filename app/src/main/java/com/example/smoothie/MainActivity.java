package com.example.smoothie;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Menu_detail.class);
            startActivity(intent);
        });

        // โหลด GIF แทนรูปภาพ
        ImageView gifImageView = findViewById(R.id.gifImageView);
        Glide.with(this)
                .load("https://i.pinimg.com/originals/e3/8b/65/e38b65897bc08b931b873c26a8b49738.gif") // URL ของ GIF
                .into(gifImageView);

    }
}
