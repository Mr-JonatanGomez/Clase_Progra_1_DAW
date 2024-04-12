import controller.Biblioteca;
import controller.BibliotecaNoGenerics;
import model.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaNoGenerics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // OperacionesFicheroObj operacionesFicheroObj= new OperacionesFicheroObj();
        //Biblioteca bibliotecaTerror = new Biblioteca<>("Biblioteca Municipal", "Cooperativa");


        BibliotecaNoGenerics bibliotecaGeneral = null;
        BibliotecaNoGenerics bibliotecaTerror = null;
        BibliotecaNoGenerics bibliotecaPoliciaca = null;
        BibliotecaNoGenerics bibliotecaComedia = null;


        int tipoBiblioteca = 0;


        do {
            System.out.println("BIENVENIDO, ¿QUE TIPO DE BIBLIOTECA QUIERES CREAR?" +
                    "\n1- GENERAL (admite todo tipo de tematicas)" +
                    "\n2- TERROR (solo admite libros de terror)" +
                    "\n3- POLICIACA (solo admite novelas policiacas)" +
                    "\n4- COMEDIA (solo admite libros de comedia)");
            tipoBiblioteca = sc.nextInt();

            switch (tipoBiblioteca) {
                case 1:
                    bibliotecaGeneral = new BibliotecaNoGenerics("Biblioteca Municipal", "Cooperativa");
                    System.out.println("🏛️Has creado una Biblioteca General🏛️");
                    break;
                case 2:
                    bibliotecaTerror = new BibliotecaNoGenerics("Biblioteca Municipal Terror", "Cooperativa");
                    System.out.println("🏛️Has creado una Biblioteca de Novela Terror🏛️");
                    break;
                case 3:
                    bibliotecaPoliciaca = new BibliotecaNoGenerics("Biblioteca Municipal Policiaca", "Cooperativa");
                    System.out.println("🏛️Has creado una Biblioteca de Novela Policiaca🏛️");
                    break;
                case 4:
                    bibliotecaComedia = new BibliotecaNoGenerics("Biblioteca Municipal Comedia", "Cooperativa");
                    System.out.println("🏛️Has creado una Biblioteca de Comedia🏛️");
                    break;

            }
        } while (tipoBiblioteca < 1 || tipoBiblioteca > 4);


        int opcionMenuInterior = -1;
        do {
            try {//METIDO AQUI EL TRY, si lo pongo antes del DO, al cazar el error termina el programa
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\uD83C\uDFDB\uFE0F¿QUE QUIERES HACER?\uD83C\uDFDB\uFE0F" +
                        "\n1- OPCION LIBRE AUN DADDAD \uD83C\uDFDB\uFE0F\t\t4- ELIMINAR LIBRO DEL CATALOGO ➖📕\t\t7- MOSTRAR UN LIBRO DEL MUNDO (ISBN)🔢" +
                        "\n2- CREA/MOD. TAMAÑO CATALOGO \uD83D\uDDC3\uFE0F\t\t5- MOSTRAR DATOS BIBLIOTECA 📖\t\t\t8-MOSTRAR LIBRO DEL CATALOGO (ISBN) " +
                        "\n3- AGREGA LIBRO AL CATALOGO ➕📗\t6- MOSTRAR LIBROS DEL MUNDO 📚\t\t\t9- SALIR 👋🏻");
                opcionMenuInterior = sc.nextInt();


                switch (opcionMenuInterior) {
                    case 1:

                    case 2:
                        if (tipoBiblioteca == 1) {
                            bibliotecaGeneral.crearCatalogo();
                        }
                        if (tipoBiblioteca == 2) {
                            bibliotecaTerror.crearCatalogo();
                        }
                        if (tipoBiblioteca == 3) {
                            bibliotecaPoliciaca.crearCatalogo();
                        }
                        if (tipoBiblioteca == 4) {
                            bibliotecaComedia.crearCatalogo();
                        }

                        break;
                    case 3:
                        if (tipoBiblioteca == 1) {
                            bibliotecaGeneral.agregarLibroEnCatalogoGeneral();
                        }
                        if (tipoBiblioteca == 2) {
                            bibliotecaTerror.agregarLibroEnCatalogoTerror();
                        }
                        if (tipoBiblioteca == 3) {
                            bibliotecaPoliciaca.agregarLibroEnCatalogoPoliciaco();
                        }
                        if (tipoBiblioteca == 4) {
                            bibliotecaComedia.agregarLibroEnCatalogoComedia();
                        }
                        break;
                    case 4:
                        bibliotecaTerror.eliminarLibroEnCatalogo();
                        break;
                    case 5:
                        bibliotecaTerror.mostrarDatosBiblio();
                        break;
                    case 6:

                        ArrayList<Libro> listaGlobalLibros = DepositoLibros.crearLibros();//si se necesita mas veces instancias arriba
                        for (Libro libro : listaGlobalLibros) {
                            libro.mostrarDatos();
                        }
                        break;
                    case 7:
                        bibliotecaTerror.busquedaISBNGlobal();
                        break;
                    case 8:
                        bibliotecaTerror.buscarISBNEnCatalogo();
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
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("\n\t\t\t🚫 El tipo de dato introducido, no es valido 🚫\n");
                sc.nextLine();
            } catch (CatalogoLlenoException e) {
                System.out.println(e.getMessage());
            } catch (NoExisteLibroEnBusqueda e) {
                System.out.println(e.getMessage());
            }
        } while (opcionMenuInterior != 9);


    }

}