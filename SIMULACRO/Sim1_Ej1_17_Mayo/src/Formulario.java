import java.util.Scanner;

public class Formulario {
    // 16:10 -- 16:46
    //36 MINUTOS
    /*
    CONSEGUIDO (2.42)
        1.5     Menu
        0.36    DNI longitud
        0.36    Exception del email
        0.2     Datos Sacados

    NO CONSEGUIDO (1.08)
        0.18 Se introducen letras solo en nombre
        0.18 Se introducen letras solo en apellido
        0.36 Ultimo Caracter es letra
        0.36 Primeros 8 Caracter es numeros
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = null;
        String apellido = null;
        String DNI = null;
        String email = null;

        int opcion = -1;

        do {
            try {


                System.out.println("""
                        MENU DE OPCIONES
                        1. Rellenar Nombre
                        2. Rellenar Apellidos
                        3. Rellenar DNI
                        4. Rellenar email
                        5. Finalizar
                        """);

                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el Nombre");
                        nombre = sc.next();
                        for (int i = 0; i < nombre.length() - 1; i++) {
                            Character.isLetter(nombre.charAt(i));
                        }

                        break;
                    case 2:
                        System.out.println("Introduce el Apellido");
                        apellido = sc.next();
                        break;
                    case 3:
                        System.out.println("Introduce el DNI");
                        DNI = sc.next();
                        int longitud= DNI.length();

                        if (DNI.length() != 9) {
                            throw new LongitudIncorrectaDNIException("error Longitud no valida");
                        }
                        // añadido despues
                        if(Character.isDigit(DNI.charAt(longitud-1))){
                            throw new UltimoCaracterNoLetraException("El ultimo char no es letra");
                        }
                        for (int i = 0; i < DNI.length()-2; i++) {
                            if (!Character.isDigit(i)){
                                throw new LetrasEnNumeracionException("La numeracion contiene letras");
                            }
                        }


                        break;
                    case 4:
                        System.out.println("Introduce el mail");
                        email = sc.next();
                        if (!email.contains("@") && !email.contains("'.'")){
                            throw new EmailIncorrectoException("Email debe contener @ y punto" );
                        }
                        break;
                    case 5:
                        if (nombre == null || apellido == null || email == null || DNI == null) {
                            System.err.println("No puedes salir, te faltan datos por rellenar");
                        }
                        System.out.println("Finalizando el menú");
                        break;
                }
            } catch (LongitudIncorrectaDNIException e) {
                System.err.println(e.getMessage());
            } catch (EmailIncorrectoException e){
                System.err.println(e.getMessage());
            } catch (UltimoCaracterNoLetraException e){
                System.err.println(e.getMessage());
            } catch (LetrasEnNumeracionException e) {
                System.err.println(e.getMessage());
            }

        } while (opcion != 5 || nombre == null || apellido == null || email == null || DNI == null);
        System.out.printf("%s, %s, %s, %s",nombre, apellido, email, DNI);
    }
}
