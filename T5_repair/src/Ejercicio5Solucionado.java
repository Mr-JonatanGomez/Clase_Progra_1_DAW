import java.util.Scanner;
public class Ejercicio5Solucionado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de elementos a mostrar de la serie: ");
        int limite = teclado.nextInt();
        teclado.close();
        for(int i = 0; i<limite; i++){
            System.out.print(funcionFibonacci(i) + ", ");
        }
    }
    private static int funcionFibonacci(int num){
        if(num == 0 || num==1)
            return num;
        else
            return funcionFibonacci(num-1) + funcionFibonacci(num-2);
    }
}
