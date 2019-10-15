package com.example.invitaapp.View;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.invitaapp.Controller.PeliculaController;
import com.example.invitaapp.Model.Pelicula;
import com.example.invitaapp.R;
import com.example.invitaapp.Utils.ResultListener;

import java.util.List;

public class FragmentListaPeliculas extends Fragment implements PeliculaAdapter.ListenerDelAdapter {

    private RecyclerView recyclerViewFragmentListaPeliculas;
    private ListenerDelFragment listenerDelFragment;

    public FragmentListaPeliculas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View visteDelFragment = inflater.inflate(R.layout.fragment_lista_peliculas, container, false);

        recyclerViewFragmentListaPeliculas = visteDelFragment.findViewById(R.id.RecyclerViewFragmentListaPeliculasXML);

        final PeliculaAdapter peliculaAdapter = new PeliculaAdapter(this);
        PeliculaController peliculaController = new PeliculaController();
        peliculaController.traerInvitado(new ResultListener<List<Pelicula>>() {
            @Override
            public void finish(List<Pelicula> result) {

                peliculaAdapter.setPeliculaList(result);
            }
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerViewFragmentListaPeliculas.setLayoutManager(linearLayoutManager);
        recyclerViewFragmentListaPeliculas.setAdapter(peliculaAdapter);

        return visteDelFragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listenerDelFragment = (ListenerDelFragment) context;
    }

    @Override
    public void informarPeliculaSeleccionada(Pelicula pelicula) {
        listenerDelFragment.recibirPelicula(pelicula);
    }

    public interface ListenerDelFragment{
        public void recibirPelicula(Pelicula pelicula);
    }
}