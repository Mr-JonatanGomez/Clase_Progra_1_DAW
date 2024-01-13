import java.util.Scanner;

public class Clase4ArraysInicio {
    public static void main(String[] args) {
        int[] numeros = new int[20];

        for (int i = 0; i <numeros.length ; i++) {
            numeros[i]= (int) (Math.random()*99)+1;// 0-98. al sumar uno 1-99
        }

        System.out.println("Comprobadr de numeros");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int item : numeros) {
        if (item== num){
            System.out.println("numero está sacado");
        }
        }
    }
}
