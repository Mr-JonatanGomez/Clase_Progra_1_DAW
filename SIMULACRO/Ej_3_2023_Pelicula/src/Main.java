import controller.Registro;
import model.Pelicula;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Registro registro = new Registro();
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

        Pelicula pelicula1 = new Pelicula("Sin novedad en el frente", "Edward Berger", 7.2,5.6,8.3);
        Pelicula pelicula2 = new Pelicula("Los Fabelman", "Steven Spielberg", 7.3,6.5,7.8);

        listaPeliculas.add(pelicula1);
        listaPeliculas.add(pelicula2);

        registro.guardarPeliculaFichero(listaPeliculas);
        registro.leerPeliculaFichero(listaPeliculas);



    }
}
