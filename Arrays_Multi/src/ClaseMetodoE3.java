import java.util.Scanner;

public class ClaseMetodoE3 {
    //Crea un array y rellenalo con 10 numeros por teclado, y mostrarlo normal inverso normal
    static int [] numeros;

    public static void main(String[] args) {
        System.out.println("Ejercicio 3 con nmetodos");
    rellenarArray();
    mostrarArray();
    }
    public static void rellenarArray(){
        Scanner sc = new Scanner(System.in);
        numeros= new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indica numero");
            int numero = sc.nextInt();
            numeros[i] = numero;
        }


    }
    public static void mostrarArray(){
        for (int numero:numeros) {
            System.out.print(numero+", ");
        }
    }
}
