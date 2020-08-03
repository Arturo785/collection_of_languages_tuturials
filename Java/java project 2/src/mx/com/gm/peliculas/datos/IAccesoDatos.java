package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

import java.util.List;

public interface IAccesoDatos {

    boolean exists(String nameOfFile) throws AccesoDatosEx;

    List<Pelicula> listData(String name) throws LecturaDatosEx;

    void writeMovie(Pelicula movie, String nameOfFile, boolean add) throws EscrituraDatosEx;

    String search(String nameOfFile, String query) throws LecturaDatosEx;

    void create(String nameOfFile) throws AccesoDatosEx;

    void erase(String nameOfFile) throws  AccesoDatosEx;

}
