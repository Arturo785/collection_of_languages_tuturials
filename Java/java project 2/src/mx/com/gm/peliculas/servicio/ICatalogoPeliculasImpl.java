package mx.com.gm.peliculas.servicio;

import mx.com.gm.peliculas.datos.IAccesoDatos;
import mx.com.gm.peliculas.datos.IAccesoDatosImpl;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class ICatalogoPeliculasImpl implements ICatalogoPeliculas {

   private final IAccesoDatos data;

   public ICatalogoPeliculasImpl(){
       this.data = new IAccesoDatosImpl();
   }

    @Override
    public void addMovie(String nameOfMovie, String nameOfFile) {
        try {
            var add = data.exists(nameOfFile); // if exists add to last otherwise creates new
            data.writeMovie(new Pelicula(nameOfMovie),nameOfFile,add);
        } catch (EscrituraDatosEx escrituraDatosEx) {
            escrituraDatosEx.printStackTrace();
            System.out.println("Error adding movie");
        } catch (AccesoDatosEx accesoDatosEx) {
            accesoDatosEx.printStackTrace();
        }
    }

    @Override
    public void listMovies(String nameOfFile) {
        try {
           var movies =  data.listData(nameOfFile);
           movies.forEach(movie -> {
               System.out.println("Pelicula : " + movie);
           });
        } catch (LecturaDatosEx lecturaDatosEx) {
            lecturaDatosEx.printStackTrace();
            System.out.println("Error listing movies");
        }
    }

    @Override
    public void searchMovie(String nameOfFile, String query) {
        try {
           var result =  data.search(nameOfFile,query);
           System.out.println(result);
        } catch (LecturaDatosEx lecturaDatosEx) {
            lecturaDatosEx.printStackTrace();
            System.out.println("Error searching movie");
        }
    }

    @Override
    public void resetMovies(String file) {

        try {
            if (data.exists(file)) {
                data.erase(file);
            }
            data.create(file);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
