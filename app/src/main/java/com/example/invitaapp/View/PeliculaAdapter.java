package com.example.invitaapp.View;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.invitaapp.Model.Pelicula;
import com.example.invitaapp.R;
import java.util.ArrayList;
import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.PeliculaViewHolder> {

    private List<Pelicula> listaDePeliculas;
    private ListenerDelAdapter listenerDelAdapter;

    public PeliculaAdapter(List<Pelicula> listaDePeliculas){
        this.listaDePeliculas = listaDePeliculas;
    }

    public PeliculaAdapter(ListenerDelAdapter listenerDelAdapter){
        this.listaDePeliculas = new ArrayList<>();
        this.listenerDelAdapter = listenerDelAdapter;
    }

    @NonNull
    @Override
    public PeliculaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflador = LayoutInflater.from(parent.getContext());
        View vista = inflador.inflate(R.layout.celda_pelicula,parent,false);
        PeliculaViewHolder peliculaViewHolder = new PeliculaViewHolder(vista);

        return peliculaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PeliculaViewHolder holder, int position) {
        Pelicula unaPeliculaDeLaLista = listaDePeliculas.get(position);
        holder.CargarPelicula(unaPeliculaDeLaLista);
    }

    @Override
    public int getItemCount() {
        return listaDePeliculas.size();
    }

    public void setPeliculaList(List<Pelicula> peliculaList) {
        this.listaDePeliculas = peliculaList;
        notifyDataSetChanged();
    }


    public class PeliculaViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewPelicula;

        public PeliculaViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewPelicula = itemView.findViewById(R.id.TextViewCeldaPeliculasTituloXML);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Pelicula peliculaSeleccionado = listaDePeliculas.get(getAdapterPosition());
                    listenerDelAdapter.informarPeliculaSeleccionada(peliculaSeleccionado);
                }
            });
        }

        public void CargarPelicula(Pelicula pelicula){
            textViewPelicula.setText(pelicula.getTitulo());
        }
    }

    public interface ListenerDelAdapter{
        public void informarPeliculaSeleccionada (Pelicula pelicula);
    }
}
