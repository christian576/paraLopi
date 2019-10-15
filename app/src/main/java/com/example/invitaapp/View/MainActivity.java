package com.example.invitaapp.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.widget.Toast;

import com.example.invitaapp.Model.Pelicula;
import com.example.invitaapp.R;

public class MainActivity extends AppCompatActivity implements FragmentListaPeliculas.ListenerDelFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pegarFragment(new FragmentListaPeliculas());
    }

    private void pegarFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.LinearLayoutContenedorDeFragmentXML,fragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void recibirPelicula(Pelicula pelicula) {

        Toast.makeText(this, pelicula.getTitulo(), Toast.LENGTH_SHORT).show();

    }
}
