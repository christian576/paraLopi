package com.example.invitaapp.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Pelicula implements Serializable {

    @SerializedName("title")
    private String titulo;
    @SerializedName("backdrop_path")
    private String urlImagen;


    public Pelicula(String titulo, String urlImagen) {

        this.titulo = titulo;
        this.urlImagen = urlImagen;
    }


    public String getTitulo() {

        return titulo;
    }

    public String getUrlImagen() {
        return urlImagen;
    }


}
