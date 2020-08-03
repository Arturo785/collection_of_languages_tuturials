package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IAccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean exists(String nameOfFile) throws AccesoDatosEx {
        File file = new File(nameOfFile);
        return  file.exists();
    }

    @Override
    public List<Pelicula> listData(String name) throws LecturaDatosEx {
        List<Pelicula> movies = new ArrayList<>();
        File file = new File(name);

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            var movie = buffer.readLine();
            while (movie != null){
                movies.add( new Pelicula(movie));
                movie = buffer.readLine();
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Error reading movies" + e.getMessage());
        }

        return movies;
    }

    @Override
    public void writeMovie(Pelicula movie, String nameOfFile, boolean add) throws EscrituraDatosEx {
        File file = new File(nameOfFile);

        try {
            PrintWriter out = new PrintWriter(new FileWriter(file,add));
            out.println(movie.toString());
            out.close();
            System.out.println("Content edited");
        }
        catch (Exception e){
            System.out.println("Something happened: " + e.getMessage());
            throw new EscrituraDatosEx("Error adding movie" + e.getMessage());
        }
    }

    @Override
    public String search(String nameOfFile, String query) throws LecturaDatosEx {
        File file = new File(nameOfFile);
        String result = null;

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            var movie = buffer.readLine();
            var index = 1;
            while (movie != null){
                if(movie.equalsIgnoreCase(query)){
                    result = movie +" in index: " + index;
                    break;
                }
                movie = buffer.readLine();
                index++;
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Error reading movies" + e.getMessage());
        }
        return result;
    }

    @Override
    public void create(String nameOfFile) throws AccesoDatosEx {
        File file = new File(nameOfFile);

        try {
            PrintWriter out = new PrintWriter(file);
            out.close();
            System.out.println("file created");
        }
        catch (Exception e){
            System.out.println("Something happened: " + e.getMessage());
        }
    }

    @Override
    public void erase(String nameOfFile) throws AccesoDatosEx {
        if(this.exists(nameOfFile)){
            File file = new File(nameOfFile);
            file.delete();
            System.out.println("File erased");
        }
        System.out.println("File not found");
    }
}
