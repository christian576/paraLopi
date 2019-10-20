package com.example.invitaapp.Model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PeliculaService {
    @GET ("/3/movie/{id}?api_key=25ac4313f0c6a0579d228b6da85f955f")
    Call<Pelicula>traerPelicula(@Path("id")int idPelicula);

    @GET("3/trending/movie/week?api_key=25ac4313f0c6a0579d228b6da85f955f")
    Call<ContainerPeliculas>traerListaDePeliculasTrending();

    @GET ("/3/movie/226?api_key=25ac4313f0c6a0579d228b6da85f955f")
    Call<Pelicula>traerUnaPelicula();


}
