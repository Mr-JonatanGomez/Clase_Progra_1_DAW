import java.util.Scanner;

public class Ejercicio5Bis {

    static int contador = 2;
    static int numeroElementos;
    static int numeroActual;
    static int numeroAnterior;
    static int auxiliar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de elementos máximos que quieres mostrar por Fibonacci");
        numeroElementos = sc.nextInt();
        numeroActual=1;
        numeroAnterior=1;
        auxiliar=0;

        System.out.print(numeroAnterior+", "+numeroActual+", ");
        fibonacci(numeroActual,numeroAnterior);
    }

    public static int fibonacci(int numeroActual, int numeroAnterior) {

        auxiliar=numeroActual;
        numeroActual += numeroAnterior;
        numeroAnterior=auxiliar;
        contador++;
        if (contador == numeroElementos) {
            System.out.print(numeroActual+"\n El contador ha sido: "+contador);
            return numeroActual;
        }
        System.out.print(numeroActual+", ");
        return fibonacci(numeroActual,numeroAnterior);
    }
}
