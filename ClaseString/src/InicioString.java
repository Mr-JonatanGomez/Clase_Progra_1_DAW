public class InicioString {
    public static void main(String[] args) {
        String frase = "Esta frase es un ejemplo de analisis o un truño";
        String palabra;


        // cuantos caracteres tengo con-> frase.length();
        System.out.println("\n¿Cuantos caracteres tengo?");
        System.out.println(frase.length());

        // Posicion de la primera letra seleccionada con-> frase.indexOf('e');
        System.out.println("\n¿En que posicion aparece la primera letra elegida (e)?");
        System.out.println(frase.indexOf('e'));

        // Cambiar un caracter por otro con-> frase.replaceFirst("e");
        //solo cambia el primero que encuentra
        System.out.println("\nEsta frase es un ejemplo de analisis o un truño (ORIGINAL)");
        System.out.print(frase.replaceFirst("e", "a"));
        System.out.println(" (MODIFICADA replaceFirst)");

        // Cambiar un caracter por otro con-> frase.replaceAll("e");
        //cambia todos
        System.out.println("\nEsta frase es un ejemplo de analisis o un truño (ORIGINAL)");
        System.out.print(frase.replaceAll("e", "a"));
        System.out.println(" (MODIFICADA replaceAll)");

        // SPLIT es un separador(); NON FUNCIONA AUN
        System.out.println("\nseparando con Split por los espacios, tenemos");
        System.out.println(frase.split(" ")+ "devuelve un array con frase0, frase1...");

        // cuantos caracteres tengo con-> frase.contains();// TRUE o FALSE
        System.out.println("\n¿Esta la palabra entre parentesis dentro de frase??");
        System.out.println(frase.contains("ejemplo"));

        // Muestra los caracteres desde la poscion 0-6-> frase.substring(0,6);
        System.out.println("\nMostrando caracteres desde posicion 0 hasta 6(NO INCLUIDA)");
        System.out.println(frase.substring(0,6));

        // Muestra los caracteres desde la poscion 6 hasta el fin-> frase.substring(6);
        System.out.println("\nMostrando caracteres desde posicion 0 hasta 6(NO INCLUIDA)");
        System.out.println(frase.substring(6));

        // Saber si una palabra es igual que otra-> if(frase.equals("un");
        System.out.println("\n es igual la palabra?");
        palabra="felipe";
        if (palabra.equals("Felipe")){
            System.out.println("Si es igual(diferencia mayus)");
        }else{
            System.out.println("No es igual(diferencia mayus)");
        }

        // Saber si una palabra es igual que otra INDISTINTA MAYUS-> if(frase.equals("un");
        System.out.println("\n es igual la palabra?");
        palabra="felipe";
        if (palabra.equalsIgnoreCase("Felipe")){
            System.out.println("Si es igual (indistinto mayus)");
        }else{
            System.out.println("No es igual(indistinto mayus)");
        }






    }
}
