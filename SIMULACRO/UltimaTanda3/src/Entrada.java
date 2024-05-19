import java.util.Scanner;

public class Entrada {
    // EMPEZADO A LAS 17:30 17:59

    //CONSEGUIDO sin mirar...mola pero es enrevesado, quizas el replace hay mejor modo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra sin acentos");
        String palabra = sc.next();


        if (palabra.length()<4){
            String transformacion=palabra.toUpperCase();

            System.out.println("La palabra original es: "+palabra+" " +
                    "\nTiene 4 letras o menos, se mostrará todo en mayusculas : " +
                    "\n"+transformacion);

        }
        if (palabra.length()>3 && palabra.length()<8){
            String transformacion=palabra.toLowerCase();

            System.out.println("La palabra original es: "+palabra+" " +
                    "\nTiene entre 4 y 7 letras, se mostrará todo en minusculas : " +
                    "\n"+transformacion);

        }
        if (palabra.length()>7 && palabra.length()<11){
            String transformacion=palabra.replace("a","á");
            transformacion=transformacion.replace("e", "é");
            transformacion=transformacion.replace("i", "í");
            transformacion=transformacion.replace("o", "ó");
            transformacion=transformacion.replace("u", "ú");

            System.out.println("La palabra original es: "+palabra+" " +
                    "\nTiene entre 8 y 11 letras, y sus vocales serán todas acentuadas: " +
                    "\n"+transformacion);

        }

        if (palabra.length()>11){

            String [] transformacion= palabra.split("");
            String palabraVuelta="";
            for (int i = palabra.length()-1; i >=0 ; i--) {
                //System.out.print(transformacion[i]);
                palabraVuelta += transformacion[i];
            }

            System.out.println("La palabra original es: "+palabra+" " +
                    "\nTiene de 12 letras, y se mostrará al reves: " +
                    "\n"+palabraVuelta);

        }
    }
}
