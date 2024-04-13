import controller.BibliotecaNoGenerics;
import controller.OperacionesFicheroObj;
import model.*;

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
        BibliotecaNoGenerics bCOmprobar = new  BibliotecaNoGenerics("sd","sd");

        OperacionesFicheroObj operacionesFicheroObj= new OperacionesFicheroObj();

        // TODO: 13/04/2024 CODIGO PARA REESTABLECER FICHERO

        /*BibliotecaNoGenerics b0 = new BibliotecaNoGenerics("0","0");
        b0.reiniciarFicheroObj();
        b0 = null;
        */



        int tipoBiblioteca = 0;


        do {
            System.out.println("BIENVENIDO, ¿QUE TIPO DE BIBLIOTECA QUIERES CREAR?" +
                    "\n1- GENERAL (admite todo tipo de tematicas)" +
                    "\n2- TERROR (solo admite libros de terror)" +
                    "\n3- POLICIACA (solo admite novelas policiacas)" +
                    "\n4- COMEDIA (solo admite libros de comedia)" +
                    "\n5- PROBAR LEER FICHERO");
            tipoBiblioteca = sc.nextInt();

            switch (tipoBiblioteca) {
                case 1:
                    bibliotecaGeneral = new BibliotecaNoGenerics("Biblioteca Municipal", "Cooperativa");
                    System.out.println("🏛️Has creado una Biblioteca General🏛️\n");

                    break;
                case 2:
                    bibliotecaTerror = new BibliotecaNoGenerics("Biblioteca Municipal Terror", "Cooperativa");
                    System.out.println("🏛️Has creado una Biblioteca de Novela Terror🏛️\n");

                    break;
                case 3:
                    bibliotecaPoliciaca = new BibliotecaNoGenerics("Biblioteca Municipal Policiaca", "Cooperativa");
                    System.out.println("🏛️Has creado una Biblioteca de Novela Policiaca🏛️\n");

                    break;
                case 4:
                    bibliotecaComedia = new BibliotecaNoGenerics("Biblioteca Municipal Comedia", "Cooperativa");
                    System.out.println("🏛️Has creado una Biblioteca de Comedia🏛️\n");

                    break;
                case 5:
                    try{
                        bCOmprobar.catalogoTesterMenu(100);
                        bCOmprobar.leerFichero();
                    }catch (NullPointerException e){
                        System.out.println("El fichero esta vacio, y no puede ser leido");
                    }
                    break;

            }
        } while (tipoBiblioteca < 1 || tipoBiblioteca > 4);


        int opcionMenuInterior = -1;
        do {
            try {//METIDO AQUI EL TRY, si lo pongo antes del DO, al cazar el error termina el programa
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\uD83C\uDFDB\uFE0F¿QUE QUIERES HACER?\uD83C\uDFDB\uFE0F" +
                        "\n1- GUARDAR FICHERO \uD83C\uDFDB\uFE0F\t\t4- ELIMINAR LIBRO DEL CATALOGO ➖📕\t\t7- MOSTRAR UN LIBRO DEL MUNDO (ISBN)🔢" +
                        "\n2- CREA y ESTABE TAMAÑO CATALOGO \uD83D\uDDC3\uFE0F\t\t5- MOSTRAR DATOS BIBLIOTECA 📖\t\t\t8-MOSTRAR LIBRO DEL CATALOGO (ISBN) " +
                        "\n3- AGREGA LIBRO AL CATALOGO ➕📗\t6- LEER FICHERO 📚\t\t\t9-HAY CAZAR EXCEPTION CATALOGO NO EXISTE GUARDAR EN .obj Y SALIR 👋🏻");
                opcionMenuInterior = sc.nextInt();


                switch (opcionMenuInterior) {
                    case 1:
                        System.out.println("GUARDANDO ARCHIVOS...");

                        if (tipoBiblioteca == 1) {
                            bibliotecaGeneral.escribirObjetoBib();
                        }
                        if (tipoBiblioteca == 2) {
                            bibliotecaTerror.escribirObjetoBib();
                        }
                        if (tipoBiblioteca == 3) {
                            bibliotecaPoliciaca.escribirObjetoBib();
                        }
                        if (tipoBiblioteca == 4) {
                            bibliotecaComedia.escribirObjetoBib();
                        }

                        System.out.println("ARCHIVOS GUARDADOS CON EXITO");
                        break;
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
                        if (tipoBiblioteca == 1) {
                            bibliotecaGeneral.eliminarLibroEnCatalogo();
                        }
                        if (tipoBiblioteca == 2) {
                            bibliotecaTerror.eliminarLibroEnCatalogo();
                        }
                        if (tipoBiblioteca == 3) {
                            bibliotecaPoliciaca.eliminarLibroEnCatalogo();
                        }
                        if (tipoBiblioteca == 4) {
                            bibliotecaComedia.eliminarLibroEnCatalogo();
                        }

                        break;
                    case 5:
                        if (tipoBiblioteca == 1) {
                            bibliotecaGeneral.mostrarDatosBiblio();
                        }
                        if (tipoBiblioteca == 2) {
                            bibliotecaTerror.mostrarDatosBiblio();
                        }
                        if (tipoBiblioteca == 3) {
                            bibliotecaPoliciaca.mostrarDatosBiblio();
                        }
                        if (tipoBiblioteca == 4) {
                            bibliotecaComedia.mostrarDatosBiblio();
                        }
                        break;
                    case 6:
                        System.out.println("Probando a leer FICHERO");
                        if (tipoBiblioteca == 1) {
                            bibliotecaGeneral.leerFichero();
                        }
                        if (tipoBiblioteca == 2) {
                            bibliotecaTerror.leerFichero();
                        }
                        if (tipoBiblioteca == 3) {
                            bibliotecaPoliciaca.leerFichero();
                        }
                        if (tipoBiblioteca == 4) {
                            bibliotecaComedia.leerFichero();
                        }
                        break;
                    case 7:
                        //bibliotecaTerror.busquedaISBNGlobal();
                        break;
                    case 8:
                        if (tipoBiblioteca == 1) {
                            bibliotecaGeneral.buscarISBNEnCatalogo();
                        }
                        if (tipoBiblioteca == 2) {
                            bibliotecaTerror.buscarISBNEnCatalogo();
                        }
                        if (tipoBiblioteca == 3) {
                            bibliotecaPoliciaca.buscarISBNEnCatalogo();
                        }
                        if (tipoBiblioteca == 4) {
                            bibliotecaComedia.buscarISBNEnCatalogo();
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
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("\n\t\t\t🚫 El tipo de dato introducido, no es valido 🚫\n");
                sc.nextLine();
            } catch (CatalogoLlenoException e) {
                System.out.println(e.getMessage());
            } catch (NoExisteLibroEnBusqueda e) {
                System.out.println(e.getMessage());
            }finally {
                System.out.println("");//este Finally siempre me salia mensaje de fallo siendo mentira
            }
        } while (opcionMenuInterior != 9);


    }

}