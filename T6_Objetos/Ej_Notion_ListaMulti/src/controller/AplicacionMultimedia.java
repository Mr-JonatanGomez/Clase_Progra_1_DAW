package controller;

import lombok.Getter;
import lombok.Setter;
import model.*;

import java.util.ArrayList;
import java.util.Scanner;

@Setter
@Getter
public class AplicacionMultimedia {

    private ArrayList<Libro> listadoLibros;
    private ArrayList<Video> listadoVideos;
    private ArrayList<Audio> listadoAudios;
    private ArrayList<Media> listadoColeccion;
    private Media productoMedia;

    public AplicacionMultimedia() {
        this.listadoLibros = new ArrayList<>();
        this.listadoVideos = new ArrayList<>();
        this.listadoAudios = new ArrayList<>();
        this.listadoColeccion = new ArrayList<>();

    }

    public AplicacionMultimedia(ArrayList<Libro> listadoLibros, ArrayList<Video> listadoVideos, ArrayList<Audio> listadoAudios, ArrayList<Media> listadoColeccion, Media productoMedia) {
        this.listadoLibros = new ArrayList<>();
        this.listadoVideos = new ArrayList<>();
        this.listadoAudios = new ArrayList<>();
        this.listadoColeccion = new ArrayList<>();
        this.productoMedia = productoMedia;
    }

    public void agregarAColeccion(){
        Scanner sc = new Scanner(System.in);
        int opcionMas;

        System.out.println("¿Que tipo de objeto quieres añadir?\n1-Libro\n2-Audio\n3-Video\n4-No agregar más");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:

                Libro l = new Libro();
                l.insertarDatos();
                listadoLibros.add(l);
                listadoColeccion.add(l);
                System.out.println("EL PRODUCTO HA SIDO AÑADIDO");
                break;
            case 2:
                Audio a = new Audio();
                a.insertarDatos();
                listadoAudios.add(a);
                listadoColeccion.add(a);
                System.out.println("EL PRODUCTO HA SIDO AÑADIDO");
                break;
            case 3:
                Video v = new Video();

                v.insertarDatos();
                Director d = new Director();
                listadoVideos.add(v);
                listadoColeccion.add(v);
                System.out.println("EL PRODUCTO HA SIDO AÑADIDO");
                break;
            case 4:
                menuOpciones();
                break;
            default:
                System.out.println("OPCION NO CONTEMPLADA");
                break;
        }


        System.out.println("\t\n ¿QUIERES AGREGAR ALGO MÁS?\n1- SI\n2- NO\nCUALQUIER TECLA DIFERENTE DE 1 Funcionará como NO");
        opcionMas = sc.nextInt();
        sc.nextLine();
        if (opcionMas == 1) {
            agregarAColeccion();
        } else {
            menuOpciones();
        }

    }

    public void eliminarDeColeccion() {
        System.out.println("PROPORCIONA EL ID QUE QUIERAS ELIMINAR");
        Scanner sc = new Scanner(System.in);
        int idEliminar = sc.nextInt();
        for (Media items : listadoColeccion) {
            if (items.getId() == idEliminar) {
                System.out.println("SI ESTÁS SEGURO QUE QUIERES ELIMINAR " + items.getTitulo()
                        + " con ID:" + items.getId() + "\n PULSA 1");
                int confirmacion = sc.nextInt();
                if (confirmacion == 1) {
                    listadoColeccion.remove(items);
                    System.out.println("Producto eliminad de Coleccion Correctamente");
                    if (items instanceof Libro) {
                        listadoLibros.remove(items);
                        System.out.println("Producto eliminado de Libro Correctamente");
                    } else if (items instanceof Audio) {
                        listadoAudios.remove(items);
                        System.out.println("Producto eliminado de Audio Correctamente");
                    } else if (items instanceof Video) {
                        listadoVideos.remove(items);
                        System.out.println("Producto eliminado de Video Correctamente");
                    }
                    break;
                }

            }
        }
        System.out.println("\t\n ¿QUIERES ELIMINAR ALGO MÁS?\n1- SI\n2- NO\nCUALQUIER TECLA DIFERENTE DE 1 Funcionará como NO");
        int opcionMas;
        opcionMas = sc.nextInt();
        if (opcionMas == 1) {
            eliminarDeColeccion();
        } else {
            menuOpciones();
        }
    }

    public void listarElementosDeLaColeccion() {
        //int contadorElementos = 0; listadoLibros.size() que ahorra codigo
        System.out.println("¿QUE ELEMENTOS QUIERES MOSTRAR?" +
                "\n1- LIBROS\n2- AUDIOS\n3- VIDEOS\n4- TODOS");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                for (Media item : listadoColeccion) {
                    if (item instanceof Libro) {
                        item.mostrarDaatosResumen();

                    }
                }

                System.out.println("\n\tEn total hay " +listadoLibros.size()+ " Libros");

                break;
            case 2:
                for (Media item : listadoColeccion) {
                    if (item instanceof Audio) {
                        item.mostrarDaatosResumen();
                    }
                }
                System.out.println("\n\tEn total hay " +listadoAudios.size()+ " audios");
                break;
            case 3:
                for (Media item : listadoColeccion) {
                    if (item instanceof Video) {
                        item.mostrarDaatosResumen();

                    }
                }
                System.out.println("\n\tEn total hay " +listadoVideos.size()+ " videos");
                break;
            case 4:
                for (Media item : listadoColeccion) {
                    item.mostrarDaatosResumen();

                }
                System.out.println("\n\tEn total hay " +listadoColeccion.size()+ " Elementos: desgranados en:");
                System.out.println("\n\tEn total hay " +listadoLibros.size()+ " Libros");
                System.out.println("\n\tEn total hay " +listadoAudios.size()+ " audios");
                System.out.println("\n\tEn total hay " +listadoVideos.size()+ " videos");
                break;
            default:
                System.out.println("La opcion no está entre las contempladas");
        }
        menuOpciones();
    }

    public void buscarPorAutor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Los elementos de que AUTOR quieres buscar?");
        String autorParaMostrar= sc.next();
        int contadorItems=0;
        for (Media item:listadoColeccion) {
            if (item.getAutor().equalsIgnoreCase(autorParaMostrar)) {
                item.mostrarDaatosResumen();
                contadorItems++;
            }
        }
        if (contadorItems<1){
            System.out.println("El autor especificado no tiene videos o no se escribió bien su nombre");
        }

        System.out.println(" ¿QUIERES HACER OTRA BUSQUEDA?\n1- SI\n2- NO");
        int buesquedaNueva= sc.nextInt();
        if( buesquedaNueva ==1){
            buscarPorAutor();
        }else {
            menuOpciones();
        }
    }

    public void menuOpciones() {
        System.out.println("\t\n¿QUE OPCION QUIERES REALIZAR?" +
                "\n 1- AGREGAR A LA COLECCION\n 2- ELIMINAR DE LA COLECCION" +
                "\n 3- LISTAR ELEMENTOS\n 4- BUSQUEDA POR AUTOR\n 5- SALIR");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextByte();
        switch (opcion) {
            case 1:
                agregarAColeccion();
                break;
            case 2:
                eliminarDeColeccion();
                break;
            case 3:
                listarElementosDeLaColeccion();
                break;
            case 4:
                buscarPorAutor();
                break;
            case 5:

                break;
            default:
                System.out.println("OPCION NO CONTEMPLADA");
                menuOpciones();

        }
    }



}
