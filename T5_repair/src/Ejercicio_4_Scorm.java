import java.util.Scanner;

public class Ejercicio_4_Scorm {
    static int contadorVecesUsadaRecursividad = 0;
    static int numeroInicial;
    static int numeroActual;
    static int gradoPotencial;

    public static void main(String[] args) {
    /*
    Crea una función recursiva que calcule el resultado de un número
    elevado a otro. (Ejercicio4U5.java)
    */

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce numero inicial para hacer la cuenta");
        numeroInicial = sc.nextInt();
        numeroActual = 0;
        System.out.println("introduce numero grado de la potencia");
        gradoPotencial = sc.nextInt();
        System.out.println("El numero inicial se elevara por el grado, " +
                "y el resultado se elevara por el grado nuevamente hasta ser mayor de 5000");
        numeroElevado(numeroInicial);
        System.out.println("El numero actual es: " + numeroActual);
        System.out.println("Las veces que se realizo la recursividad: "+contadorVecesUsadaRecursividad);

    }

    public static int numeroElevado(int numeroInicial) {
        numeroActual = (int) Math.pow(numeroInicial, gradoPotencial);
        contadorVecesUsadaRecursividad++;
        if (numeroActual > 5000000) {
            return numeroActual;
        }
        System.out.println("numero actual: "+numeroActual+" contador de veces: "+contadorVecesUsadaRecursividad);
        return numeroElevado(numeroActual);
    }

    public static int factorial(int valorInicial) {
        if (valorInicial == 0) {
            return 1;
        } else {
            return valorInicial * factorial(valorInicial - 1);
        }
    }

}


