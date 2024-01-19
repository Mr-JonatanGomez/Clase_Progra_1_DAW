import java.util.Random;
import java.util.Scanner;

public class E7 {
    /*1. AHORCADO
    Crear un array de String donde se guarden 20 palabras. El sistema deberá de seleccionar una
    de las palabras pertenecientes al array. Una vez seleccionada se jugará al juego del ahorcado
    donde la palabra a acertar será la seleccionada. Para ello las normas son las siguientes:
    - Nada mas arrancar se mostrarán por consola tantos _ como letras tenga la palabra a acertar
    - Se pedirá por pantalla la letra con la que se quiere probar
    - En el caso de acertar se mostrará la letra en la posición correspondiente
    - En el caso de falla se restará una vida
    - El programa continuará hasta que:
    - Acierte la palabra
    - Me quede sin vidas*/

    //static Scanner sc = new Scanner(System.in);
    static char [] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    static String [] palabras = {"paraguas","plaza","simio","tortuga","elefante","canibal","zorro"};//,"","","","","","","","","",""
    static String palabraEscogida;
    public static String escogerPalabra (String[] palabras){
        palabraEscogida=palabras [(int)(Math.random()* palabras.length)];
        return palabraEscogida;
    }

    public static void mostrarPalabra (String palabra){// solo para probar que funciona
        System.out.println(palabraEscogida);
    }

    public static void comprobarNcaracteres (){
       int numeroCaracteres = palabraEscogida.length();
        System.out.println("numero de caracteres "+numeroCaracteres);
    }

    public static void imprimirGuiones (){
        int numeroCaracteres = palabraEscogida.length();

        for (int i = 0; i < palabraEscogida.length(); i++) {
            System.out.print(" _ ");
        }
        System.out.println();
    }
    public static void juego(){
        int numeroVidas = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Con que letra quieres probar?");
        char letra;
        letra = sc.next().charAt(0); // charAt (0) es para tomar la primera posicion de lo que pase por teclado
        if (palabraEscogida.indexOf(letra) != -1) {//si es diferente a -1 es que está
            for (int i = 0; i < palabraEscogida.length(); i++) {
                if (palabraEscogida.indexOf(i)== letra){
                    System.out.print(" "+letra+" ");
                }else {
                    System.out.print(" _ ");
                }
            }
        }


        System.out.println("Numero de Vidas Restantes: "+numeroVidas );


        /*
        - Se pedirá por pantalla la letra con la que se quiere probar
        - En el caso de acertar se mostrará la letra en la posición correspondiente
        - En el caso de falla se restará una vida
    */
    }

    public static void main(String[] args) {

        System.out.println("\tEL FAMOSO JUEGO DEL AHORCADO");

        escogerPalabra(palabras);// palabras es el array que le damos
        comprobarNcaracteres();
        imprimirGuiones();
        mostrarPalabra(palabraEscogida);// ahora para comprobar
        juego();

        System.out.println("Tu palabra tiene este formato: ");

        // mostrarPalabra(palabraEscogida);// al final del juego

    }
}
