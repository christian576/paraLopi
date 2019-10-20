package com.example.invitaapp.Model;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


import com.example.invitaapp.Utils.ResultListener;
import java.util.ArrayList;
import java.util.List;

public class PeliculaDao extends PeliculaRetrofitDAO{
    private static final String BASE_URL_API = "https://api.themoviedb.org";
    private static final String BASE_URL_IMG= "https://image.tmdb.org/t/p/w200/";
    public PeliculaDao() {
        super(BASE_URL_API);
    }

    public void traerPelicula(final ResultListener<List<Pelicula>> listenerDelControler) {

       Call<ContainerPeliculas> call =  peliculaService.traerListaDePeliculasTrending();





       call.enqueue(new Callback<ContainerPeliculas>() {
           @Override
           public void onResponse(Call<ContainerPeliculas> call, Response<ContainerPeliculas> response) {
               ContainerPeliculas containerPeliculas = response.body();
               listenerDelControler.finish(containerPeliculas.getPeliculaList());
               List<Pelicula>laListaDePelicula = containerPeliculas.getPeliculaList();
             /*  private void pegarImagenPelicula(laListaDePelicula){

                   for (Pelicula unaPelicula:laListaDePelicula) {
                       String unaUrlImagen = unaPelicula.getUrlImagen();




                   }
               }*/
           }

           @Override
           public void onFailure(Call<ContainerPeliculas> call, Throwable t) {

           }
       });

        }

       /* List<Pelicula> listaDePeliculas = new ArrayList<>();

        listaDePeliculas.add(new Pelicula("Freddy","https://i.pinimg.com/564x/3d/bd/ee/3dbdee192aa8ad8ef1290422d2417454.jpg"));
        listaDePeliculas.add(new Pelicula("Misery","https://media.revistagq.com/photos/5ca5e06d267a32c4ec720e7a/master/w_851,c_limit/las_100_mejores_peliculas_de_terror_de_la_historia_937104698.jpg"));
        listaDePeliculas.add(new Pelicula("Luciferina", "https://media.diariopopular.com.ar/adjuntos/143/imagenes/005/499/0005499547.jpg"));
        listaDePeliculas.add(new Pelicula("Hellfest", "https://los40.com/los40/imagenes/2018/10/29/album/1540826301_513913_1540826496_album_normal.jpg"));
        listaDePeliculas.add(new Pelicula("Mas alla del cielo", "https://i.pinimg.com/236x/36/e6/35/36e635f9b6a5517dbc9e74e9e9ad7bcb.jpg"));
        listaDePeliculas.add(new Pelicula("Una bolsa de canicas","https://comentamoscine.files.wordpress.com/2018/01/una-bolsa-de-canicas.jpg"));
        listaDePeliculas.add(new Pelicula("Lo que de verdad importa", "https://www1.cinecalidad.top/espana/wp-content/uploads/2017/11/lo-que-de-verdad-importa-220x320.jpg"));
        listaDePeliculas.add(new Pelicula("Querido John", "http://90peliculas.com/wp-content/uploads/2018/07/Querido-John.jpg"));
        listaDePeliculas.add(new Pelicula("Invierno profundo","https://static.pelisplus.co/movie/cover/original/40fb9f123fe4dc200cc39dfa5dcc4d6a.jpg"));
        listaDePeliculas.add(new Pelicula("El rito", "http://4.bp.blogspot.com/-swujQKeqlWg/TgHh8sw2xUI/AAAAAAAADrY/rEk8zKw_FZo/s1600/El+Rito+2011.jpg"));
        listaDePeliculas.add(new Pelicula("Septimo","http://agenciasanluis.com/wp-content/uploads/2013/09/CINE-ESTRENO.jpg"));
        listaDePeliculas.add(new Pelicula("Invasion a la privacidad", "https://pbs.twimg.com/media/DRBtFaEW0AAsB7d.jpg"));
*/
        //listenerDelControler.finish(listaDePeliculas);


    public static void traerPelicula2(ResultListener<List<Pelicula>> listenerDelControler2) {

        List<Pelicula> listaDePeliculas2 = new ArrayList<>();

        listaDePeliculas2.add(new Pelicula("Mas alla del cielo", "https://i.pinimg.com/236x/36/e6/35/36e635f9b6a5517dbc9e74e9e9ad7bcb.jpg"));
        listaDePeliculas2.add(new Pelicula("Una bolsa de canicas","https://comentamoscine.files.wordpress.com/2018/01/una-bolsa-de-canicas.jpg"));
        listaDePeliculas2.add(new Pelicula("Lo que de verdad importa", "https://www1.cinecalidad.top/espana/wp-content/uploads/2017/11/lo-que-de-verdad-importa-220x320.jpg"));
        listaDePeliculas2.add(new Pelicula("Querido John", "http://90peliculas.com/wp-content/uploads/2018/07/Querido-John.jpg"));
        listaDePeliculas2.add(new Pelicula("Invierno profundo","https://static.pelisplus.co/movie/cover/original/40fb9f123fe4dc200cc39dfa5dcc4d6a.jpg"));
        listaDePeliculas2.add(new Pelicula("El rito", "http://4.bp.blogspot.com/-swujQKeqlWg/TgHh8sw2xUI/AAAAAAAADrY/rEk8zKw_FZo/s1600/El+Rito+2011.jpg"));
        listaDePeliculas2.add(new Pelicula("Septimo","http://agenciasanluis.com/wp-content/uploads/2013/09/CINE-ESTRENO.jpg"));
        listaDePeliculas2.add(new Pelicula("Invasion a la privacidad", "https://pbs.twimg.com/media/DRBtFaEW0AAsB7d.jpg"));


        listenerDelControler2.finish(listaDePeliculas2);
    }

