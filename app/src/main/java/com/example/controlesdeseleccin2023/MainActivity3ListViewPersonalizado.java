package com.example.controlesdeseleccin2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.controlesdeseleccin2023.Adaptadores.AdaptadorNoticias;
import com.example.controlesdeseleccin2023.Interfaces.ListadeAlumnos;
import com.example.controlesdeseleccin2023.Modelos.Noticias;

public class MainActivity3ListViewPersonalizado extends AppCompatActivity implements AdapterView.OnItemClickListener {

    public Noticias[] noticias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_list_view_personalizado);

        //Data
        noticias = new Noticias[]{
                new Noticias("Noticia 1", "SubNoticia Contenido Contenido Contenido Contenido 1"),
                new Noticias("Noticia 2", "SubNoticia Contenido Contenido Contenido Contenido 2"),
                new Noticias("Noticia 3", "SubNoticia Contenido Contenido Contenido Contenido 3"),
                new Noticias("Noticia 4", "SubNoticia Contenido Contenido Contenido Contenido 4")};


        //Adpatador
        AdaptadorNoticias adaptadornoticias = new AdaptadorNoticias(this, noticias);

        //Vista
        ListView lstOpciones = (ListView)findViewById(R.id.lstLista2);

        View header =
                getLayoutInflater().inflate(
                        R.layout.ly_cabeceranoticias
                        , null);
        lstOpciones.addHeaderView(header);

        lstOpciones.setAdapter(adaptadornoticias);
        //lstOpciones.setOnItemClickListener(
              //  new ListadeAlumnos(this.getApplicationContext()));

        lstOpciones.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(MainActivity3ListViewPersonalizado.this, verNoticia.class);
        Bundle b = new Bundle();
        Noticias noticia = (Noticias)adapterView.getItemAtPosition(i);
        b.putString("Titulo", noticia.getTitulo());
        b.putString("Subtitulo",noticia.getSubtitulo());
        intent.putExtras(b);
        startActivity(intent);

    }
}