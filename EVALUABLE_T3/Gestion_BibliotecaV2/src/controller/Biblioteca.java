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
        //this.librosBiblio = new ArrayList<>();
    }


    public void mostrarDatosBiblio() throws CatalogoNoExisteException {
        System.out.println("\n\uD83C\uDFDB\uFE0F DATOS BIBLIOTECA \uD83C\uDFDB\uFE0F");
        System.out.println("nombre = " + nombre);
        System.out.println("director = " + director);
        if (catalogo == null) {
            throw new CatalogoNoExisteException("🚫 No ha sido posible mostrar los datos del catalogo, porque no ha sido creado aún🚫\n");
        }
        this.catalogo.mostrarDatosCatalogo();
    }

    public void mostrarGlobal() {
        //  librosBiblio.add(l);
        //getListaGlobalLibros(); ELIMINANDO EL EXTEND LIBROSMUNDO

    }

    public void crearCatalogo() /*throws TipoDatosNoContemplados*/ {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que capacidad tiene este catalogo");
        int capacidad = -1;

            if (!sc.hasNextInt()) { //introduccion de dato y verifica si sc es Int
                throw new TipoDatosNoContemplados("" +
                        "\n\t\t\t🚫 ¡ERROR! Capacidad del catalogo necesita número Entero 🚫\n");
            } else {
                capacidad = sc.nextInt();
                this.catalogo = new Catalogo(capacidad);
            }

    }

    public void agregarLibroEnCatalogo() throws CatalogoNoExisteException, CatalogoLlenoException {//En catalogo es de biblio // al catalogo de catalogo
        if (catalogo == null) {
            throw new CatalogoNoExisteException("\n🚫 !ERROR¡ No hay un catalogo creado 🚫. Debes crearlo antes de agregar libros\n");
        } else if (catalogo.isCapacidadMaxAlcanzada()) {
            throw new CatalogoLlenoException("\n📚📚EL CATALOGO ESTÁ LLENO, PARA AGREGAR UN LIBRO, HAY QUE SACAR OTRO PRIMERO\n");
        }

        this.catalogo.agregarLibroAlCatalogo();
    }


    public void eliminarLibroEnCatalogo()throws CatalogoNoExisteException, CatalogoLlenoException {
        if (catalogo == null) {
            throw new CatalogoNoExisteException("\n🚫 !ERROR¡ No hay un catalogo creado 🚫. Debes crearlo antes de eliminar libros\n");
        } else if (catalogo.catalogoVacio) {
            throw new CatalogoLlenoException("\n🚫 !ERROR¡ No hay Libros en Catalogo 🚫. Por tanto, no puedes eliminarlos\n");
        }
        this.catalogo.eliminarLibroAlCatalogo();
    }

    public void buscarISBNEnCatalogo()throws CatalogoNoExisteException, NoExisteLibroEnBusqueda{
        if (catalogo==null){
            throw new CatalogoNoExisteException("🚫 No puedes buscar un libro, NO EXISTE EL CATALOGO 🚫");
        }
        catalogo.busquedaISBNCatalogo();
    }

    public void busquedaISBNGlobal() throws NoExisteLibroEnBusqueda{
        ArrayList<Libro> listaGlobalLibros = DepositoLibros.crearLibros();
        System.out.println("Introduce ISBN que quieres buscar");
        Scanner sc = new Scanner(System.in);
        String busqueda = sc.next();
        boolean encontrado= false;
        for (Libro item : listaGlobalLibros) {
            if (item.getIsbn().equalsIgnoreCase(busqueda)) {
                encontrado=true;
                item.mostrarDatos();
                break;
            }
        }
        if (!encontrado){
            throw new NoExisteLibroEnBusqueda("🚫 El ISBN buscado no existe, o contiene errores🚫");
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
        private boolean catalogoVacio;
        //private ArrayList<Libro> listaGlobalLibros = DepositoLibros.crearLibros(); //sobra esta linea o sobra en agregarLibroAlCatalogo

        public Catalogo() {
            this.listaLibrosEnCatalogo = new ArrayList<>();
        }

        public Catalogo(int capacidad) {

            this.capacidad = capacidad;
            this.capacidadMaxAlcanzada = false;
            this.catalogoVacio = true;
            this.listaLibrosEnCatalogo = new ArrayList<>();
        }

        public void catalogoLleno() {


            if (listaLibrosEnCatalogo.size() >= capacidad) {
                System.out.println(" EL CATALOGO ESTÁ LLENO, PARA AGREGAR UN LIBRO, HAY QUE SACAR OTRO PRIMERO");
                capacidadMaxAlcanzada = true;
            } else if (listaLibrosEnCatalogo.size() < capacidad) {
                System.out.println("EL CATALOGO DISPONE AÚN DE " + (capacidad - listaLibrosEnCatalogo.size()) + " HUECOS DISPONIBLES");
                capacidadMaxAlcanzada = false;
            }


        }
        public void catalogoVacio() {

            if (listaLibrosEnCatalogo.size() == 0) {
                System.out.println(" EL CATALOGO ESTÁ VACIO, PARA ELIMINAR LIBRO, TIENE QUE HABER LIBROS");
                capacidadMaxAlcanzada = false;
            }


        }

        public void busquedaISBNCatalogo() throws NoExisteLibroEnBusqueda, CatalogoNoExisteException{

            System.out.println("Introduce ISBN que quieres buscar");
            Scanner sc = new Scanner(System.in);
            String busqueda = sc.next();
            boolean encontrado= false;
            for (Libro item : listaLibrosEnCatalogo) {
                if (item.getIsbn().equalsIgnoreCase(busqueda)) {
                    encontrado=true;
                    item.mostrarDatos();
                    break;
                }
            }
            if (!encontrado){
                throw new NoExisteLibroEnBusqueda("🚫 El ISBN buscado no existe en Catalogo, o ISBN contiene errores🚫");
            }

        }


        public void agregarLibroAlCatalogo() {

            Scanner sc = new Scanner(System.in);

            ArrayList<Libro> listaGlobalLibros = DepositoLibros.crearLibros();//sobra esta linea o sobra en los atributos
            System.out.println("Comprobando capacidad del catálogo actual:..." +
                    "\n Actualmente hay " + listaLibrosEnCatalogo.size() + " libros en el catálogo");

            catalogoLleno();

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
                    // Verificar si el libro (QUE SÍ EXISTE EN DEPOSITO) ya está en listaLibrosEnCatalogo
                    boolean repetido = false;
                    for (Libro item : listaLibrosEnCatalogo) {
                        if (item.getIsbn().equalsIgnoreCase(isbnP)) {
                            repetido = true;
                            break;
                        }
                    }

                    if (!repetido) {
                        // Agregar el libro al catálogo EXISTE EN DEPOSITO, NO ESTA REPETIDO
                        for (Libro item : listaGlobalLibros) {
                            if (item.getIsbn().equalsIgnoreCase(isbnP)) {
                                listaLibrosEnCatalogo.add(item);
                                System.out.println("✅El libro: " + item.getTitulo() + " con ISBN: " + item.getIsbn() + ", ha sido agregado al catálogo✅");
                                catalogoVacio=false;
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

            if(capacidad >=1) {
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
                if (listaLibrosEnCatalogo.size() < 1) {
                    catalogoVacio = true;
                }
            }

        }

        public void mostrarDatosCatalogo() {
            System.out.println("📚 DATOS DEL CATALOGO 📚");
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