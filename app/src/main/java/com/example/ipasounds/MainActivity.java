package com.example.ipasounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // id 선원
    TextView tv_a1;
    Button btn_a1, btn_a2, btn_a3, btn_a4, btn_a5;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // id 찾기
        tv_a1 = findViewById(R.id.tv_a1);
        btn_a1 = findViewById(R.id.btn_a1);
        btn_a2 = findViewById(R.id.btn_a2);
        btn_a3 = findViewById(R.id.btn_a3);
        btn_a4 = findViewById(R.id.btn_a4);
        btn_a5 = findViewById(R.id.btn_a5);



        // btn_a1의 사용
        btn_a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a1);
                mediaPlayer.start();
            }
        });
        btn_a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a2);
                mediaPlayer.start();
            }
        });
        btn_a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a3);
                mediaPlayer.start();
            }
        });
        btn_a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a4);
                mediaPlayer.start();
            }
        });
        btn_a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a5);
                mediaPlayer.start();
            }
        });
    }
}