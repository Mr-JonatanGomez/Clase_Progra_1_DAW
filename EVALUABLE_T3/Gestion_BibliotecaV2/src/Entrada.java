import controller.Biblioteca;
import controller.OperacionesFicheroObj;
import model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Biblioteca bibliotecaGeneral = null;
        Biblioteca bibliotecaTerror = null;
        Biblioteca bibliotecaPoliciaca = null;
        Biblioteca bibliotecaComedia = null;

        OperacionesFicheroObj operacionesFicheroObj = new OperacionesFicheroObj();

        //BORRAR FICHERO Y CREARLO DE NUEVO
        operacionesFicheroObj.borrarObj();
        operacionesFicheroObj.crearObjLibros();


        int tipoBiblioteca = -1;


        do {
            System.out.println("BIENVENIDO, ¿QUE TIPO DE BIBLIOTECA QUIERES CREAR?" +
                    "\n1- \uD83D\uDCDA GENERAL (admite todo tipo de tematicas) \uD83D\uDCDA" +
                    "\n2- \uD83E\uDDDB\u200D♂\uFE0F TERROR (solo admite libros de terror) \uD83E\uDDDB\u200D♂\uFE0F" +
                    "\n3- \uD83D\uDD75\uFE0F POLICIACA (solo admite novelas policiacas) \uD83D\uDD75\uFE0F" +
                    "\n4- \uD83E\uDD21 COMEDIA (solo admite libros de comedia) \uD83E\uDD21"/* +
                    "\n5- PROBAR LEER FICHERO Y BORRARLO"*/);
            try {
                tipoBiblioteca = sc.nextInt();

            } catch (InputMismatchException e) {
                System.err.println("🚫 El tipo de dato introducido, no es valido 🚫");
                sc.nextLine();
            }

            switch (tipoBiblioteca) {
                case 1:
                    bibliotecaGeneral = new Biblioteca("Biblioteca Municipal", "Cooperativa");
                    System.out.println("🏛️\uD83D\uDCDAHas creado una Biblioteca General\uD83D\uDCDA🏛️\n");

                    break;
                case 2:
                    bibliotecaTerror = new Biblioteca("Biblioteca Municipal Terror", "Cooperativa");
                    System.out.println("🏛️\uD83E\uDDDB\u200D♂\uFE0FHas creado una Biblioteca de Novela Terror \uD83E\uDDDB\u200D♂\uFE0F🏛️\n");

                    break;
                case 3:
                    bibliotecaPoliciaca = new Biblioteca("Biblioteca Municipal Policiaca", "Cooperativa");
                    System.out.println("🏛️\uD83D\uDD75\uFE0FHas creado una Biblioteca de Novela Policiaca🏛️\uD83D\uDD75\uFE0F️\n");

                    break;
                case 4:
                    bibliotecaComedia = new Biblioteca("Biblioteca Municipal Comedia", "Cooperativa");
                    System.out.println("🏛️\uD83E\uDD21Has creado una Biblioteca de Comedia\uD83E\uDD21🏛️\n");

                    break;

            }
        } while (tipoBiblioteca < 1 || tipoBiblioteca > 4);


        int opcionMenuInterior = -1;
        do {
            try {//METIDO AQUI EL TRY, si lo pongo antes del DO, al cazar el error termina el programa


                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\uD83C\uDFDB\uFE0F¿QUE QUIERES HACER?\uD83C\uDFDB\uFE0F" +
                        "\n1- CREA y ESTABE TAMAÑO CATALOGO \uD83D\uDDC3\uFE0F\t\t 4- MOSTRAR LIBRO DEL CATALOGO (ISBN)\uD83D\uDC40\t\t 7- GUARDAR FICHERO \uD83D\uDCBE " +
                        "\n2- AGREGA LIBRO AL CATALOGO ➕📗\t\t 5- MOSTRAR DATOS BIBLIOTECA 📖\t\t\t\t 8- LEER FICHERO \uD83D\uDCC3" +
                        "\n3- ELIMINAR LIBRO DEL CATALOGO ➖📕\t\t 6- BUSCAR CUALQUIER LIBRO (ISBN)🔢\t\t\t 9- GUARDAR FICHERO Y SALIR \uD83D\uDCBE 👋🏻");


                opcionMenuInterior = sc.nextInt();

// TODO: 14/04/2024 IF opcion 2, si catalogo es !null  desaparece la opcion 2 XD MAGIA 
                switch (opcionMenuInterior) {

                    case 1:
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
                    case 2:
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
                    case 3:
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

                    case 4:
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
                        if (tipoBiblioteca == 1) {
                            bibliotecaGeneral.busquedaISBNGlobal();
                        }
                        if (tipoBiblioteca == 2) {
                            bibliotecaTerror.busquedaISBNGlobal();
                        }
                        if (tipoBiblioteca == 3) {
                            bibliotecaPoliciaca.busquedaISBNGlobal();
                        }
                        if (tipoBiblioteca == 4) {
                            bibliotecaComedia.busquedaISBNGlobal();
                        }
                        break;

                    case 7:
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

                    case 8:
                        System.out.println("Probando a leer FICHERO");
                        operacionesFicheroObj.leerFichero();

                        break;

                    case 9:
                        System.out.println("GUARDANDO ARCHIVOS...");
                        try {
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
                            System.out.println("CERRANDO PROGRAMA");
                        } catch (NullPointerException e) {
                            System.err.println("El catalogo no existe, Saliendo sin guardar DATOS");
                        }


                        break;
                    default:
                        System.out.println("OPCION NO CONTEMPLADA");
                        break;
                }


            } catch (CatalogoNoExisteException e) {
                System.err.println(e.getMessage());//AQUI VA EL RUNTIME JODER,
                // MEJOR IR AL DETALLE DENTRO DEL METODO
            } catch (TipoDatosNoContemplados e) {
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("\n\t\t\t🚫 El tipo de dato introducido, no es valido 🚫\n");
                sc.nextLine();
            } catch (CatalogoLlenoException e) {
                System.err.println(e.getMessage());
            } catch (NoExisteLibroEnBusqueda e) {
                System.err.println(e.getMessage());
            } finally {
                System.err.println("");//este Finally siempre me salia mensaje de fallo siendo mentira
            }
        } while (opcionMenuInterior != 9);


    }

}