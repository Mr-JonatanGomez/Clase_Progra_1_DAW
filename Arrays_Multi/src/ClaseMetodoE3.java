import java.util.Scanner;

public class ClaseMetodoE3 {
    //Crea un array y rellenalo con 10 numeros por teclado, y mostrarlo normal inverso normal
    static int[] numeros=new int[10];

    public static void main(String[] args) {
        System.out.println("Ejercicio con 3 metodos");
        rellenarArray();
        mostrarArray();
        inverso();

    }
    // rellenar array
    public static void  rellenarArray(){
        System.out.println("Indica numeros");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();// cada posicion será rellenada con el nº del scanner
        }
    }

    // mostrar array

    public static void mostrarArray(){
        for (int numero:numeros) {
            System.out.print(numero+" ");// imprime siempre en orden desde 0 con el FOREACH
        }
    }
    // mostrar inverso
    public static void inverso (){
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.print(numeros[i]+" ");
        }
    }

}
