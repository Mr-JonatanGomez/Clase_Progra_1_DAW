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
                    String [] dniComprob=null;
                    System.out.println("Escriba el DNI");
                    DNI = sc.next();

                    if (DNI.length() != 9) {
                        System.err.println("DNI no tiene 9 caracteres");
                        // throw LongitudDNINoValidaException;
                    }
                    for (int i = 0; i < DNI.length(); i++) {
                        dniComprob[i]= String.valueOf((i));
                        //if (DNI[8].){

                        }
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
        } while (opcion != 4 || nombre == null || apellido == null || DNI == null);

        System.out.println(nombre + " " + apellido + " " + DNI);
    }
}
