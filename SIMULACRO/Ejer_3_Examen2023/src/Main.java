import controller.OperacionFichero;
import model.Pelicula;

import java.util.ArrayList;
// EMPEZADO 23.40 00:15
public class Main {
    public static void main(String[] args) {
        ArrayList<Pelicula>listaPeliculas=new ArrayList<>();
        Pelicula pelicula1 = new Pelicula("Sin novedad en el frente", "Edward Berger", 7.2,5.6,8.3);
        Pelicula pelicula2 = new Pelicula("Los Fabelman", "Steven Spielberg", 7.3,6.5,7.8);

        listaPeliculas.add(pelicula1);
        listaPeliculas.add(pelicula2);

        for (Pelicula item:listaPeliculas) {
            item.calcularNotaMedia();
            item.mostrarSoloDatosPedidos();
        }

        OperacionFichero operacionFichero=new OperacionFichero();
        operacionFichero.leerPeliculas();

    }
}
