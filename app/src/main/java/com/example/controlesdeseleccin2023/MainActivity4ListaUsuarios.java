package com.example.controlesdeseleccin2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.controlesdeseleccin2023.Adaptadores.AdaptadorUsuarios;
import com.example.controlesdeseleccin2023.Interfaces.Actitvity_Detalles;
import com.example.controlesdeseleccin2023.Interfaces.ListadeAlumnos;
import com.example.controlesdeseleccin2023.Modelos.Noticias;
import com.example.controlesdeseleccin2023.Modelos.Usuario;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import WebService.WebService;
import WebService.Asynchtask;

public class MainActivity4ListaUsuarios extends AppCompatActivity implements Asynchtask, AdapterView.OnItemSelectedListener {


    ListView lstOpciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_lista_usuarios);

        //Data
        lstOpciones = (ListView) findViewById(R.id.listUsuario);
        View header = getLayoutInflater().inflate(R.layout.ly_cabecerausuarios, null);
        lstOpciones.addHeaderView(header);
        //click
        lstOpciones.setOnItemClickListener(this::onItemSelected);
        ///
        Map<String, String> datos = new HashMap<String, String>();

        WebService ws= new WebService(
                "https://reqres.in/api/users",
                datos, MainActivity4ListaUsuarios.this, MainActivity4ListaUsuarios.this);
        ws.execute("GET");


    }

    @Override
    public void processFinish(String result) throws JSONException {

        ArrayList<Usuario> lstUsuarios = new ArrayList<Usuario> ();

        JSONObject JSONlista = new JSONObject(result);
        JSONArray JSONlistaUsuarios= JSONlista.getJSONArray("data");
        lstUsuarios = Usuario.JsonObjectsBuild(JSONlistaUsuarios);
        AdaptadorUsuarios adapatorUsuario = new AdaptadorUsuarios(MainActivity4ListaUsuarios.this, lstUsuarios);
        lstOpciones.setAdapter(adapatorUsuario);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "Activi: "
                + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
        //abrir la activiad
        Intent inte = new Intent(this, Actitvity_Detalles.class);
        inte.putExtra("nombre",adapterView.getItemAtPosition(i).toString());
        startActivity(inte);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}