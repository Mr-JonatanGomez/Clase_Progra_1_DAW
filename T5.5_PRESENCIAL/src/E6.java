import java.util.Scanner;

public class E6 {
    /*Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A
priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de
introducir los datos cuando meta un número negativo.
*/

    public static double media(double acumulado, double nIntroducidos) {

        return (double) acumulado/ nIntroducidos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAcumulado = 0;
        int contador = 0;
        int numeroActual;

        System.out.println("Introduce numeros enteros, cuando quieras detenerte introduce un numero negativo");
        do {

            numeroActual = sc.nextInt();

            if (numeroActual>0){
            numeroAcumulado += numeroActual;
            contador++;

            }
        } while (numeroActual>=0);

        System.out.println("La media del acumulado ("+numeroAcumulado+") y los numeros ("+contador+") es:" + media(numeroAcumulado,contador));
    }

}
