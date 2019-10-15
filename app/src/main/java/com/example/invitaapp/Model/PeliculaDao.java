package com.example.invitaapp.Model;
import com.example.invitaapp.Utils.ResultListener;
import java.util.ArrayList;
import java.util.List;

public class PeliculaDao {

    public static void traerPelicula(ResultListener<List<Pelicula>> listenerDelControler) {

        List<Pelicula> listaDePeliculas = new ArrayList<>();

        listaDePeliculas.add(new Pelicula("christian"));
        listaDePeliculas.add(new Pelicula("christia"));
        listaDePeliculas.add(new Pelicula("christi"));
        listaDePeliculas.add(new Pelicula("christ"));
        listaDePeliculas.add(new Pelicula("chris"));
        listaDePeliculas.add(new Pelicula("christian"));
        listaDePeliculas.add(new Pelicula("christia"));
        listaDePeliculas.add(new Pelicula("christi"));
        listaDePeliculas.add(new Pelicula("christ"));
        listaDePeliculas.add(new Pelicula("chris"));

        listenerDelControler.finish(listaDePeliculas);
    }
}
