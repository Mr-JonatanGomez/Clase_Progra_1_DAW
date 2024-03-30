package controller;

import lombok.Getter;
import lombok.Setter;
import model.Libro;
import model.LibroComedia;
import model.LibroPoliciaco;
import model.LibroTerror;

import java.util.ArrayList;
import java.util.Scanner;

@Setter
@Getter
public final class BibliotecaSINPARAM {
    private String nombre, director;
    private ArrayList<Libro> librosBiblio;
    private Catalogo catalogo;

    public BibliotecaSINPARAM() {
        this.librosBiblio = new ArrayList<>();
    }

    public BibliotecaSINPARAM(String nombre, String director) {
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

    public void agregarLibroBiblio(Libro l) {
      //  librosBiblio.add(l);
    }

    public void crearCatalogo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que capacidad tiene este catalogo");
        int capacidad = sc.nextInt();
        this.catalogo = new Catalogo(capacidad);
    }

    public void agregarLibroEnCatalogo(Libro libro) {//En catalogo es de biblio // al catalogo de catalogo
      //  this.catalogo.agregarLibroAlCatalogo(libro);
    }

    public void crearBiblioteca(String nombre, String director) {//quizas inservible
        Scanner sc = new Scanner(System.in);
        System.out.println("HAS CREADO UNA BIBLIOTECA");
        System.out.println("introduce sus datos");
        System.out.println("Nombre de Biblioteca");
        setNombre(sc.next());
        System.out.println("Nombre del Director");
        setDirector(sc.next());
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
        private ArrayList<Libro> librosEnCatalogo;
        private int capacidad;
        private boolean capacidadMaxAlcanzada;


        public Catalogo() {
            this.librosEnCatalogo = new ArrayList<>();
        }

        public Catalogo(int capacidad) {

            this.capacidad = capacidad;
            this.capacidadMaxAlcanzada = false;
            this.librosEnCatalogo = new ArrayList<>();
        }


        public void agregarLibroAlCatalogo() {

            Scanner sc = new Scanner(System.in);
            //librosEnCatalogo.add(libro);// funciona
            System.out.println("Comprobando capacidad del catalogo actual:..." +
                    "\n ahora mismo hay "+librosEnCatalogo.size() +" libros en catalogo");


            System.out.println("\t¿¿QUE TIPO DE LIBRO VAS A AGREGAR??" +
                    "\n\t1- TERROR.\t2- POLICIACO.\t3- COMEDIA.");

            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    LibroTerror lt = new LibroTerror();
                    if(librosEnCatalogo.size()>=capacidad){
                        isCapacidadMaxAlcanzada();
                        System.out.println("CAPACIDAD MAXIMA ALCANZADA");

                    } else if (!isCapacidadMaxAlcanzada()){//CONDICION SI CABEN MAS LIBROS
                        System.out.println("Introduce ISBN del libro que quieres agregar al catalogo");
                        String isbnP = sc.next();
                        boolean repetido = false;

                        for (Libro item:librosEnCatalogo) {
                            if(item.getIsbn().equalsIgnoreCase(isbnP)){
                                System.out.println("El libro ya existe en catalogo");//lanzar exception
                                repetido = true;
                                break;
                            }
                        }
                        if (!repetido){
                            librosEnCatalogo.add(lt);
                            System.out.println("Se agregó el libro: "+lt.getTitulo()+" al catalogo");
                        }

                    }else{
                        //cazar exception
                        System.out.println("No caben más libros");
                    }
                    break;
                case 2:
                    LibroPoliciaco lp = new LibroPoliciaco();
                    if(librosEnCatalogo.size()>=capacidad){
                        isCapacidadMaxAlcanzada();
                        System.out.println("CAPACIDAD MAXIMA ALCANZADA");

                    } else if (!isCapacidadMaxAlcanzada()){//CONDICION SI CABEN MAS LIBROS
                        System.out.println("Introduce ISBN del libro que quieres agregar al catalogo");
                        String isbnP = sc.next();
                        boolean repetido = false;

                        for (Libro item:librosEnCatalogo) {
                            if(item.getIsbn().equalsIgnoreCase(isbnP)){
                                System.out.println("El libro ya existe en catalogo");//lanzar exception
                                repetido = true;
                                break;
                            }
                        }
                        if (!repetido){
                            librosEnCatalogo.add(lp);
                            System.out.println("Se agregó el libro: "+lp.getTitulo()+" al catalogo");
                        }

                    }else{
                        //cazar exception
                        System.out.println("No caben más libros");
                    }
                    break;
                case 3:
                    LibroComedia lc = new LibroComedia();
                    if(librosEnCatalogo.size()>=capacidad){
                        isCapacidadMaxAlcanzada();
                        System.out.println("CAPACIDAD MAXIMA ALCANZADA");

                    } else if (!isCapacidadMaxAlcanzada()){//CONDICION SI CABEN MAS LIBROS
                        System.out.println("Introduce ISBN del libro que quieres agregar al catalogo");
                        String isbnP = sc.next();
                        boolean repetido = false;

                        for (Libro item:librosEnCatalogo) {
                            if(item.getIsbn().equalsIgnoreCase(isbnP)){
                                System.out.println("El libro ya existe en catalogo");//lanzar exception
                                repetido = true;
                                break;
                            }
                        }
                        if (!repetido){
                            librosEnCatalogo.add(lc);
                            System.out.println("Se agregó el libro: "+lc.getTitulo()+" al catalogo");
                        }

                    }else{
                        //cazar exception
                        System.out.println("No caben más libros");
                    }
                    break;
                default:
                    break;
            }


        }

        public void mostrarDatosCatalogo() {
            System.out.println("DATOS DEL CATALOGO");
            System.out.println("Este catalogo tiene una capacidad de " + capacidad + " libros");

            for (Libro item:librosEnCatalogo) {
                System.out.println("MOSTRANDO DATOS DE LIBRO");
                item.mostrarDatos();
                System.out.println("Capacidad actual es"+librosEnCatalogo.size());
            }
           // System.out.println(librosEnCatalogo);

        }
    }
}
