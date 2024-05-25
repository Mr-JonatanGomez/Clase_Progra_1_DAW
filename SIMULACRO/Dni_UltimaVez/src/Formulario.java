import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = null;
        String apellido = null;
        String DNI = null;
        String email = null;
        int opcion = -1;
        boolean datosCompletos = false;

        do {

            try {




                System.out.println("""
                        1-Introduce nombre
                        2-Introduce Apellido
                        3-Introduce DNI
                        4-Introduce email
                        5- Salir
                        """);

                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Introduce nombre");
                        nombre = sc.next();
                        for (int i = 0; i < nombre.length(); i++) {

                            if (Character.isDigit(nombre.charAt(i))) {
                               throw new TipoDatoIncorrecto("El nombre no puede llevar digitos");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Introduce apellido");
                        apellido = sc.next();
                        for (int i = 0; i < apellido.length(); i++) {

                            if (Character.isDigit(apellido.charAt(i))) {
                                throw new TipoDatoIncorrecto("El nombre no puede llevar digitos");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Introduce DNI");
                        DNI = sc.next();
                        if (DNI.length()!=9){
                            throw new LongitudInvalida("La longitud debe ser de 8 digitos y 1 letra (9 en total)");
                        }

                        for (int i = 0; i < DNI.length()-1; i++) {
                            //le meto el -1 para que no coja el ultimo que es letra
                            if (Character.isLetter(DNI.charAt(i))){
                                throw new NumeracionContieneLetras("Los 8 primeros deben ser numeros");
                            }

                        }

                        if (Character.isDigit(DNI.charAt(DNI.length()-1))) {
                            throw new UltimoNoLetra("El ultimo caracter debe ser LETRA");
                        }


                        break;
                    case 4:
                        System.out.println("Introduce email");
                        email = sc.next();
                        if (!email.contains("@")&& !email.contains("'.'")){
                            throw new TipoEmailNoCorrecto("El email debe llevar @ y un punto");
                        }
                        break;
                    case 5:
                        if (nombre != null && apellido != null && DNI != null && email != null) {
                            System.out.println("saliendo del menu");
                            datosCompletos = true;
                        } else {
                            System.err.println("No puedes salir del menú sin rellenar todos los datos");
                        }

                        break;
                }


            } catch (TipoDatoIncorrecto e) {
                System.err.println(e.getMessage());
            } catch (TipoEmailNoCorrecto e) {
                System.err.println(e.getMessage());

            } catch (LongitudInvalida e) {
                System.err.println(e.getMessage());

            } catch (NumeracionContieneLetras e) {
                System.err.println(e.getMessage());

            } catch (UltimoNoLetra e) {
                System.err.println(e.getMessage());

            }

        } while (opcion != 5 || !datosCompletos);

        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("DNI = " + DNI);
        System.out.println("email = " + email);
    }
}
