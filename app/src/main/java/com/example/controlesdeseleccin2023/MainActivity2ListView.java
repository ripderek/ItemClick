package com.example.controlesdeseleccin2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.controlesdeseleccin2023.Interfaces.ListadeAlumnos;

public class MainActivity2ListView extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_list_view);

        //Los datos
        final String[] datos =
                new String[]{
                        "HECTOR MIGUEL CASANOVA MORANTE",
                        "ORLANDO JESUS CEDEÑO SALVATIERRA",
                        "VALESKA SOFIA CHICA VALFRE",
                        "RAUL STEVEN COELLO CASTILLO",
                        "ANDERSON DAVID JAIME PESANTEZ",
                        "ANDERSON DAVID JAIME PESANTEZ",
                        "JHON BYRON LETURNE PLUAS",
                        "VICTOR JOSE MOLINA MOSQUERA",
                        "LUIS RICARDO NUÑEZ ROSADO",
                        "JOHN KLEINER VERA MACIAS",
                        "JOHN KLEINER VERA MACIAS"};

        //Adaptador
        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        datos);
        //Vista
        ListView lstOpciones = (ListView)findViewById(R.id.listaUsuarios);
        lstOpciones.setAdapter(adaptador2);
        lstOpciones.setOnItemClickListener(
                new ListadeAlumnos(this.getApplicationContext()));

    }

}