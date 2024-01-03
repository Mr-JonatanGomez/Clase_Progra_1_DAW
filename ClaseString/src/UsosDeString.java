public class UsosDeString {
    public static void main(String[] args) {
        String frase = "Esta frase es un ejemplo de analisis o un truño";


        //sacar todas las letras de la frase
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(frase.charAt(i));
        }
        System.out.println(); //salto
        //sacar todas las letras de la frase al reves
        for (int i = frase.length()-1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
        // SABER CUANTAS PALABRAS TENGO
        // 1º variable cortando con split y longitud

        int numeroPalabras = frase.split(" ").length;
        System.out.println("\n\nCuantas palabras tenemos en: \nEsta frase es un ejemplo de analisis o un truño");
        System.out.println("El numero de palabras es: "+numeroPalabras);

        // SABER CUANTAS VOCALES Y CONSONANTES
    }
}
