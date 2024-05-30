import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = null;
        String apellido = null;
        String DNI = null;
        int opcion = -1;
        boolean datosCompletos = false;

        do {
            try {



            System.out.println("""
                                    
                    1- Rellenar nombre
                    2- Rellenar apellido
                    3- DNI
                    4- Finalizar
                    """);

            System.out.println("Elija una opcion");
            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Introduzca nombre");
                    nombre = sc.next();
                    break;
                case 2:
                    System.out.println("Introduzca apellido");
                    apellido = sc.next();
                    break;
                case 3:
                    System.out.println("Introduzca DNI");
                    DNI = sc.next();

                    if (DNI.length() != 9) {
                        DNI=null;
                        throw new LongitudDNINoValidaException("Longitud no valida");
                    }

                    if(!Character.isLetter(DNI.charAt(DNI.length()-1))){
                        DNI=null;
                        throw new UltimoDigitoNoLetraException("El ultimo debe ser letra");
                    }

                    break;
                case 4:
                    if (nombre != null && apellido != null && DNI != null) {
                        System.out.println("Saliendo");
                        datosCompletos = true;
                        break;
                    } else {
                        System.out.println("No puedes salir sin rellenar todo");
                    }
            }

            } catch (LongitudDNINoValidaException e) {
                System.out.println(e.getMessage());
            } catch (UltimoDigitoNoLetraException e) {
                System.out.println(e.getMessage());
            }

        } while (!datosCompletos);

        System.out.println("nombre es:"+nombre);
        System.out.println("apellido es:"+apellido);
        System.out.println("dni es:"+DNI);
    }

}
