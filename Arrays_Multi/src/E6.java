import java.util.Random;
import java.util.Scanner;

public class E6 {
/*   (GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
            x   1- Crear un de chars con todas las letras del abecedario.
                2- Crear un array de String con una longitud pedida por teclado (nº de palabras a generar)
                3- Pedir la longitud de cada una de las palabras que formarán parte
                   del array del apartado 2. Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2
            - Imprimir por pantalla las palabras generadas

*/
    static char[] abecedario = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q',
        'R','S','T','U','V','W','X','Y','Z'};
    static int [] indiceAbecedario = new int[27];

    static String[] palabrasGeneradas;
    static Scanner sc = new Scanner(System.in);



    public static void inicioNumeroPalabras(){
        System.out.println("Introduzca cuantas palabras aleatorias quiere");
        int numeroPalabras = sc.nextInt();
        palabrasGeneradas = new String[numeroPalabras];


    }
    public static void NumeroLetrasPorPalabra(){
        int numero = 1;

        for (int i = 0; i < abecedario.length; i++) {
            indiceAbecedario[i]= i;

        }

        for (int i = 0; i < palabrasGeneradas.length; i++) {
            System.out.println("Indica cuantas letras tendrá la palabra numero "+numero);
            numero++;
         //   palabrasGeneradas[i]

        }

    }

    public static void main(String[] args) {
        inicioNumeroPalabras();
    }
}
