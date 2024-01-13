import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int valorInicial;
        System.out.println("Introduce un valor a factorizar");
        Scanner sc = new Scanner(System.in);
        valorInicial = sc.nextInt();
        System.out.println("factorial es: "+factorial(valorInicial));
    }

    public static int factorial (int numeroINI){
        if (numeroINI==1){
            return 1;
        }else{
            return numeroINI*factorial(numeroINI-1);
        }
// en el main, hay que declarar la variable tambien, y pude llamarse de otro modo
    }
}
