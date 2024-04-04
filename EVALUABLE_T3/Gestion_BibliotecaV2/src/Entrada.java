import controller.Biblioteca;
import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //LIBROS DISPONIBLES
        LibroTerror l1 = new LibroTerror("It", "Stephen King", "0001t", 317, 16);
        LibroTerror l2 = new LibroTerror("Misery", "Stephen King", "0002t", 405, 16);
        LibroTerror l3 = new LibroTerror("Joyland", "Stephen King", "0003t", 370, 14);
        LibroTerror l4 = new LibroTerror("El Exorcista", "William Peter Blatty", "0004t", 326, 18);
        LibroTerror l5 = new LibroTerror("The Silence of the Lambs", "Thomas Harris", "0005t", 368, 18);

        LibroPoliciaco l6 = new LibroPoliciaco("Los hombres que no amaban a las mujeres", "Stieg Larsson", "0006p", 465, Trama.misterio);
        LibroPoliciaco l7 = new LibroPoliciaco("La chica que soñaba con una cerilla y un bidón de gasolina", "Stieg Larsson", "0007p", 569, Trama.misterio);
        LibroPoliciaco l8 = new LibroPoliciaco("La reina en el palacio de las corrientes de aire", "Stieg Larsson", "0008p", 602, Trama.misterio);
        LibroPoliciaco l9 = new LibroPoliciaco("Perdida", "Gillian Flynn", "0009p", 432, Trama.intriga);
        LibroPoliciaco l10 = new LibroPoliciaco("El código Da Vinci", "Dan Brown", "0010p", 689, Trama.intriga);
        LibroPoliciaco l11 = new LibroPoliciaco("La chica del tren", "Paula Hawkins", "0011p", 336, Trama.intriga);

        LibroComedia l12 = new LibroComedia("El club de la lucha", "Chuck Palahniuk", "0012c", 289, TipoHumor.amarillo);
        LibroComedia l13 = new LibroComedia("La princesa prometida", "William Goldman", "0013c", 364, TipoHumor.amarillo);
        LibroComedia l14 = new LibroComedia("Las ventajas de ser un marginado", "Stephen Chbosky", "0014c", 418, TipoHumor.amarillo);
        LibroComedia l15 = new LibroComedia("Un trabajo muy sucio", "Christopher Moore", "0015c", 327, TipoHumor.rosa);
        LibroComedia l16 = new LibroComedia("Noche de almas", "Joe R. Lansdale", "0016c", 252, TipoHumor.rosa);
        LibroComedia l17 = new LibroComedia("Tres hombres en un bote", "Jerome K. Jerome", "0017c", 319, TipoHumor.rosa);
        LibroComedia l18 = new LibroComedia("El gran libro de la tontería", "Terry Jones", "0018c", 281, TipoHumor.negro);
        LibroComedia l19 = new LibroComedia("Las crónicas marcianas", "Ray Bradbury", "0019c", 368, TipoHumor.negro);
        LibroComedia l20 = new LibroComedia("Diario de Greg", "Jeff Kinney", "0020c", 217, TipoHumor.negro);


        //b.busquedaISBN();

        //Biblioteca.Catalogo catalogo = b.new Catalogo();

        //b.mostrarGlobal(); sin implementar este metodo
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Municipal", "Cooperativa");
/*
        Biblioteca b = new Biblioteca("Biblioteca Municipal", "Cooperativa");

        b.crearCatalogo();

        b.agregarLibroEnCatalogo();
        b.agregarLibroEnCatalogo();
        b.agregarLibroEnCatalogo();
        b.eliminarLibroEnCatalogo();

        b.mostrarDatosBiblio();

*/
        int opcionMenuPrin;
        System.out.println("BIENVENIDO, ¿QUE TIPO DE BIBLIOTECA QUIERES CREAR?" +
                "\n1- GENERAL (admite todo tipo de tematicas)" +
                "\n2- TERROR (solo admite libros de terror)" +
                "\n3- POLICIACA (solo admite novelas policiacas)" +
                "\n4- COMEDIA (solo admite libros de comedia)\n");

        int opcionMenuInterior;
        do {
            System.out.println("\t\t\t\t\t\t\t\uD83C\uDFDB\uFE0F¿QUE QUIERES HACER?\uD83C\uDFDB\uFE0F" +
                    "\n1- EDITAR BIBLIOTECA 📚\t\t3- AGREGAR LIBRO AL CATALOGO ➕📗\t\t5- MOSTRAR DATOS BIBLIOTECA 📖" +
                    "\n2- CREAR CATALOGO \uD83D\uDDC3\uFE0F\t\t4- ELIMINAR LIBRO DEL CATALOGO ➖📕\t\t6- MOSTRAR LIBROS DEL MUNDO" +
                    "\n9- SALIR 👋🏻");
            opcionMenuInterior = sc.nextInt();
            switch (opcionMenuInterior) {
                case 1:
                    //Scanner sc = new Scanner(System.in);
                    System.out.println("Introduzca nombre de la Biblioteca");
                    biblioteca1.setNombre(sc.next());
                    System.out.println("Introduzca director de la Biblioteca");
                    biblioteca1.setDirector(sc.next());
                    break;
                case 2:
                    biblioteca1.crearCatalogo();
                    break;
                case 3:
                    biblioteca1.agregarLibroEnCatalogo();
                    break;
                case 4:
                    biblioteca1.eliminarLibroEnCatalogo();
                    break;
                case 5:
                    biblioteca1.mostrarDatosBiblio();
                    break;
                case 6:
                    ArrayList<Libro> listaGlobalLibros = DepositoLibros.crearLibros();
                    for (Libro libro : listaGlobalLibros) {
                        libro.mostrarDatos();
                    }
                    break;
                case 9:
                    System.out.println("CERRANDO PROGRAMA");
                    break;
                default:
                    System.out.println("OPCION NO CONTEMPLADA");
                    break;
            }
        } while (opcionMenuInterior != 9);


    }

}
