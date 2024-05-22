import java.util.InputMismatchException;
import java.util.Scanner;

public class Formulario {
    //COMENZADO 15:40 16:11
    //16.30 mirando para sacar isDigit y isChar

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = null;
        String apellido = null;
        String email = null;
        String dNI = null;

        int opcion = -1;


        do {
            try {
                System.out.println("""
                        INTRODUCE LOS DATOS CON ESTE MENU
                        1- NOMBRE
                        2- APELLIDO
                        3- DNI
                        4- EMAIL
                        5- SALIR
                        """);
                opcion = sc.nextInt();
                String[] comprobador;
                char[] pasandolo;
                switch (opcion) {
                    case 1:
                        nombre = sc.next();
                        for (int i = 0; i < nombre.length(); i++) {
                            //le meto el menos uno porque asi excluye de la ecuacion al ultimo
                            if (Character.isDigit(nombre.charAt(i))){
                                throw new TipoDatoIncorrecto("Nombre y Apellido solo debe contener Letras");
                            }

                        }

                        break;
                    case 2:
                        apellido = sc.next();
                        for (int i = 0; i < apellido.length(); i++) {
                            //le meto el menos uno porque asi excluye de la ecuacion al ultimo
                            if (Character.isDigit(apellido.charAt(i))){
                                throw new TipoDatoIncorrecto("Nombre y Apellido solo debe contener Letras");
                            }

                        }
                        break;
                    case 3:
                        dNI = sc.next();
                        if (dNI.length() != 9) {
                            throw new LongitudNoValida("Longitud no valida");
                        }

                        for (int i = 0; i < dNI.length()-1; i++) {
                            //le meto el menos uno porque asi excluye de la ecuacion al ultimo
                            if (Character.isLetter(dNI.charAt(i))){
                                throw new Los8PrimerosDebenNumeros("Los 8 primeros char, deben ser NUMEROS");
                            }

                        }
                        if (Character.isDigit(dNI.charAt(dNI.length() - 1))) {
                            throw new UltimoDebeSerLetraYEsNumero("El ultimo char del DNI debe ser una LETRA");
                        }


                    break;
                    case 4:
                        email = sc.next();
                        if (!email.contains("@") && !email.contains("'.'")) {
                            throw new EmailIncorrecto("Email debe contener @ y punto");
                        }
                        break;
                    case 5:
                        if (nombre == null || apellido == null || email == null || dNI == null) {
                            System.err.println("No se puede salir sin haber rellenado todos los datos");
                        }
                        System.out.println("SALIENDO DEL MENU");
                        break;
                    default:
                        System.out.println("Tipo de datos no valido");
                        break;
                }

            } catch (LongitudNoValida e) {
                System.err.println(e.getMessage());
            } catch (EmailIncorrecto e) {
                System.err.println(e.getMessage());
            }  catch (Los8PrimerosDebenNumeros e) {
                System.err.println(e.getMessage());
            }catch (UltimoDebeSerLetraYEsNumero e) {
                System.err.println(e.getMessage());
            } catch (TipoDatoIncorrecto e) {
                System.err.println(e.getMessage());
            }

        } while (opcion != 5 || nombre == null || apellido == null || email == null || dNI == null);


        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("dNI = " + dNI);
        System.out.println("email = " + email);
    }
}
