package com.example.invitaapp.Controller;

import com.example.invitaapp.Model.Pelicula;
import com.example.invitaapp.Model.PeliculaDao;
import com.example.invitaapp.Utils.ResultListener;

import java.util.List;

public class PeliculaController {

    public void traerInvitado(final ResultListener<List<Pelicula>> listenerDeLaVista ){

        PeliculaDao peliculaDao = new PeliculaDao();


        peliculaDao.traerPelicula(new ResultListener<List<Pelicula>>() {
            @Override
            public void finish(List<Pelicula> result) {

                listenerDeLaVista.finish(result);
            }
        });
    }

    public void traerInvitado2(final ResultListener<List<Pelicula>> listenerDeLaVista ){

        PeliculaDao peliculaDao = new PeliculaDao();

        peliculaDao.traerPelicula2(new ResultListener<List<Pelicula>>() {
            @Override
            public void finish(List<Pelicula> result) {

                listenerDeLaVista.finish(result);
            }
        });
    }

    public void traerInvitado3(final ResultListener<List<Pelicula>> listenerDeLaVista ){

        PeliculaDao peliculaDao = new PeliculaDao();

        peliculaDao.traerPelicula3(new ResultListener<List<Pelicula>>() {
            @Override
            public void finish(List<Pelicula> result) {

                listenerDeLaVista.finish(result);
            }
        });
    }
    public void traerInvitado4(final ResultListener<List<Pelicula>> listenerDeLaVista ){

        PeliculaDao peliculaDao = new PeliculaDao();

        peliculaDao.traerPelicula4(new ResultListener<List<Pelicula>>() {
            @Override
            public void finish(List<Pelicula> result) {

                listenerDeLaVista.finish(result);
            }
        });
    }
}