    public static void traerPelicula3(ResultListener<List<Pelicula>> listenerDelControler3) {

        List<Pelicula> listaDePeliculas3 = new ArrayList<>();

        listaDePeliculas3.add(new Pelicula("Invierno profundo","https://static.pelisplus.co/movie/cover/original/40fb9f123fe4dc200cc39dfa5dcc4d6a.jpg"));
        listaDePeliculas3.add(new Pelicula("Septimo","http://agenciasanluis.com/wp-content/uploads/2013/09/CINE-ESTRENO.jpg"));
        listaDePeliculas3.add(new Pelicula("Invasion a la privacidad", "https://pbs.twimg.com/media/DRBtFaEW0AAsB7d.jpg"));
        listaDePeliculas3.add(new Pelicula("Mas alla del cielo", "https://i.pinimg.com/236x/36/e6/35/36e635f9b6a5517dbc9e74e9e9ad7bcb.jpg"));
        listaDePeliculas3.add(new Pelicula("Una bolsa de canicas","https://comentamoscine.files.wordpress.com/2018/01/una-bolsa-de-canicas.jpg"));
        listaDePeliculas3.add(new Pelicula("Lo que de verdad importa", "https://www1.cinecalidad.top/espana/wp-content/uploads/2017/11/lo-que-de-verdad-importa-220x320.jpg"));
        listaDePeliculas3.add(new Pelicula("Invierno profundo","https://static.pelisplus.co/movie/cover/original/40fb9f123fe4dc200cc39dfa5dcc4d6a.jpg"));
        listaDePeliculas3.add(new Pelicula("Invasion a la privacidad", "https://pbs.twimg.com/media/DRBtFaEW0AAsB7d.jpg"));


        listenerDelControler3.finish(listaDePeliculas3);
    }


    public static void traerPelicula4(ResultListener<List<Pelicula>> listenerDelControler4) {

        List<Pelicula> listaDePeliculas4 = new ArrayList<>();

        listaDePeliculas4.add(new Pelicula("Toy Story","https://www.todoinfantil.com/img/pelicula/toy-story-4.jpg"));
        listaDePeliculas4.add(new Pelicula("Dory", "https://cdnb.20m.es/sites/55/2015/09/pixar_finding-dory11-300x233.jpg"));
        listaDePeliculas4.add(new Pelicula("Ole","https://http2.mlstatic.com/el-cavernicola-peliculas-infantiles-descarga-directa-D_NQ_NP_805307-MLA27469784236_052018-F.jpg"));
        listaDePeliculas4.add(new Pelicula("Mas alla del cielo", "https://i.pinimg.com/236x/36/e6/35/36e635f9b6a5517dbc9e74e9e9ad7bcb.jpg"));
        listaDePeliculas4.add(new Pelicula("Una bolsa de canicas","https://comentamoscine.files.wordpress.com/2018/01/una-bolsa-de-canicas.jpg"));
        listaDePeliculas4.add(new Pelicula("Lo que de verdad importa", "https://www1.cinecalidad.top/espana/wp-content/uploads/2017/11/lo-que-de-verdad-importa-220x320.jpg"));
        listaDePeliculas4.add(new Pelicula("Querido John", "http://90peliculas.com/wp-content/uploads/2018/07/Querido-John.jpg"));
        listaDePeliculas4.add(new Pelicula("Invierno profundo","https://static.pelisplus.co/movie/cover/original/40fb9f123fe4dc200cc39dfa5dcc4d6a.jpg"));
        listaDePeliculas4.add(new Pelicula("El rito", "http://4.bp.blogspot.com/-swujQKeqlWg/TgHh8sw2xUI/AAAAAAAADrY/rEk8zKw_FZo/s1600/El+Rito+2011.jpg"));
        listaDePeliculas4.add(new Pelicula("Septimo","http://agenciasanluis.com/wp-content/uploads/2013/09/CINE-ESTRENO.jpg"));
        listaDePeliculas4.add(new Pelicula("Invasion a la privacidad", "https://pbs.twimg.com/media/DRBtFaEW0AAsB7d.jpg"));

        /*  listaDePeliculas4.add(new Pelicula("Alvaro"));
        listaDePeliculas4.add(new Pelicula("Alvarito"));
        listaDePeliculas4.add(new Pelicula("Alva"));*/


        listenerDelControler4.finish(listaDePeliculas4);
    }

}
