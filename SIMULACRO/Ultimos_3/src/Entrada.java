import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // EMPEZADO 11:40
        /*3.	Pedir una palabra por teclado (sin acentos). Transformar esta palabra para:
a.	Si su longitud es menor de 4, transformar todas sus letras en mayúsculas
b.	Si su longitud es mayor igual que 4 pero menor que 8, transformar sus letras en minúsculas
c.	Si su longitud es mayor igual que 8 pero menor que 11, todas las vocales deberán estar acentuadas
d.	Si la longitud es mayor igual a 11 se deberá dar la vuelta a la palabra()REVERSE
*/


        Scanner sc = new Scanner(System.in);
        String palabra= null;
        String conversion=null;
        System.out.println("Mete una palabra por teclado (SIN ACENTOS)");
        palabra=sc.next();

        if (palabra.length()<4){
            conversion=palabra.toUpperCase();
            System.out.println(conversion);
            // tambien se puede System.out.println(palabra.toUpperCase());
           //
        }
        if (palabra.length()>=4 && palabra.length()<8){
            conversion=palabra.toLowerCase();
            System.out.println(conversion);
        }
        if (palabra.length()>=8 && palabra.length()<11){
            conversion=palabra.replace("a","á").replace("e","é")
                    .replace("i","í").replace("o","ó")
                    .replace("u","ú");
           // conversion=palabra.replace("a","áéíóú");
            System.out.println(conversion);
        }
        if (palabra.length()>11){

            String[]conver2=palabra.split("");
            String reverse="";


            for (int i = palabra.length()-1; i >=0; i--) {
                reverse+= conver2[i];
            }

            System.out.println(reverse);
            // conversion=palabra.replace("a","áéíóú")  murcielagueños;

        }
    }
}
