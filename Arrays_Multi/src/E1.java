import java.util.Scanner;

/*1. (MultiplicarArray) Crear un array de 5 posiciones:
    - se le pedirá al usuario que introduzca cada unos de los elementos del array
    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
    - Saca por consola la suma de todos los números
    - Saca la media de todos los elementos*/
public class E1 {
    public static void main(String[] args) {
        int[] numeros  = new int[5];
        Scanner sc = new Scanner(System.in);

        int sumaDeI=0;
        int sumaDeJ=0;
        int sumaTotal;
        float mediaTotal;
        System.out.println("introduce 5 numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            sumaDeI+= numeros[i];
            sumaDeJ+= numeros[i]*2;


        }
        sumaTotal= sumaDeJ+sumaDeI;
        mediaTotal=(float)sumaTotal/(float) (numeros.length*2);
        System.out.println("Suma de valores intro: " + sumaDeI);
        System.out.println("Suma de valores multipli: " + sumaDeJ);
        System.out.println("La suma de ambas: "+ sumaTotal);
        System.out.println("La media: "+ mediaTotal);
    }
}
