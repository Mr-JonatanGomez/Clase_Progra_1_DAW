import java.util.Scanner;

public class Recursividad {
    public static void main(String[] args) {
        int numero;
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el numero");
        numero= sc.nextInt();

        imprimir(numero);

    }

    public static void imprimir (int numero){// EL PARAMETRO es el numero intro
        System.out.println("el numero con el que trabajamos es: "+numero);
        if (numero>0) {
            numero--;
            imprimir(numero);
        }


    }
}
