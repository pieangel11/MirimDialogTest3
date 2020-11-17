package com.example.mirimdialogtest3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton radioPuppy, radioCat, radioRabbit, radioHorse;
    View dialogView;
    ImageView dlgImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.rg);
        Button btnShow = findViewById(R.id.btn_show);
    }
}