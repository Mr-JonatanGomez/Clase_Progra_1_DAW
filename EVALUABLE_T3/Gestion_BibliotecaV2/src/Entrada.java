import controller.Biblioteca;
import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //b.busquedaISBN();

        //b.mostrarGlobal(); sin implementar este metodo
        //biblioteca1.busquedaISBN();
        //Biblioteca biblioteca1 = new Biblioteca<>("Biblioteca Municipal", "Cooperativa");
        Biblioteca<Libro> biblioteca1 = new Biblioteca("Biblioteca Municipal", "Cooperativa");
/*
        Biblioteca b = new Biblioteca("Biblioteca Municipal", "Cooperativa");

        b.mostrarDatosBiblio();
*/
        int opcionMenuPrin;
        System.out.println("BIENVENIDO, ¿QUE TIPO DE BIBLIOTECA QUIERES CREAR?" +
                "\n1- GENERAL (admite todo tipo de tematicas)" +
                "\n2- TERROR (solo admite libros de terror)" +
                "\n3- POLICIACA (solo admite novelas policiacas)" +
                "\n4- COMEDIA (solo admite libros de comedia)");


        int opcionMenuInterior;
        do {
            System.out.println("\t\t\t\t\t\t\t\uD83C\uDFDB\uFE0F¿QUE QUIERES HACER?\uD83C\uDFDB\uFE0F" +
                    "\n1- EDITAR BIBLIOTECA 📚\t\t3- AGREGAR LIBRO AL CATALOGO ➕📗\t\t5- MOSTRAR DATOS BIBLIOTECA 📖" +
                    "\n2- CREAR CATALOGO \uD83D\uDDC3\uFE0F\t\t4- ELIMINAR LIBRO DEL CATALOGO ➖📕\t\t6- MOSTRAR LIBROS DEL MUNDO" +
                    "\n9- SALIR 👋🏻");
            opcionMenuInterior = sc.nextInt();
            try {//METIDO AQUI EL TRY, si lo pongo antes del DO, al cazar el error termina el programa
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
                        ArrayList<Libro> listaGlobalLibros = DepositoLibros.crearLibros();//si se necesita mas veces instancias arriba
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
            } catch (CatalogoNoExisteException e) {
                System.out.println(e.getMessage());//AQUI VA EL RUNTIME JODER,
                // MEJOR IR AL DETALLE DENTRO DEL METODO
            } catch (TipoDatosNoContemplados e) {
                System.out.println("🚫El tipo de datos introducido no es correcto🚫");
            }
        } while (opcionMenuInterior != 9);


    }

}