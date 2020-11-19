package com.example.mirimdialogtest3;

import androidx.appcompat.app.AlertDialog;
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
        radioPuppy = findViewById(R.id.radio_puppy);
        radioCat = findViewById(R.id.radio_cat);
        radioRabbit = findViewById(R.id.radio_rabbit);
        radioHorse = findViewById(R.id.radio_horse);
        Button btnShow = findViewById(R.id.btn_show);
        btnShow.setOnClickListener(btnShowListener);
    }

    View.OnClickListener btnShowListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialogView = View.inflate(MainActivity.this, R.layout.dialog, null);
            dlgImg = dialogView.findViewById(R.id.img);
            int selectedId = 0;
            String seletedTitle = "";
            switch (rg.getCheckedRadioButtonId()){
                case R.id.radio_puppy:
                    selectedId = R.drawable.puppy;
                    seletedTitle = radioPuppy.getText().toString();
                    break;
                case R.id.radio_cat:
                    selectedId = R.drawable.cat;
                    seletedTitle = radioCat.getText().toString();
                    break;
                case R.id.radio_rabbit:
                    selectedId = R.drawable.rabbit;
                    seletedTitle = radioRabbit.getText().toString();
                    break;
                case R.id.radio_horse:
                    selectedId = R.drawable.horse;
                    seletedTitle = radioHorse.getText().toString();
                    break;
            }
            AlertDialog. Builder  dlg = new AlertDialog.Builder(MainActivity.this);
            dlg.setTitle(seletedTitle);
            dlgImg.setImageResource(selectedId);
            dlg.setView(dialogView);
            dlg.setPositiveButton("닫기", null);
            dlg.show();
        }
    };

}