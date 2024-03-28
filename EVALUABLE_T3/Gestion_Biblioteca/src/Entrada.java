import controller.Biblioteca;
import model.*;

public class Entrada {
    public static void main(String[] args) {
        LibroTerror l1 = new LibroTerror("It", "Stephen King", 300, 1111, 18);
        LibroTerror l2 = new LibroTerror("El resplandor", "Stephen King", 400, 2222, 16);
        LibroPoliciaco l3 = new LibroPoliciaco("El código Da Vinci", "Dan Brown", 250, 3333, Trama.misterio);
        LibroPoliciaco l4 = new LibroPoliciaco("El nombre de la rosa", "Umberto Eco", 350, 4444, Trama.intriga);
        LibroPoliciaco l5 = new LibroPoliciaco("El guardián invisible", "Dolores Redondo", 280, 5555, Trama.misterio);
        LibroPoliciaco l6 = new LibroPoliciaco("La chica del tren", "Paula Hawkins", 320, 6666, Trama.intriga);
        LibroComedia l7 = new LibroComedia("Diario de Greg", "Jeff Kinney", 200, 7777, TipoHumor.amarillo);
        LibroComedia l8 = new LibroComedia("El gran libro de la tontería", "Terry Jones", 280, 8888, TipoHumor.negro);
        LibroComedia l9 = new LibroComedia("Las ventajas de ser un marginado", "Stephen Chbosky", 320, 9999, TipoHumor.amarillo);
        LibroComedia l10 = new LibroComedia("El club de la lucha", "Chuck Palahniuk", 240, 1010, TipoHumor.rosa);
        LibroComedia l11 = new LibroComedia("La princesa prometida", "William Goldman", 280, 1212, TipoHumor.negro);
        LibroComedia l12 = new LibroComedia("Tres hombres en un bote", "Jerome K. Jerome", 320, 1313, TipoHumor.rosa);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional","Jonatan");
        biblioteca.agregarLibroBiblio(l1);
        biblioteca.mostrarDatosLibros();
        //biblioteca.construirCatalogo();

        //biblioteca.agregarLibroBiblio();

    }
}
