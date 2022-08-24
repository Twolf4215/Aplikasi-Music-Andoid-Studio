package com.example.soc_macmini_15.musicplayer.Model;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.soc_macmini_15.musicplayer.Activity.MainActivity;
import com.example.soc_macmini_15.musicplayer.R;


public class about extends AppCompatActivity {

    Button tombol;
    Intent pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        tombol = (Button) findViewById(R.id.kembali);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(about.this, MainActivity.class);
                startActivity(pindah);
                finish();
            }
        });
    }
}