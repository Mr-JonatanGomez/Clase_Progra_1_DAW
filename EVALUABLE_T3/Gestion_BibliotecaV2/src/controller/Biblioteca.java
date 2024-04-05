package controller;

import lombok.Getter;
import lombok.Setter;
import model.*;

import java.util.ArrayList;
import java.util.Scanner;

@Setter
@Getter
public class Biblioteca<T extends Libro> {
    private String nombre, director;
    private ArrayList<T> librosBiblio;
    private Catalogo catalogo;

    public Biblioteca() {
        this.librosBiblio = new ArrayList<>();
    }

    public Biblioteca(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
        this.librosBiblio = new ArrayList<>();
//TOCHACO DE LIBROS
        /*
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
        */
    }


    public void mostrarDatosBiblio() {
        System.out.println("DATOS BIBLIOTECA");
        System.out.println("nombre = " + nombre);
        System.out.println("director = " + director);
        this.catalogo.mostrarDatosCatalogo();
    }

    public void mostrarGlobal() {
        //  librosBiblio.add(l);
        //getListaGlobalLibros(); ELIMINANDO EL EXTEND LIBROSMUNDO

    }

    public void crearCatalogo() /*throws TipoDatosNoContemplados*/{
        Scanner sc = new Scanner(System.in);
        System.out.println("Que capacidad tiene este catalogo");
        int capacidad = sc.nextInt();
/*
        if (){

        }*/

        this.catalogo = new Catalogo(capacidad);
    }

    public void agregarLibroEnCatalogo() throws CatalogoNoExisteException {//En catalogo es de biblio // al catalogo de catalogo
        if (catalogo == null){
            throw new CatalogoNoExisteException("🚫 !ERROR¡ No hay un catalogo creado 🚫. Debes crearlo antes de agregar libros");
        }

        this.catalogo.agregarLibroAlCatalogo();
    }

    ///INDAGAR AQUI LAS PRUEBAS
    public void eliminarLibroEnCatalogo() {
        this.catalogo.eliminarLibroAlCatalogo();
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
//////////////////////////////////////////////////////////////////////////////////////////
    // CATALOGO ANIDADO
    @Setter
    @Getter
    class Catalogo {
        private ArrayList<Libro> listaLibrosEnCatalogo;
        private int capacidad;
        private boolean capacidadMaxAlcanzada;
        //private ArrayList<Libro> listaGlobalLibros = DepositoLibros.crearLibros(); //sobra esta linea o sobra en agregarLibroAlCatalogo

        public Catalogo() {
            this.listaLibrosEnCatalogo = new ArrayList<>();
        }

        public Catalogo(int capacidad) {

            this.capacidad = capacidad;
            this.capacidadMaxAlcanzada = false;
            this.listaLibrosEnCatalogo = new ArrayList<>();
        }

        //METODO CATALOGO LLENO
        public void catalogoLleno() {
            if (listaLibrosEnCatalogo.size() >= capacidad) {
                System.out.println(" EL CATALOGO ESTÁ LLENO, PARA AGREGAR UN LIBRO, HAY QUE SACAR OTRO PRIMERO");
                capacidadMaxAlcanzada = true;
            } else if (listaLibrosEnCatalogo.size() < capacidad) {
                System.out.println("EL CATALOGO DISPONE AÚN DE " + (capacidad - listaLibrosEnCatalogo.size()) + " HUECOS DISPONIBLES");
                capacidadMaxAlcanzada = false;
            }
        }//METODO CATALOGO LLENO


        //NUEVO FORMATO AGREGAR... DE LIBROS MUNDO con instancia
        public void agregarLibroAlCatalogo() {

            Scanner sc = new Scanner(System.in);

            ArrayList<Libro> listaGlobalLibros = DepositoLibros.crearLibros();//sobra esta linea o sobra en los atributos
            System.out.println("Comprobando capacidad del catálogo actual:..." +
                    "\n Actualmente hay " + listaLibrosEnCatalogo.size() + " libros en el catálogo");

                catalogoLleno(); // Actualizar el estado de capacidadMaxAlcanzada con true o false

            if (!isCapacidadMaxAlcanzada()) {
                System.out.println("Introduce el ISBN del libro que quieres agregar al catálogo");
                String isbnP = sc.next();
                boolean existeEnDeposito = false;

                // Verificar si el ISBN existe en la listaGlobalLibros
                for (Libro item : listaGlobalLibros) {
                    if (item.getIsbn().equalsIgnoreCase(isbnP)) {
                        existeEnDeposito = true;
                        break;
                    }
                }

                if (existeEnDeposito) {
                    // Verificar si el libro (QUE SI EXISTE EN DEPOSITO) ya está en listaLibrosEnCatalogo
                    boolean repetido = false;
                    for (Libro item : listaLibrosEnCatalogo) {
                        if (item.getIsbn().equalsIgnoreCase(isbnP)) {
                            repetido = true;
                            break;
                        }
                    }

                    if (!repetido) {
                        // Agregar el libro al catálogo
                        for (Libro item : listaGlobalLibros) {
                            if (item.getIsbn().equalsIgnoreCase(isbnP)) {
                                listaLibrosEnCatalogo.add(item);
                                System.out.println("✅El libro: " + item.getTitulo() + " con ISBN: " + item.getIsbn() + ", ha sido agregado al catálogo✅");
                                break;
                            }
                        }
                    } else {
                        System.out.println("🚫El libro ya está en el catálogo🚫");
                    }
                } else {
                    System.out.println("⛔El ISBN introducido no existe en la lista de libros disponibles⛔");
                }
            } else {
                System.out.println("Catalogo lleno, No caben más libros en el catálogo");
            }
        }

        public void eliminarLibroAlCatalogo() {
            //mostrar los isbn del catalogo actual y preguntar cual borrar
            Scanner sc = new Scanner(System.in);
            String isbnEliminar;

            System.out.println("⚠\uFE0F ¡VAS A ELIMINAR UN LIBRO DEL CATALOGO!⚠\uFE0F");
            System.out.println("Mostrando los ISBN que hay en el catalogo");
            for (Libro libro : listaLibrosEnCatalogo) {
                System.out.print("\t" + libro.getIsbn() + ";");
            }
            System.out.println("\n¿¿Que ISBN quieres sacar??");
            isbnEliminar = sc.next();
            boolean isbnEncontrado = false;
            for (Libro item : listaLibrosEnCatalogo) {
                if (item.getIsbn().equalsIgnoreCase(isbnEliminar)) {
                    isbnEncontrado = true;
                    listaLibrosEnCatalogo.remove(item);
                    System.out.println("EL LIBRO FUE ELIMINADO CORRECTAMENTE");
                    break;
                }
            }
            if (!isbnEncontrado) {
                System.out.println("El ISBN no existe en este catalogo");
            }

        }

        public void mostrarDatosCatalogo() {
            System.out.println("\nDATOS DEL CATALOGO");
            System.out.println("Este catalogo tiene una capacidad total de " + capacidad + " libros");
            System.out.println("El numero de libros en catalogo actualmente es: " + listaLibrosEnCatalogo.size());

            for (Libro item : listaLibrosEnCatalogo) {
                System.out.println("MOSTRANDO DATOS DE LIBRO");
                item.mostrarDatos();
            }
            // System.out.println(librosEnCatalogo);

        }
    }
}