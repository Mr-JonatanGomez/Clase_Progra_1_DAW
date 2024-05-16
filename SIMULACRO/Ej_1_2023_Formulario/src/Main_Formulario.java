import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Formulario {
    public static void main(String[] args) {
        /// EMPEZADO 15:00...15:38
        // no he sabido lanzar la exception
        // no he sabido sacar si ultimo es digit
        // estimacion 1.75
        int opcion = -1;
        String nombre = null;
        String apellido = null;
        String DNI = null;




        do {
            try {
            Scanner sc = new Scanner(System.in);

            System.out.println("""
                    MENU DE OPCIONES
                    1- Rellenar Nombre
                    2- Rellenar Apellidos
                    3- Rellenar DNI
                    4- Finalizar""");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Escriba el nombre");
                    nombre = sc.next();

                    break;

                case 2:
                    System.out.println("Escriba los apellidos");
                    apellido = sc.next();

                    break;

                case 3:
                    //String dniComprob=null;
                    char dniCompro;
                    System.out.println("Escriba el DNI");
                    DNI = sc.next();
                    dniCompro=DNI.charAt(DNI.length()-1);

                    if (!Character.isLetter(dniCompro)){
                        try {
                            throw new DigitoNoLetraException("Exception");
                        } catch (DigitoNoLetraException e) {
                            System.err.println("El ultimo caracter debe ser una letra");
                        }
                    }

                    if (DNI.length() != 9) {
                        try {
                            throw new LongitudDNINoValidaException("Long. No OK");
                        } catch (LongitudDNINoValidaException e) {
                            System.err.println("DNI no tiene 9 caracteres");
                        }
                        // throw LongitudDNINoValidaException;
                    }



                    break;

                case 4:
                    if (nombre == null || apellido == null || DNI == null) {
                        System.out.println("Lo siento, te faltan datos por rellenar");
                    }
                    break;

                default:
                    System.out.println("opcion no contemplada");
                    break;
            }
            }catch (InputMismatchException e){
                System.err.println("Tipo de datos erroneo");
            }
        } while (opcion != 4 || nombre == null || apellido == null || DNI == null);

        System.out.println(nombre + " " + apellido + " " + DNI);


    }
}
