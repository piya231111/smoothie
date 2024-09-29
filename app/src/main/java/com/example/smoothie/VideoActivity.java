package com.example.smoothie;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class VideoActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView = findViewById(R.id.videoView);

        // ตั้งค่า URI สำหรับวิดีโอจาก res/raw
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.waannn); // เปลี่ยนเป็นชื่อไฟล์วิดีโอของคุณ
        videoView.setVideoURI(videoUri);
        videoView.start();
    }
}
