import controller.Biblioteca;
import controller.Biblioteca2P;
import model.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada2Pruebas {
    public static void main(String[] args) {

        ArrayList<Libro>listaGlobalLibros = new ArrayList<>();

        LibroTerror l1= new LibroTerror("It", "Stephen King", "0001t", 317, 16);
        LibroTerror l2= new LibroTerror("Joyland", "Stephen King", "0003t", 370, 14);
        LibroTerror l3= new LibroTerror("The Silence of the Lambs", "Thomas Harris", "0005t", 368, 18);
        LibroPoliciaco l4 = new LibroPoliciaco("Los hombres que no amaban a las mujeres", "Stieg Larsson", "0006p", 465, Trama.misterio);
        LibroPoliciaco l5 = new LibroPoliciaco("La chica que soñaba con una cerilla y un bidón de gasolina", "Stieg Larsson", "0007p", 569, Trama.misterio);
        LibroPoliciaco l6 = new LibroPoliciaco("La reina en el palacio de las corrientes de aire", "Stieg Larsson", "0008p", 602, Trama.misterio);
        LibroComedia l7 = new LibroComedia("El club de la lucha", "Chuck Palahniuk", "0012c", 289, TipoHumor.amarillo);
        LibroComedia l8 = new LibroComedia("La princesa prometida", "William Goldman", "0013c", 364, TipoHumor.amarillo);
        LibroComedia l9 = new LibroComedia("Las ventajas de ser un marginado", "Stephen Chbosky", "0014c", 418, TipoHumor.amarillo);


        Scanner sc = new Scanner(System.in);

        //Biblioteca biblioteca1 = new Biblioteca<>("Biblioteca Municipal", "Cooperativa");
        Biblioteca2P<Libro> biblioteca1 = new Biblioteca2P<>("Biblioteca Municipal", "Cooperativa");
        Biblioteca2P<LibroTerror> biblioteca2 = new Biblioteca2P<>("Biblioteca Municipal", "Cooperativa");
        Biblioteca2P<LibroPoliciaco> biblioteca3 = new Biblioteca2P<>("Biblioteca Municipal", "Cooperativa");
        Biblioteca2P<LibroComedia> biblioteca4 = new Biblioteca2P<>("Biblioteca Municipal", "Cooperativa");

        biblioteca2.crearCatalogo2(4);
        biblioteca2.agregarLibroEnCatalogo2(l1);
        biblioteca2.agregarLibroEnCatalogo2(l3);

   /*
        int opcionMenuPrin;
        System.out.println("BIENVENIDO, ¿QUE TIPO DE BIBLIOTECA QUIERES CREAR?" +
                "\n1- GENERAL (admite todo tipo de tematicas)" +
                "\n2- TERROR (solo admite libros de terror)" +
                "\n3- POLICIACA (solo admite novelas policiacas)" +
                "\n4- COMEDIA (solo admite libros de comedia)");


        int opcionMenuInterior=0;
        do {
            try {//METIDO AQUI EL TRY, si lo pongo antes del DO, al cazar el error termina el programa
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\uD83C\uDFDB\uFE0F¿QUE QUIERES HACER?\uD83C\uDFDB\uFE0F" +
                    "\n1- EDITAR DATOS BIBLIOTECA \uD83C\uDFDB\uFE0F\t\t4- ELIMINAR LIBRO DEL CATALOGO ➖📕\t\t7- MOSTRAR UN LIBRO DEL MUNDO (ISBN)🔢" +
                    "\n2- CREA/MOD. TAMAÑO CATALOGO \uD83D\uDDC3\uFE0F\t\t5- MOSTRAR DATOS BIBLIOTECA 📖\t\t\t8-MOSTRAR LIBRO DEL CATALOGO (ISBN) " +
                    "\n3- AGREGA LIBRO AL CATALOGO ➕📗\t6- MOSTRAR LIBROS DEL MUNDO 📚\t\t\t9- SALIR 👋🏻");
            opcionMenuInterior = sc.nextInt();


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
                    case 7:
                        biblioteca1.busquedaISBNGlobal();
                        break;
                    case 8:
                        biblioteca1.buscarISBNEnCatalogo();
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
            } catch (TipoDatosNoContemplados e){
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("\n\t\t\t🚫 El tipo de dato introducido, no es valido 🚫\n");
                sc.nextLine();
            } catch (CatalogoLlenoException e){
                System.out.println(e.getMessage());
            } catch (NoExisteLibroEnBusqueda e){
                System.out.println(e.getMessage());
            }
        } while (opcionMenuInterior != 9);

*/
    }

}