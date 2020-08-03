package mx.com.gm.peliculas.servicio;

public interface ICatalogoPeliculas {

    void addMovie(String nameOfMovie, String nameOfFile);

    void listMovies(String nameOfFile);

    void searchMovie(String nameOfFile, String query);

    void resetMovies(String file);

}
