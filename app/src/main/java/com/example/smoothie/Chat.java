package com.example.smoothie;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Chat extends AppCompatActivity {

    private TextView textView;
    private EditText etInputText;
    private Button bSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        String menuname = getIntent().getStringExtra("menuname");

        // เชื่อมต่อ UI components
        textView = findViewById(R.id.sellerNameTextView);
        etInputText = findViewById(R.id.etInputText);
        bSend = findViewById(R.id.bSend);

        // ตรวจสอบค่า menuname
        if (menuname == null || menuname.isEmpty()) {
            menuname = "Unknown Seller"; // ใช้ข้อความแทนที่
        }

        textView.setText("Chat with " + menuname);

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

    }
}