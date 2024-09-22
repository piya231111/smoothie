package com.example.smoothie;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detail);



        ImageView imageView1 = findViewById(R.id.imageView1);
        imageView1.setOnClickListener(v -> {
            Intent intent = new Intent(Menu_detail.this, Menu.class);
            intent.putExtra("menuType", "smoothie");
            startActivity(intent);
        });

        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.setOnClickListener(v -> {
            Intent intent = new Intent(Menu_detail.this, Menu.class);
            intent.putExtra("menuType", "food");
            startActivity(intent);
        });

        ImageView imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(v -> {
            Intent intent = new Intent(Menu_detail.this, Menu.class);
            intent.putExtra("menuType", "dessert");
            startActivity(intent);
        });

    }
}
