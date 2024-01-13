import java.util.Scanner;

public class Ejercicio3LeerOperaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce operando1");
        int operando1 = scanner.nextInt();
        System.out.println("Introduce operando2");
        int operando2 = scanner.nextInt();

        System.out.println(" ");// salto
        System.out.println("El Resultado de la suma es:");
        System.out.println(operando1+operando2);

        System.out.println(" ");// salto
        System.out.println("El Resultado de la resta es:");
        System.out.println(operando1-operando2);

        System.out.println(" ");// salto
        System.out.println("El Resultado de la multiplicacion es:");
        System.out.println(operando1*operando2);

        System.out.println(" ");// salto
        System.out.println("El Resultado de la division es:");
        System.out.println(operando1/operando2);

        System.out.println(" ");// salto
        System.out.println("El Resultado del resto es:");
        System.out.println(operando1%operando2);
    }
}
