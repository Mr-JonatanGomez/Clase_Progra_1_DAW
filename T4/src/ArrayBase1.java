import java.util.Scanner;

public class ArrayBase1 {
    /*Realiza un programa que pida 10 números por teclado y que los almacene
    en un array. A continuación se mostrará el
    contenido de ese array junto al índice (0 – 9)*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int almacenados []= new int[10];

        System.out.println("Mete un numero para almacenar en array");
        //int numero = scanner.nextInt();

        for (int i = 0; i < almacenados.length ; i++) {

            almacenados[i] = scanner.nextInt();
        }
        System.out.println("TODOS LOS NUMEROS");

        for (int i = 0; i < almacenados.length; i++) {
            System.out.println(almacenados[i]);

        }
    }
}
