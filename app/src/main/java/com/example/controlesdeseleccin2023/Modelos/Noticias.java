package com.example.controlesdeseleccin2023.Modelos;

public class Noticias {
    private String titulo;
    private String subtitulo;

    public Noticias(String tit, String sub) {
        this.titulo = tit;    this.subtitulo = sub;
    }

    public String getTitulo() { return titulo; }

    public String getSubtitulo() { return subtitulo; }

    @Override
    public String toString(){return titulo+" "+ subtitulo;}
}
