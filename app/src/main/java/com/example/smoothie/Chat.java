package com.example.smoothie;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Chat extends AppCompatActivity {

    private TextView textView;
    private EditText etInputText;
    private Button bSend;
    private Button bNavigate; // เพิ่มตัวแปรที่นี่

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        String Menuname = getIntent().getStringExtra("Menuname");

        // เชื่อมต่อ UI components
        textView = findViewById(R.id.sellerNameTextView);
        etInputText = findViewById(R.id.etInputText);
        bSend = findViewById(R.id.bSend);
        bNavigate = findViewById(R.id.bNavigate); // เชื่อมต่อปุ่มที่นี่

        // ตรวจสอบค่า menuname
        if (Menuname == null || Menuname.isEmpty()) {
            Menuname = "Menu"; // ใช้ข้อความแทนที่
        }

        textView.setText(" Review " + Menuname);

        bSend.setOnClickListener(v -> {
            String message = etInputText.getText().toString();
            if (message.isEmpty()) {
                Toast.makeText(this, "Please enter a message", Toast.LENGTH_SHORT).show();
            } else {
                textView.append("\n" + message);
                etInputText.setText("");
            }
        });

        etInputText.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                bSend.performClick();
                return true;
            }
            return false;
        });

        // ตั้งค่าการคลิกปุ่มเพื่อไปยัง VideoActivity
        bNavigate.setOnClickListener(v -> {
            Intent intent = new Intent(Chat.this, VideoActivity.class);
            startActivity(intent);
        });
    }
}
