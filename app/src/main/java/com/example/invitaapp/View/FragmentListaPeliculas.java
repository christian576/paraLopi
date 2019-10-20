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
    private RecyclerView recyclerViewFragmentListaPeliculas2;
    private RecyclerView recyclerViewFragmentListaPeliculas3;
    private RecyclerView recyclerViewFragmentListaPeliculas4;
    private ListenerDelFragment listenerDelFragment;


   /* public FragmentListaPeliculas() {
        // Required empty public constructor
    }
*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View vistaDelFragment = inflater.inflate(R.layout.fragment_lista_peliculas, container, false);

        inflarVistas(vistaDelFragment);

        final PeliculaAdapter peliculaAdapter1 = new PeliculaAdapter(this);
        final PeliculaAdapter peliculaAdapter2 = new PeliculaAdapter(this);
        final PeliculaAdapter peliculaAdapter3 = new PeliculaAdapter(this);
        final PeliculaAdapter peliculaAdapter4 = new PeliculaAdapter(this);

        final PeliculaController peliculaController = new PeliculaController();

   /*     peliculaController.traerInvitado(new ResultListener<List<Pelicula>>() {
            @Override
            public void finish(List<Pelicula> result) {
                peliculaAdapter1.setPeliculaList(result);
            }
        });
        peliculaController.traerInvitado2(new ResultListener<List<Pelicula>>() {
            @Override
            public void finish(List<Pelicula> result) {
                peliculaAdapter2.setPeliculaList(result);
            }
        });
        peliculaController.traerInvitado3(new ResultListener<List<Pelicula>>() {
            @Override
            public void finish(List<Pelicula> result) {
                peliculaAdapter3.setPeliculaList(result);
            }
        });
        peliculaController.traerInvitado4(new ResultListener<List<Pelicula>>() {
            @Override
            public void finish(List<Pelicula> result) {
                peliculaAdapter4.setPeliculaList(result);
            }
        });*/

   peliculaController.traerInvitado(new ResultListener<List<Pelicula>>() {
       @Override
       public void finish(List<Pelicula> result) {
           peliculaAdapter1.setPeliculaList(result);
       }
   });


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerViewFragmentListaPeliculas.setLayoutManager(linearLayoutManager);
        recyclerViewFragmentListaPeliculas.setAdapter(peliculaAdapter1);
        recyclerViewFragmentListaPeliculas2.setLayoutManager(linearLayoutManager2);
        recyclerViewFragmentListaPeliculas2.setAdapter(peliculaAdapter2);
        recyclerViewFragmentListaPeliculas3.setLayoutManager(linearLayoutManager3);
        recyclerViewFragmentListaPeliculas3.setAdapter(peliculaAdapter3);
        recyclerViewFragmentListaPeliculas4.setLayoutManager(linearLayoutManager4);
        recyclerViewFragmentListaPeliculas4.setAdapter(peliculaAdapter4);


        return vistaDelFragment;
    }

    private void inflarVistas(View view) {
        recyclerViewFragmentListaPeliculas = view.findViewById(R.id.RecyclerViewFragmentListaPeliculasXML);
        recyclerViewFragmentListaPeliculas2= view.findViewById(R.id.RecyclerViewFragmentListaPeliculas2);
        recyclerViewFragmentListaPeliculas3= view.findViewById(R.id.RecyclerViewFragmentListaPeliculas3);
        recyclerViewFragmentListaPeliculas4=view.findViewById(R.id.RecyclerViewFragmentListaPeliculas4);
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
        void recibirPelicula(Pelicula pelicula);
    }
}