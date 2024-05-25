import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {
        //COMIENZO 9:50. 10:09

        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        String nombre=null;
        String apellido = null;
        String DNI = null;
        boolean datosCompletos=false;

        do {
            try {


                System.out.println("""
                        INTRODUCE UNA OPCION
                        1- Rellenar nombre
                        2- Rellenar apellido
                        3- Rellenar DNI
                        4- Finalizar
                        """);
                opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("Introduce el nombre");
                        nombre=sc.next();
                        break;
                    case 2:
                        System.out.println("Introduce el apellido");
                        apellido=sc.next();
                        break;
                    case 3:
                        System.out.println("Introduce el DNI");
                        DNI=sc.next();

                        if (DNI.length()!=9){
                            throw new LongitudNoValidaException("La longitud del DNI debe ser de 9 caracteres");
                        }
                        for (int i = 0; i < DNI.length()-1; i++) {
                            if (Character.isLetter(DNI.charAt(i))) {
                                throw new LetrasEnNumeracion("En los 8 primeros caracteres solo puede haber numeros");
                            }
                        }
                                // 012345678
                        if (Character.isDigit(DNI.charAt(DNI.length()-1))) {
                            throw new DigitoNoLetraException("El ultimo caracter, debe ser letra");
                        }
                        break;
                    case 4:
                        if (nombre != null && apellido!=null && DNI != null){
                            datosCompletos=true;
                            System.out.println("Saliendo del menú");
                        }else{
                            System.out.println("No puedes salir del menú si no has completado los datos");
                        }
                        break;
                }

            } catch (LongitudNoValidaException e){
                System.err.println(e.getMessage());
            } catch (LetrasEnNumeracion e) {
                System.err.println(e.getMessage());
            } catch (DigitoNoLetraException e) {
                System.err.println(e.getMessage());
            }

        } while (opcion != 4 || !datosCompletos);

        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("DNI = " + DNI);
    }
}
