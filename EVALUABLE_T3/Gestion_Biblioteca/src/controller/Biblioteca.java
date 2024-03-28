package controller;

import lombok.Getter;
import lombok.Setter;
import model.*;

import java.util.ArrayList;
import java.util.Scanner;

@Setter
@Getter
public class Biblioteca {
    private String nombre;
    private String director;
    private Catalogo catalogo;
    private ArrayList<Libro> listaLibrosBiblio;


    public Biblioteca() {
        this.listaLibrosBiblio = new ArrayList<>();
    }

    public Biblioteca(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
        this.listaLibrosBiblio = new ArrayList<>();


    }

    public void agregarLibroBiblio(Libro libro) {
        listaLibrosBiblio.add(libro);
    }

    public void mostrarDatosLibros(){
        for (Libro libro:listaLibrosBiblio) {
            libro.mostrarDatos();
        }
    }

    public void construirCatalogo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que capacidad de libros tendrá el catalogo?");
        //catalogo.setCapacidadMaxima(sc.nextInt());
        this.catalogo = new Catalogo(sc.nextInt());
        System.out.println("Catalogo creado con una capacidad para " + getCatalogo().capacidadMaxima + " libros");
    }

    public void agregarLibroCatalogo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ISBN del libro que quieres agregar");
        int isbnAgregar = sc.nextInt();

    }

    /*public void agregarLibroBiblio(Libro libro){//separar en insertar datos, y luego agregar con los instanceOf
        Scanner sc = new Scanner(System.in);
        System.out.println("Agregando libro a coleccion, inserte los datos:\n Titulo: ");
        libro.setTitulo(sc.next());
        System.out.println("Autor: ");
        libro.setAutor(sc.next());
        System.out.println("Paginas: ");
        libro.setPaginas(sc.nextInt());
        System.out.println("ISBN: ");
        libro.setIsbn(sc.nextInt());
        System.out.println("Tipo de libro:\t1-Terror\t2-comedia\t3-policiaca");
        int opcionTipo= sc.nextInt();
        switch (opcionTipo){
            case 1:
                System.out.println("introduce calificacion edad");
                ((LibroTerror)libro).setCalificacion(sc.nextInt());
                listaLibrosBiblio.add(libro);
                break;
            case 2:
                System.out.println("introduce tipo de humor:\t1- Rosa\t2- Negro\t3- Amarillo");
                int tipoHumor=sc.nextInt();
                switch (tipoHumor){
                    case 1:
                        ((LibroComedia)libro).setTipoHumor(TipoHumor.rosa);
                        listaLibrosBiblio.add(libro);
                    case 2:
                        ((LibroComedia)libro).setTipoHumor(TipoHumor.negro);
                        listaLibrosBiblio.add(libro);
                    case 3:
                        ((LibroComedia)libro).setTipoHumor(TipoHumor.amarillo);
                        listaLibrosBiblio.add(libro);
                    default:
                        System.out.println("tipo no valido");
                        break;
                        //añadir DO WHILE para hacer si no encaja 123
                }break;
            case 3:
                System.out.println("introduce tipo de trama:\t1- misterio\t2- intriga");
                int tipoTrama=sc.nextInt();
                switch (tipoTrama){
                    case 1:
                        ((LibroPoliciaco)libro).setTrama(Trama.misterio);
                        listaLibrosBiblio.add(libro);
                    case 2:
                        ((LibroPoliciaco)libro).setTrama(Trama.intriga);
                        listaLibrosBiblio.add(libro);

                    default:
                        System.out.println("tipo no valido");
                        break;
                    //añadir DO WHILE para hacer si no encaja 12
                }break;
        }
    }

     *///AGREGARLIBRO EXTENSO A LA BIBLIO
    public void consultarCatalogo() {
        System.out.println("El catalogo tiene actualmente ");
    }

    @Getter
    @Setter
            //CLASE ANIDADA CATALOGO
    class Catalogo {
        private int capacidadMaxima;
        private ArrayList<Libro> listaLibrosCatalogo;

        public Catalogo() {
        }

        public Catalogo(int capacidadMaxima) {
            this.capacidadMaxima = capacidadMaxima;
        }
    }
}
