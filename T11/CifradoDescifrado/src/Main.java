import controller.OperacionesFichero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
3. (Cifrado / Descifrado) Crea una aplicación que permita cifrar o descifrar un fichero.
Para ello, la aplicación nada más empezar pedirá mediante un menú cual es la acción que
se quiere realizar:

    1. Cifrar: En el caso de seleccionar cifrar, el sistema pedirá el mensaje (mediante
    BufferedReader) y cual es la clave con la que se va a cifrar (un numero). Una vez
    introducido ambas, se pedirá el nombre del fichero y escribirá dicho fichero con
    los codigos ASCII del mensaje cifrado

        1. Descifrar: En el caso de seleccionar descifrar, el sistema pedirá el nombre
        del fichero a descifrar y la clave de descifrado (numérica). A continuación
        mostrará el mensaje del fichero leido. En el caso de no existir el fichero
        saltará un aviso de que el fichero no existe
        */
        OperacionesFichero operacionesFichero= new OperacionesFichero();
        //Buffered a modo Scanner
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un mensaje para guardar en fichero");
        int opcion = 0;
        int claveCifrado;
        do {
            System.out.println("\n¿QUE QUIERES HACER?\n-1 CIFRAR FICHERO\n-2 DESCIFRAR FICHERO\n-3 LEER FICHERO ACTUAL\n-4 SALIR");
            Scanner sc = new Scanner(System.in);
            try {
                opcion = sc.nextInt();


                switch (opcion) {
                    case 1:
                        System.out.println("Escribe el mensaje que quieres cifrar");
                        String mensaje = scanner.readLine();
                        System.out.println("Introduce una clave para cifrar");
                        claveCifrado= sc.nextInt();
                        operacionesFichero.cifrarFichero(mensaje,claveCifrado);
                        System.out.println("Cifrando");
                        break;
                    case 2:
                        System.out.println("Desifrando");

                        System.out.println("Introduce el nombre del fichero que quieres descifrar");
                        String aDescifrar = sc.next();
                        System.out.println("Introduce una clave de descifraado");
                        claveCifrado= sc.nextInt();
                        operacionesFichero.descifrarFichero(aDescifrar,claveCifrado);
                        break;
                    case 3:
                        System.out.println("Leyendo");
                        operacionesFichero.leerFichero();
                        break;
                    case 4:
                        System.out.println("Saliendo");
                        break;
                    default:
                        System.err.println("Opcion invalida");
                }

            } catch (InputMismatchException e) {
                System.err.println("Tipo de dato incorrecto, introduce numero entero.");
            } catch (IOException e) {
                System.err.println("Error de entrada o salida de datos");
            }
        } while (opcion != 4);
    }
}
