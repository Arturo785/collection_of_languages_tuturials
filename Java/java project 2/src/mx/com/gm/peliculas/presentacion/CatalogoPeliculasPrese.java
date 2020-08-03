package mx.com.gm.peliculas.presentacion;

import mx.com.gm.peliculas.servicio.ICatalogoPeliculas;
import mx.com.gm.peliculas.servicio.ICatalogoPeliculasImpl;

import java.util.Scanner;

public class CatalogoPeliculasPrese {

    public static final String FILE_PATH = "D:\\Arturo\\Documents\\Java course\\java project 2\\src\\mx\\com\\gm\\peliculas\\txt\\";

    public static void main(String[] args) {
        ICatalogoPeliculas movieHandler = new ICatalogoPeliculasImpl();
        Scanner scanner = new Scanner(System.in);
        final String file = "Pelis1.txt";
        int opc = -1;

        while (opc != 0){
            try {
                System.out.println("Bienvenido al sistem de peliculas!" +
                        "\n1: Iniciar catalogo" +
                        "\n2: Agregar pelicula" +
                        "\n3: Buscar pelicula" +
                        "\n4: Listar peliculas" +
                        "\n0: Salir");
                opc = Integer.parseInt(scanner.nextLine());

                switch (opc){
                    case 1:
                        movieHandler.resetMovies(FILE_PATH+file);
                        break;

                    case 2:
                        System.out.println("Diga el nombre");
                        var name = scanner.nextLine();
                        movieHandler.addMovie(name,FILE_PATH+file);
                        break;

                    case 3:
                        System.out.println("Diga el nombre a buscar");
                        var query = scanner.nextLine();
                        movieHandler.searchMovie(FILE_PATH+file,query);
                        break;

                    case 4:
                        movieHandler.listMovies(FILE_PATH+file);
                        break;

                    case 0:
                        System.out.println("Gracias");
                        break;

                    default:
                        System.out.println("Wrong choice");
                        break;
                }

            }
            catch (Exception e){
                System.out.println("Wrong entry");
            }
        }


    }

}
