import controller.Biblioteca;

public class Entrada {
    public static void main(String[] args) {
        /*ArrayList<Libro>listadoLibro;

        LibroTerror l1 = new LibroTerror("El Resplandor", "Stephen King", 512, 1234, 20);
        LibroTerror l2 = new LibroTerror("Frankenstein", "Mary Shelley", 280, 5678, 16);
        LibroTerror l3 = new LibroTerror("Drácula", "Bram Stoker", 448, 9101, 18);
        LibroComedia l4 = new LibroComedia("El Exorcista", "William Peter Blatty", 400, 2345, TipoHumor.rosa);
        LibroComedia l5 = new LibroComedia("It", "Stephen King", 1504, 6789, TipoHumor.negro);
        LibroPoliciaco l6 = new LibroPoliciaco("It", "Stephen King", 1504, 6789, Trama.intriga);
        LibroPoliciaco l7 = new LibroPoliciaco("It", "Stephen King", 1504, 6789, Trama.misterio);
*/
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional","Jonatan");
        biblioteca.construirCatalogo();

    }
}
