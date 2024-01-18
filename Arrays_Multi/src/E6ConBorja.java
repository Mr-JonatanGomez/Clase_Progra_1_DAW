public class E6ConBorja {
    /*   (GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
            x   1- Crear un de chars con todas las letras del abecedario.
                2- Crear un array de String con una longitud pedida por teclado (nº de palabras a generar)
                3- Pedir la longitud de cada una de las palabras que formarán parte
                   del array del apartado 2. Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2
            - Imprimir por pantalla las palabras generadas

*/


    public static char[] generarAbecedario() {
        char[] letras = new char[]{'A', 'E', 'I', 'O', 'U'};
        return letras;
    }

    public static String generarPalabras(char[] l, int longitud) {
        String palabra = "";
        for (int i = 0; i < longitud; i++) {
            char letra = l[(int) (Math.random() * longitud)];
            palabra += letra;
        }
        return palabra;
    }

    public static void main(String[] args) {

    }

}
