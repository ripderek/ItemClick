package com.example.controlesdeseleccin2023.Interfaces;


import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;


public class ListadeAlumnos implements AdapterView.OnItemClickListener {

    Context ctx;

    public ListadeAlumnos(Context ctx){    this.ctx=ctx;   }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(ctx, "Ha seleccionado al alumno: "
                + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
        ////Intent inte = new Intent(ctx, Actitvity_Detalles.class);
       /// startActivity(inte);
    }
}
