package com.example.controlesdeseleccin2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class verNoticia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_noticia);

        Bundle b = new Bundle();
        b = this.getIntent().getExtras();
        TextView txtTitulo = findViewById(R.id.txtTitulo);
        TextView txtDescripcion = findViewById(R.id.txtSubtitulo);

        txtTitulo.setText(b.getString("Titulo"));
        txtDescripcion.setText(b.getString("Subtitulo"));

    }
}