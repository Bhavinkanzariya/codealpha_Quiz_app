package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resultshow extends AppCompatActivity {

    TextView right,wrong;
    TextView play,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultshow);

        play = findViewById(R.id.play);
        home = findViewById(R.id.home);

        right = findViewById(R.id.right);
        wrong = findViewById(R.id.wrong);

        Intent intent = getIntent();
        int currectans = intent.getIntExtra("currect",0);
        int wrongans = 5 - currectans;

        String currect = String.valueOf(currectans);
        String wronga = String.valueOf(wrongans);

        right.setText(currect);
        wrong.setText(wronga);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), easy.class);
                startActivity(intent);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),diffcal.class);
                startActivity(intent);
            }
        });

    }
}