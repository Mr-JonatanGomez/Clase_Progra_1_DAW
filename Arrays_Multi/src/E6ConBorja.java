import java.util.Scanner;

public class E6ConBorja {
    /*   (GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
            x   1- Crear un de chars con todas las letras del abecedario.
                2- Crear un array de String con una longitud pedida por teclado (nº de palabras a generar)
                3- Pedir la longitud de cada una de las palabras que formarán parte
                   del array del apartado 2. Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2
            - Imprimir por pantalla las palabras generadas

*/
    static char[] letras;

    public static char[] generarAbecedario() {
        char[] letras = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q',
                'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        return letras;

    }

    public static String generarPalabras(char[] l, int longitud) {// l es una referencia que necesita un array
        // para nº palabras y longitud de cada una
        String palabra = ""; // declarar una palabra sin valor, tambien String palabra = new String("")

        for (int i = 0; i < longitud; i++) {
            char letra = l[(int) (Math.random() * l.length)];//( si pusieramos l[i]) genera letras en orden
            palabra += letra;
        }
        return palabra;
    }


    public static void main(String[] args) {
        System.out.println("introduce cuantas letras quieres en tu palabra");
        Scanner sc = new Scanner(System.in);
        int longitudPalabra = sc.nextInt();
        String palabraGenerada = generarPalabras(generarAbecedario(), longitudPalabra);//el array que necesita generarPalabras es generar abecedario, y ahora la longitud de las palabras
        System.out.println(palabraGenerada);

        System.out.println("Vamos a generar palabras aleatorias con la cantidad de letras aleatorias METIDAS EN JAVA 0-10, Cuantas quieres?");
        int cuantas = sc.nextInt();
        //System.out.println("Vamos a generar palabras aleatorias, Cuantas quieres?");
        //int longCuantas= sc.nextInt();
        for (int i = 0; i < cuantas; i++) {
            palabraGenerada = generarPalabras(generarAbecedario(),(int)(Math.random()*10));
            System.out.print(palabraGenerada+", ");
        }

    }

}
