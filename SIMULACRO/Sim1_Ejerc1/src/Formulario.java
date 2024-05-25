import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {
        // HORA DE EMPIECE 17:58
        //PARTE 1 fin 18:08
        //Ecept 1 y 2 18:17
        // except 3 18:19 18:23
        // todos 18:26 (28 minutos)

        // 18:29 COMPLETO CON COMPROBACIONES
        String nombre=null;
        String apellido=null;
        String DNI=null;
        String email=null;
        boolean datosRellenos= false;

        Scanner sc = new Scanner(System.in);
        int opcion=-1;
        do {
            try {


            System.out.println("""
                MENU:
                1- RELLENAR NOMBRE
                2- RELLENAR APELLIDO
                3- RELLENAR DNI
                4- RELLENAR EMAIL
                5-FINALIZAR
                """);
            opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Escribe el nombre");
                    nombre=sc.next();

                    for (int i = 0; i < nombre.length(); i++) {
                        if (Character.isDigit(nombre.charAt(i))){
                            throw new TipoDatoIncorrectoException("Nombre no puede llevar digitos");
                        }
                    }

                    break;
                case 2:
                    System.out.println("Escribe el apellido");
                    apellido=sc.next();

                    for (int i = 0; i < apellido.length(); i++) {
                        if (Character.isDigit(apellido.charAt(i))){
                            throw new TipoDatoIncorrectoException("Apellido no puede llevar digitos");
                        }
                    }

                    break;
                case 3:
                    System.out.println("Escribe el DNI");
                    DNI=sc.next();

                    if (DNI.length()!=9){
                        throw new LongitudDNINoValidaException("Longitud DNI debe ser de 9 caracteres");
                    }
                    if (Character.isDigit(DNI.charAt(DNI.length()-1))){
                        throw new UltimoDigititoNoLetraExcept("El ultimo caracter debe ser LETRA");
                    }

                    for (int i = 0; i < DNI.length()-1; i++) {

                        if (Character.isLetter(DNI.charAt(i))){
                            throw new NumeracionContieneLetrasExcept("Los  primeros 8 caracteres deben ser numeros");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Escribe el email");
                    email=sc.next();
                    if (!email.contains("@")&& !email.contains("'.'")){
                        throw new EmailIncorrectoExcept("El email debe contener @ y .");
                    }

                    break;
                case 5:
                    if (nombre!=null && apellido!=null &&DNI!=null && email!=null){
                        System.out.println("Los datos estan rellenos correctamente");
                        datosRellenos = true;
                    }
                    break;
            }

            }catch (TipoDatoIncorrectoException e){
                System.err.println(e.getMessage());
            } catch (LongitudDNINoValidaException e) {
                System.err.println(e.getMessage());
            } catch (UltimoDigititoNoLetraExcept e) {
                System.err.println(e.getMessage());
            } catch (NumeracionContieneLetrasExcept e) {
                System.err.println(e.getMessage());
            } catch (EmailIncorrectoExcept e) {
                System.err.println(e.getMessage());
            }
        }while(opcion != 5 || !datosRellenos);

        System.out.println("Los datos rellenos son:");
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("DNI = " + DNI);
        System.out.println("email = " + email);
    }
}
