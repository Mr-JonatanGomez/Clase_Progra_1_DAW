import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce factorial");
        numero=sc.nextInt();
        System.out.println("El factorial de "+numero+ " es: "+ factorial(numero));
    }

    public static int factorial (int numero){
        if(numero==1){
            return 1;
        }else {
            return numero* (factorial(numero-1));
        }
    }
}
