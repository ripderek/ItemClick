package com.example.controlesdeseleccin2023.Interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.controlesdeseleccin2023.R;

public class Actitvity_Detalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actitvity_detalles);
        TextView txt = findViewById(R.id.textView4);
        txt.setText( getIntent().getStringExtra("nombre"));
    }
}