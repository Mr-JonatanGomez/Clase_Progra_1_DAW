/*3. (SumaArrays) Crear una aplicación que:
    - pida la longitud de dos arrays de enteros
    - crea los array de enteros con las longitudes introducidas
    - crea un tercer array de la misma longitud que los dos anteriores
    - rellena el tercer array con la suma de las posiciones
      (Array1.posicion1 + array2.posicion = array3.posicion)*/

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;
        int longitud2;


        System.out.println("Introduce longitud Array1");
        longitud = sc.nextInt();
        System.out.println("Introduce longitud Array1");
        longitud2 = sc.nextInt();

        int[] array1 = new int[longitud];
        int[] array2 = new int[longitud2];
        int[] array3 = new int[longitud+longitud2];


        for (int i = 0; i < array3.length; i++) {
            array3[i] = array2[i] + array1[i];
        }
    }
}
