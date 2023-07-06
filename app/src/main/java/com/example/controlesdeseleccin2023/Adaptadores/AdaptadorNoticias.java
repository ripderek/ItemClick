package com.example.controlesdeseleccin2023.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.controlesdeseleccin2023.Modelos.Noticias;
import com.example.controlesdeseleccin2023.R;

public class  AdaptadorNoticias extends ArrayAdapter<Noticias> {
    public AdaptadorNoticias(Context context, Noticias[] datos) {
        super(context, R.layout.lyitemnoticias, datos);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lyitemnoticias, null);
        TextView lblTitulo = (TextView)item.findViewById(R.id.LblTitulo);
        lblTitulo.setText(getItem(position).getTitulo());
        TextView lblSubtitulo = (TextView)item.findViewById(R.id.LblSubTitulo);
        lblSubtitulo.setText(getItem(position).getSubtitulo());
        return(item);
    }
}