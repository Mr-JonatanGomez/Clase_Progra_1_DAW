import java.util.Scanner;

public class EntradaBorja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]numerosUser = new int[5];
        int numero;
        for (int i = 0; i < numerosUser.length; i++) {
            do {
                System.out.println("introdice numero");
                numero = sc.nextInt();
                if (numero<1 | numero>10){
                    System.out.println("Numero incorrecto");
            }

            }while(numero<1 | numero>10);
            numerosUser[i]= numero;
        }
    }
}
