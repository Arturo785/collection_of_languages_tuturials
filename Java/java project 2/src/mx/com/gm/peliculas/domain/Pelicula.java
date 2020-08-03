package mx.com.gm.peliculas.domain;

public class Pelicula {

    private String name;

    public Pelicula() {
    }

    public Pelicula(String name) {
        this.name = name;
    }

    //region getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //endregion


    @Override
    public String toString() {
        return this.name;
    }
}
