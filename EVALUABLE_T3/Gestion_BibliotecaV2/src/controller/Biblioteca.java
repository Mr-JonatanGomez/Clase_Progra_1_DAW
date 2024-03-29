package controller;

import lombok.Getter;
import lombok.Setter;
import model.*;

import java.util.ArrayList;
import java.util.Scanner;

@Setter
@Getter
public final class Biblioteca {
    private String nombre, director;
    private ArrayList<Libro> librosBiblio;
    private Catalogo catalogo;

    public Biblioteca() {
        this.librosBiblio = new ArrayList<>();
    }

    public Biblioteca(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
        this.librosBiblio = new ArrayList<>();
//TOCHACO DE LIBROS
        librosBiblio.add(new LibroTerror("It", "Stephen King", "0001t", 317, 16));
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

    }


    public void mostrarDatosBiblio() {
        System.out.println("DATOS BIBLIOTECA");
        System.out.println("nombre = " + nombre);
        System.out.println("director = " + director);
        catalogo.mostrarDatosCatalogo();
    }

    public void agregarLibroBiblio(Libro l) {
        librosBiblio.add(l);
    }

    public void crearCatalogo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que capacidad tiene este catalogo");
        int capacidad = sc.nextInt();
        this.catalogo = new Catalogo(capacidad);
    }

    public void agregarLibroEnCatalogo() {
        catalogo.agregarLibroAlCatalogo();
    }

    public void crearBiblioteca(String nombre, String director) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de Biblioteca");
        nombre = sc.next();
        System.out.println("Nombre del Director");
        director = sc.next();
    }

    public void busquedaISBN() {
        System.out.println("Introduce ISBN para buscar");
        Scanner sc = new Scanner(System.in);
        String busqueda = sc.next();
        for (Libro item : librosBiblio) {
            if (item.getIsbn().contains(busqueda)) {
                item.mostrarDatos();
            }
        }
    }
///////////////////////////////////SECTOR CATALOGO/////////////////////////////////////////

    // CATALOGO ANIDADO
    @Setter
    @Getter
    class Catalogo {
        private ArrayList<Libro> librosEnCatalogo;
        private int capacidad;
        private boolean capacidadMaxAlcanzada;


        public Catalogo() {
        }

        public Catalogo(int capacidad) {
            this.capacidad = capacidad;
            this.capacidadMaxAlcanzada = false;
            this.librosEnCatalogo = new ArrayList<>();
        }


        public void agregarLibroAlCatalogo() {

            /*Scanner sc = new Scanner(System.in);
            System.out.println("Introduce ISBN que quieres agregar al catalogo");
            String isbnP = sc.next();
            for (Libro item : librosBiblio) {
                if (item.getIsbn().equalsIgnoreCase(isbnP)) {
                    System.out.println("El libro está en bliblio y puede añadirse...");
                    if (catalogo.isCapacidadMaxAlcanzada()) {
                        System.out.println("NO SE PUEDE AGREGAR ESTA LLENO EL CATALOGO");//LANZAR EXCEPTION
                    } else {
                        for (Libro item2 : librosEnCatalogo) {
                            if (item2.getIsbn().equalsIgnoreCase(isbnP)) {
                                System.out.println("NO SE PUEDE AGREGAR, ESTÁ REPETIDO");
                            } else {
                                librosEnCatalogo.add(item2);
                            }
                        }
                    }
                }

            }
            for (Libro libro : librosEnCatalogo) {
                libro.mostrarDatos();
            }*/
        }

        public void mostrarDatosCatalogo() {
            System.out.println("DATOS DEL CATALOGO");
            System.out.println("Este catalogo tiene una capacidad de " + capacidad + " libros");
           // System.out.println(librosEnCatalogo);

        }
    }
}
