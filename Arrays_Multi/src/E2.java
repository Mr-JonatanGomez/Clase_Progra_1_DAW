import java.util.Scanner;

/*2. (MayorArray) Crea una aplicación que realice lo siguiente:
    - pida por pantalla la longitud del array de enteros
    - crea el array de enteros con la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - saque por pantalla el elemento mayor y el elemento menor*/
public class E2 {
    public static void main(String[] args) {
        System.out.println("Introduce la longitud del array");
        Scanner sc = new Scanner(System.in);
        int longitud = sc.nextInt();
        int[] enteros = new int[longitud];

        System.out.println("introduce "+longitud+" numeros enteros para el array");
        for (int i = 0; i < enteros.length; i++) {
            enteros[i]= sc.nextInt();
        }

        int numeroMayor= enteros[0];
        for (int item:enteros) {
            if (item > numeroMayor){
                numeroMayor=item;// con esto el numero mayor toma otro valor a comparar
            }
        }
        System.out.println("el mayor numero es: "+ numeroMayor);

        int numeroMenor= enteros[0];
        for (int item:enteros) {
            if (item < numeroMenor){
                numeroMenor=item;// con esto el numero mayor toma otro valor a comparar
            }
        }
        System.out.println("el mayor numero es: "+ numeroMenor);
    }
}
